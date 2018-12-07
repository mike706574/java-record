package fun.mike.record;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import java.util.stream.Collectors;

public class RecordDiffer {

    public static final class Diff {
        public final Record left;
        public final Record right;

        public List<Entry> leftOnly;
        public List<Entry> rightOnly;
        public List<Match> diffs;

        private Diff(Record left, Record right) {
            this.left = left;
            this.right = right;
        }

        private Diff(Record left,
                     Record right,
                     Collection<Entry> leftOnly,
                     Collection<Entry> rightOnly,
                     Collection<Match> diffs) {
            this.left = left;
            this.right = right;
            this.leftOnly = new LinkedList<>(leftOnly);
            this.rightOnly = new LinkedList<>(rightOnly);
            this.diffs = new LinkedList<>(diffs);
        }

        public static Diff leftNull(Record right) { return new Diff(null, right); }
        public static Diff rightNull(Record left) { return new Diff(left, null); }

        public static Diff of(Record left,
                              Record right,
                              Collection<Entry> leftOnly,
                              Collection<Entry> rightOnly,
                              Collection<Match> diffs) {
            return new Diff(left, right, leftOnly, rightOnly, diffs);
        }

        @Override
        public String toString() {
            return "Diff{" +
                    "left=" + left +
                    ", right=" + right +
                    ", leftOnly=" + leftOnly +
                    ", rightOnly=" + rightOnly +
                    ", diffs=" + diffs +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Diff diff = (Diff) o;
            return Objects.equals(left, diff.left) &&
                    Objects.equals(right, diff.right) &&
                    Objects.equals(leftOnly, diff.leftOnly) &&
                    Objects.equals(rightOnly, diff.rightOnly) &&
                    Objects.equals(diffs, diff.diffs);
        }

        @Override
        public int hashCode() {

            return Objects.hash(left, right, leftOnly, rightOnly, diffs);
        }
    }

    public static final class Match {
        public final String key;
        public final Object left;
        public final Object right;

        private Match(String key, Object left, Object right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }

        static Match of(String key, Object left, Object right) {
            return new Match(key, left, right);
        }

        @Override
        public String toString() {
            return "Match{" +
                    "key='" + key + '\'' +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Match match = (Match) o;
            return Objects.equals(key, match.key) &&
                    Objects.equals(left, match.left) &&
                    Objects.equals(right, match.right);
        }

        @Override
        public int hashCode() {

            return Objects.hash(key, left, right);
        }
    }

    public static final class Entry {
        public final String key;
        public final Object value;

        private Entry(String key, Object value) {
            this.key = key;
            this.value = value;
        }

        static Entry of(String key, Object value) {
            return new Entry(key, value);
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key='" + key + '\'' +
                    ", value=" + value +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry entry = (Entry) o;
            return Objects.equals(key, entry.key) &&
                    Objects.equals(value, entry.value);
        }

        @Override
        public int hashCode() {

            return Objects.hash(key, value);
        }
    }

    public static Optional<Diff> diff(Record left, Record right) {
        if (left == null && right == null) {
            return Optional.empty();
        }

        if (left == null) {
            return Optional.of(Diff.leftNull(right));
        }

        if (right == null) {
            return Optional.of(Diff.rightNull(left));
        }

        List<Entry> leftOnly = new LinkedList<>();
        List<Entry> rightOnly = new LinkedList<>();
        List<Match> diffs = new LinkedList<>();

        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(left.keySet());
        allKeys.addAll(right.keySet());

        for (String key : allKeys) {
            boolean inLeft = left.containsKey(key);
            boolean inRight = right.containsKey(key);

            if (inRight && inLeft) {
                Object leftValue = left.get(key);
                Object rightValue = right.get(key);

                if (!Objects.equals(leftValue, rightValue)) {
                    diffs.add(Match.of(key, leftValue, rightValue));
                }
            } else if (inRight) {
                Object rightValue = right.get(key);
                rightOnly.add(Entry.of(key, rightValue));
            } else if (inLeft) {
                Object leftValue = left.get(key);
                leftOnly.add(Entry.of(key, leftValue));
            }
        }

        boolean someOnlyLeft = !leftOnly.isEmpty();
        boolean someOnlyRight = !rightOnly.isEmpty();
        boolean someDiffs = !diffs.isEmpty();

        if (someOnlyLeft || someOnlyRight || someDiffs) {
            return Optional.of(Diff.of(left,
                                       right,
                                       leftOnly,
                                       rightOnly,
                                       diffs));
        }

        return Optional.empty();
    }

    public static String describe(Diff diff) {
        return describe(diff, "Records do not match.");
    }

    public static String describe(Diff diff, String message) {
        Record left = diff.left;
        Record right = diff.right;

        if(left == null && right == null) {
            throw new IllegalStateException("Both records are null.");
        }

        if(left == null) {
            return "Expected record is null, but actual is not.\n\nActual record:\n" + right.code();
        }

        if(right == null) {
            return "Actual record is null, but expected is not.\n\nExpected record:\n" + left.code();
        }

        List<Entry> leftOnly = diff.leftOnly;
        List<Entry> rightOnly = diff.rightOnly;
        List<Match> diffs = diff.diffs;

        boolean someOnlyLeft = !leftOnly.isEmpty();
        boolean someOnlyRight = !rightOnly.isEmpty();
        boolean someDiffs = !diffs.isEmpty();

        StringBuilder buffer = new StringBuilder();

        buffer.append(String.join("\n",
                                  message + "\n",
                                  "Expected | " + left,
                                  "Actual   | " + right));
        buffer.append('\n');

        if (someOnlyRight) {
            buffer.append("\nOnly in actual\n");
            buffer.append("--------------\n");
            for (Entry entry : rightOnly) {
                Object value = entry.value;
                String label = valueLabel(value);
                buffer.append(String.format("%s=|%s| %s\n",
                                            entry.key,
                                            value,
                                            label));
            }
        }

        if (someOnlyLeft) {
            buffer.append("\nOnly in expected\n");
            buffer.append("----------------\n");
            for (Entry entry : leftOnly) {
                Object value = entry.value;
                String label = valueLabel(value);
                buffer.append(String.format("%s=|%s| %s\n",
                                            entry.key,
                                            value,
                                            label));
            }
        }

        if (someDiffs) {
            buffer.append("\nDiffs\n");
            buffer.append("-----\n");
            buffer.append(diffs.stream()
                          .map(RecordDiffer::diffText)
                          .collect(Collectors.joining("\n\n")));
        }

        return buffer.toString();
    }

    private static String diffText(Match diff) {
        return String.format("%s=|%s| %s\n%s=|%s| %s",
                             diff.key,
                             diff.left,
                             valueLabel(diff.left),
                             diff.key,
                             diff.right,
                             valueLabel(diff.right));
    }

    private static String valueLabel(Object value) {
        if(value == null) {
            return "null";
        }
        return value.getClass().getName();
    }
}
