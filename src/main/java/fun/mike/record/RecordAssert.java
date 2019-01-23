package fun.mike.record;

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

        optionalDiff.ifPresent(diff1 -> {
            RecordDiffer.Diff diff = diff1;
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

        optionalDiff.ifPresent(diff1 -> {
            RecordDiffer.Diff diff = diff1;
            throw new AssertionError(RecordDiffer.describe(diff, message));
        });
    }
}
