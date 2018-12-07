package fun.mike.record;

import java.util.Optional;

public class RecordAssert {
    public static void assertRecordsMatch(Record expected, Record actual) {
        Optional<RecordDiffer.Diff> optionalDiff = RecordDiffer.diff(expected, actual);

        optionalDiff.ifPresent(diff1 -> {
            RecordDiffer.Diff diff = diff1;
            throw new AssertionError(RecordDiffer.describe(diff));
        });
    }

    public static void assertRecordsMatch(String message, Record expected, Record actual) {
        Optional<RecordDiffer.Diff> optionalDiff = RecordDiffer.diff(expected, actual);

        optionalDiff.ifPresent(diff1 -> {
            RecordDiffer.Diff diff = diff1;
            throw new AssertionError(RecordDiffer.describe(diff, message));
        });
    }
}
