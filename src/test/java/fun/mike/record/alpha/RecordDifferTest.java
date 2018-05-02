package fun.mike.record.alpha;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

import fun.mike.record.alpha.RecordDiffer.Diff;
import fun.mike.record.alpha.RecordDiffer.Entry;
import fun.mike.record.alpha.RecordDiffer.Match;

import org.junit.Test;

import static fun.mike.record.alpha.RecordDiffer.diff;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RecordDifferTest {
    private static final Collection<Entry> noEntries = new LinkedList<>();
    private static final Collection<Match> noMatches = new LinkedList<>();

    @Test
    public void bothNull() {
        Record left = null;
        Record right = null;
        Optional<Diff> diff = diff(left, right);
        assertFalse(diff.isPresent());
    }

    @Test
    public void leftNull() {
        Record left = null;
        Record right = Record.of();
        Optional<Diff> diff = diff(left, right);
        assertTrue(diff.isPresent());
        assertEquals(Diff.leftNull(right), diff.get());
    }

    @Test
    public void rightNull() {
        Record left = Record.of();
        Record right = null;
        Optional<Diff> diff = diff(left, right);
        assertTrue(diff.isPresent());
        assertEquals(Diff.rightNull(left), diff.get());
    }

    @Test
    public void equal() {
        Record left = Record.of("foo", "bar");
        Record right = Record.of("foo", "bar");
        assertEquals(Optional.empty(), diff(left, right));
    }

    @Test
    public void valueDiff() {
        Record left = Record.of("foo", "bar");
        Record right = Record.of("foo", "baz");

        Match expectedMatch = Match.of("foo", "bar", "baz");
        Diff expectedDiff = Diff.of(left,
                                    right,
                                    noEntries,
                                    noEntries,
                                    Arrays.asList(expectedMatch));

        assertEquals(Optional.of(expectedDiff),
                     diff(left, right));
    }

    @Test
    public void onlyLeft() {
        Record left = Record.of("foo", "bar");
        Record right = Record.of();

        Entry expectedEntry = Entry.of("foo", "bar");
        Diff expectedDiff = Diff.of(left,
                                    right,
                                    Arrays.asList(expectedEntry),
                                    noEntries,
                                    noMatches);

        assertEquals(Optional.of(expectedDiff),
                     diff(left, right));
    }

    @Test
    public void onlyRight() {
        Record left = Record.of();
        Record right = Record.of("foo", "bar");

        Entry expectedEntry = Entry.of("foo", "bar");
        Diff expectedDiff = Diff.of(left,
                                    right,
                                    noEntries,
                                    Arrays.asList(expectedEntry),
                                    noMatches);

        assertEquals(Optional.of(expectedDiff),
                     diff(left, right));
    }

    @Test
    public void everything() {
        Record left = Record.of("a", "1",
                                "b", "2",
                                "c", "3");
        Record right = Record.of("a", "2",
                                 "b", "2",
                                 "d", "4");

        Diff expectedDiff = Diff.of(left,
                                    right,
                                    Arrays.asList(Entry.of("c", "3")),
                                    Arrays.asList(Entry.of("d", "4")),
                                    Arrays.asList(Match.of("a", "1", "2")));

        assertEquals(Optional.of(expectedDiff),
                     diff(left, right));
    }
}
