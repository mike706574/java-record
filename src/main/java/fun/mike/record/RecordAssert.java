package fun.mike.record;

import java.util.Collection;
import java.util.Optional;

public class RecordAssert {
    /**
     * Asserts that two records are equal. If they are not, an
     * {@link AssertionError} without a message is thrown.
     * @param expected expected record
     * @param actual the record to check against <code>expected</code>
     */
    public static void assertRecordsMatch(Record expected, Record actual) {
        Optional<RecordDiffer.Diff> optionalDiff = RecordDiffer.diff(expected, actual);

        optionalDiff.ifPresent(diff -> {
            throw new AssertionError(RecordDiffer.describe(diff));
        });
    }

    /**
     * Asserts that two records are equal. If they are not, an
     * {@link AssertionError} without a message is thrown.
     * @param expected expected record
     * @param actual the record to check against <code>expected</code>
     * @param ignoredKeys keys to ignore
     */
    public static void assertRecordsMatch(Record expected,
                                          Record actual,
                                          Collection<String> ignoredKeys) {
        Optional<RecordDiffer.Diff> optionalDiff =
                RecordDiffer.diff(expected.dissoc(ignoredKeys),
                                  actual.dissoc(ignoredKeys));

        optionalDiff.ifPresent(diff -> {
            throw new AssertionError(RecordDiffer.describe(diff));
        });
    }

    /**
     * Asserts that two records are equal. If they are not, an
     * {@link AssertionError} is thrown with the given message.
     * @param message the identifying message for the {@link AssertionError}
     * @param expected expected record
     * @param actual the record to check against <code>expected</code>
     */
    public static void assertRecordsMatch(String message, Record expected, Record actual) {
        Optional<RecordDiffer.Diff> optionalDiff = RecordDiffer.diff(expected, actual);

        optionalDiff.ifPresent(diff -> {
            throw new AssertionError(RecordDiffer.describe(diff, message));
        });
    }

    /**
     * Asserts that two records are equal, ignoring the given set of keys. If
     * they are not, an {@link AssertionError} is thrown with the given
     * message.
     * @param message the identifying message for the {@link AssertionError}
     * @param expected expected record
     * @param actual the record to check against <code>expected</code>
     * @param ignoredKeys keys to ignore
     */
    public static void assertRecordsMatch(String message,
                                          Record expected,
                                          Record actual,
                                          Collection<String> ignoredKeys) {
        Optional<RecordDiffer.Diff> optionalDiff =
                RecordDiffer.diff(expected.dissoc(ignoredKeys),
                                  actual.dissoc(ignoredKeys));

        optionalDiff.ifPresent(diff -> {
            throw new AssertionError(RecordDiffer.describe(diff, message));
        });
    }
}
