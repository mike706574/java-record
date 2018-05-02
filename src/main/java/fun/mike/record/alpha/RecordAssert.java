package fun.mike.record.alpha;

import java.util.Optional;

public class RecordAssert {
    public static void assertRecordsMatch(Record expected, Record actual) {
        Optional<RecordDiffer.Diff> optionalDiff = RecordDiffer.diff(expected, actual);

        if(optionalDiff.isPresent()) {
            RecordDiffer.Diff diff = optionalDiff.get();
            throw new AssertionError(RecordDiffer.describe(diff));
        }
    }

    public static void assertRecordsMatch(String message, Record expected, Record actual) {
        Optional<RecordDiffer.Diff> optionalDiff = RecordDiffer.diff(expected, actual);

        if(optionalDiff.isPresent()) {
            RecordDiffer.Diff diff = optionalDiff.get();
            throw new AssertionError(RecordDiffer.describe(diff, message));
        }
    }
}
