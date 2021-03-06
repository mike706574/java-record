package fun.mike.record;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TimeZone;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


@SuppressWarnings("AssertEqualsBetweenInconvertibleTypes")
public class RecordTest {
    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void metadata() {

        Map<String, String> map = new HashMap<>();
        map.put("foo", "bar");
        map.put("baz", "bop");

        Record recordWithoutMetadata = new Record(map);

        assertNull(recordWithoutMetadata.getMetadata());
        assertNull(recordWithoutMetadata.getMetadataProperty("name"));

        Map<String, Object> metadata = new HashMap<>();
        metadata.put("name", "fred");

        Record recordWithMetadata = new Record(map, metadata);

        assertEquals(metadata, recordWithMetadata.getMetadata());
        assertEquals("fred", recordWithMetadata.getMetadataProperty("name"));

        recordWithMetadata.deleteMetadataProperty("name");
        assertNull(recordWithMetadata.getMetadataProperty("name"));

        recordWithMetadata.setMetadataProperty("name", "bob");
        assertEquals("bob", recordWithMetadata.getMetadataProperty("name"));
    }

    @Test
    public void fromMapConstructor() {
        Map<String, String> map = new HashMap<>();
        map.put("foo", "bar");
        map.put("baz", "bop");
        Record record = new Record(map);
        assertEquals(map, record);
    }

    @Test
    public void fromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("foo", "bar");
        map.put("baz", "bop");
        Record record = Record.of(map);
        assertEquals(map, record);
    }

    @Test
    public void empty() {
        //noinspection AssertEqualsBetweenInconvertibleTypes
        assertEquals(new HashMap<>(), Record.of());
        assertEquals(new HashMap<>(), Record.empty());
    }

    @Test
    public void getString() {
        Record record = Record.of("foo", "bar");
        assertEquals("bar", record.getString("foo"));
    }

    @Test
    public void getNullString() {
        Record record = Record.of("foo", null);
        assertNull(record.getString("foo"));
    }

    @Test
    public void getStringTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"1\" of class \"java.lang.Integer\" for key \"foo\" must be a string.");
        Record record = Record.of("foo", 1);
        record.getString("foo");
    }

    @Test
    public void optionalString() {
        Record record = Record.of("foo", "bar");
        assertEquals(Optional.of("bar"), record.optionalString("foo"));
    }

    @Test
    public void optionalNullString() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalString("foo"));
    }

    @Test
    public void optionalStringTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"1\" of class \"java.lang.Integer\" for key \"foo\" must be a string.");
        Record record = Record.of("foo", 1);
        record.optionalString("foo");
    }

    @Test
    public void Boolean() {
        Record record = Record.of("foo", true);
        assertTrue(record.getBoolean("foo"));

        Record record2 = Record.of("foo", false);
        assertFalse(record2.getBoolean("foo"));
    }

    @Test
    public void getNullBoolean() {
        Record record = Record.of("foo", null);
        assertNull(record.getBoolean("foo"));
    }

    @Test
    public void getBooleanTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a boolean.");
        Record record = Record.of("foo", "bar");
        record.getBoolean("foo");
    }

    @Test
    public void optionalBoolean() {
        Record record = Record.of("foo", true);
        assertEquals(Optional.of(true), record.optionalBoolean("foo"));
    }

    @Test
    public void optionalNullBoolean() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalBoolean("foo"));
    }

    @Test
    public void optionalBooleanTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"1\" of class \"java.lang.Integer\" for key \"foo\" must be a boolean.");
        Record record = Record.of("foo", 1);
        record.optionalBoolean("foo");
    }

    @Test
    public void getLong() {
        Record record = Record.of("foo", 1L);
        assertEquals(new Long(1L), record.getLong("foo"));
    }

    @Test
    public void getNullLong() {
        Record record = Record.of("foo", null);
        assertNull(record.getLong("foo"));
    }

    @Test
    public void getLongTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a long.");
        Record record = Record.of("foo", "bar");
        record.getLong("foo");
    }

    @Test
    public void optionalLong() {
        Record record = Record.of("foo", 1L);
        assertEquals(Optional.of(1L), record.optionalLong("foo"));
    }

    @Test
    public void optionalNullLong() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalLong("foo"));
    }

    @Test
    public void optionalLongTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a long.");
        Record record = Record.of("foo", "bar");
        record.optionalLong("foo");
    }

    @Test
    public void getInteger() {
        Record record = Record.of("foo", 1);
        assertEquals(new Integer(1), record.getInteger("foo"));
    }

    @Test
    public void getNullInteger() {
        Record record = Record.of("foo", null);
        assertNull(record.getInteger("foo"));
    }

    @Test
    public void getIntegerTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be an integer.");
        Record record = Record.of("foo", "bar");
        record.getInteger("foo");
    }

    @Test
    public void optionalInteger() {
        Record record = Record.of("foo", 1);
        assertEquals(Optional.of(1), record.optionalInteger("foo"));
    }

    @Test
    public void optionalNullInteger() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalInteger("foo"));
    }

    @Test
    public void optionalIntegerTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be an integer.");
        Record record = Record.of("foo", "bar");
        record.optionalInteger("foo");
    }

    @Test
    public void getList() {
        Record record = Record.of("foo", Arrays.asList("bar", "baz"));
        assertEquals(Arrays.asList("bar", "baz"), record.getList("foo"));
    }

    @Test
    public void getListWithExplicitGenericType() {
        List<String> strings = Arrays.asList("bar", "baz");
        Record record = Record.of("foo", strings);

        List<String> uppercaseStrings = record.getList("foo", String.class)
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        assertEquals(Arrays.asList("BAR", "BAZ"), uppercaseStrings);
    }

    @Test
    public void getNullList() {
        Record record = Record.of("foo", null);
        assertNull(record.getList("foo"));
    }

    @Test
    public void getListTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a list.");
        Record record = Record.of("foo", "bar");
        record.getList("foo");
    }

    @Test
    public void optionalList() {
        Record record = Record.of("foo", Arrays.asList("bar", "baz"));
        assertEquals(Optional.of(Arrays.asList("bar", "baz")), record.optionalList("foo"));
    }

    @Test
    public void optionalNullList() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalList("foo"));
    }

    @Test
    public void optionalListTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a list.");
        Record record = Record.of("foo", "bar");
        record.optionalList("foo");
    }

    @Test
    public void getSet() {
        Record record = Record.of("foo", setOf("bar", "baz"));
        assertEquals(setOf("bar", "baz"), record.getSet("foo"));
    }

    @Test
    public void getSetWithExplicitGenericType() {
        Set<String> strings = setOf("bar", "baz");
        Record record = Record.of("foo", strings);

        Set<String> uppercaseStrings = record.getSet("foo", String.class)
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        assertEquals(setOf("BAR", "BAZ"), uppercaseStrings);
    }

    @Test
    public void getNullSet() {
        Record record = Record.of("foo", null);
        assertNull(record.getSet("foo"));
    }

    @Test
    public void getSetTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a set.");
        Record record = Record.of("foo", "bar");
        record.getSet("foo");
    }

    @Test
    public void optionalSet() {
        Record record = Record.of("foo", setOf("bar", "baz"));
        assertEquals(Optional.of(setOf("bar", "baz")), record.optionalSet("foo"));
    }

    @Test
    public void optionalNullSet() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalSet("foo"));
    }

    @Test
    public void optionalSetTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a set.");
        Record record = Record.of("foo", "bar");
        record.optionalSet("foo");
    }

    @Test
    public void getMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("bar", 1);
        map.put("baz", 2);
        Record record = Record.of("foo", map);
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("bar", 1);
        expectedMap.put("baz", 2);
        assertEquals(expectedMap, record.getMap("foo"));
    }

    @Test
    public void getNullMap() {
        Record record = Record.of("foo", null);
        assertNull(record.getMap("foo"));
    }

    @Test
    public void getMapTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a map.");
        Record record = Record.of("foo", "bar");
        record.getMap("foo");
    }

    @Test
    public void optionalMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("bar", 1);
        map.put("baz", 2);
        Record record = Record.of("foo", map);
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("bar", 1);
        expectedMap.put("baz", 2);
        assertEquals(Optional.of(expectedMap), record.optionalMap("foo"));
    }

    @Test
    public void optionalNullMap() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalMap("foo"));
    }

    @Test
    public void optionalMapTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a map.");
        Record record = Record.of("foo", "bar");
        record.optionalMap("foo");
    }

    @Test
    public void getRecord() {
        Record childRecord = Record.of("bar", 1,
                                       "baz", 2);
        Record record = Record.of("foo", childRecord);
        Record expectedChildRecord = Record.of("bar", 1,
                                               "baz", 2);
        assertEquals(expectedChildRecord, record.getRecord("foo"));
    }

    @Test
    public void getRecordFromMap() {
        Map<String, Object> childMap = new HashMap<>();

        childMap.put("bar", 1);
        childMap.put("baz", 2);

        Record record = Record.of("foo", childMap);
        Record expectedChildRecord = Record.of("bar", 1,
                                               "baz", 2);
        assertEquals(expectedChildRecord, record.getRecord("foo"));
    }

    @Test
    public void getNullRecord() {
        Record record = Record.of("foo", null);
        assertNull(record.getRecord("foo"));
    }

    @Test
    public void getRecordTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a record.");
        Record record = Record.of("foo", "bar");
        record.getRecord("foo");
    }

    @Test
    public void optionalRecord() {
        Record childRecord = Record.of("bar", 1,
                                       "baz", 2);
        Record record = Record.of("foo", childRecord);
        Record expectedChildRecord = Record.of("bar", 1,
                                               "baz", 2);
        assertEquals(Optional.of(expectedChildRecord), record.optionalRecord("foo"));
    }

    @Test
    public void optionalNullRecord() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalRecord("foo"));
    }

    @Test
    public void optionalRecordTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a record.");
        Record record = Record.of("foo", "bar");
        record.optionalRecord("foo");
    }

    @Test
    public void getFloat() {
        Record record = Record.of("foo", 1f);
        assertEquals(new Float(1), record.getFloat("foo"));
    }

    @Test
    public void getNullFloat() {
        Record record = Record.of("foo", null);
        assertNull(record.getFloat("foo"));
    }

    @Test
    public void getFloatTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a float.");
        Record record = Record.of("foo", "bar");
        record.getFloat("foo");
    }

    @Test
    public void optionalFloat() {
        Record record = Record.of("foo", 1f);
        assertEquals(Optional.of(1f), record.optionalFloat("foo"));
    }

    @Test
    public void optionalNullFloat() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalFloat("foo"));
    }

    @Test
    public void optionalFloatTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a float.");
        Record record = Record.of("foo", "bar");
        record.optionalFloat("foo");
    }

    @Test
    public void getDouble() {
        Record record = Record.of("foo", 1d);
        assertEquals(new Double(1), record.getDouble("foo"));
    }

    @Test
    public void getNullDouble() {
        Record record = Record.of("foo", null);
        assertNull(record.getDouble("foo"));
    }

    @Test
    public void getDoubleTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a double.");
        Record record = Record.of("foo", "bar");
        record.getDouble("foo");
    }

    @Test
    public void optionalDouble() {
        Record record = Record.of("foo", 1d);
        assertEquals(Optional.of(1d), record.optionalDouble("foo"));
    }

    @Test
    public void optionalNullDouble() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalDouble("foo"));
    }

    @Test
    public void optionalDoubleTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a double.");
        Record record = Record.of("foo", "bar");
        record.optionalDouble("foo");
    }

    @Test
    public void getBigDecimal() {
        Record record = Record.of("foo", new BigDecimal(1));
        assertEquals(new BigDecimal(1), record.getBigDecimal("foo"));
    }

    @Test
    public void getNullBigDecimal() {
        Record record = Record.of("foo", null);
        assertNull(record.getBigDecimal("foo"));
    }

    @Test
    public void getBigDecimalTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a big decimal.");
        Record record = Record.of("foo", "bar");
        record.getBigDecimal("foo");
    }

    @Test
    public void optionalBigDecimal() {
        Record record = Record.of("foo", new BigDecimal(1));
        assertEquals(Optional.of(new BigDecimal(1)), record.optionalBigDecimal("foo"));
    }

    @Test
    public void optionalNullBigDecimal() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalBigDecimal("foo"));
    }

    @Test
    public void optionalBigDecimalTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a big decimal.");
        Record record = Record.of("foo", "bar");
        record.optionalBigDecimal("foo");
    }

    @Test
    public void getDate() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date = format.parse("1/2/2000");

        Record record = Record.of("foo", date);
        assertEquals(date, record.getDate("foo"));
    }

    @Test
    public void getNullDate() {
        Record record = Record.of("foo", null);
        assertNull(record.getDate("foo"));
    }

    @Test
    public void getDateTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a date.");
        Record record = Record.of("foo", "bar");
        record.getDate("foo");
    }

    @Test
    public void optionalDate() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date = format.parse("1/2/2000");

        Record record = Record.of("foo", date);
        assertEquals(Optional.of(date), record.optionalDate("foo"));
    }

    @Test
    public void optionalNullDate() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalDate("foo"));
    }

    @Test
    public void optionalDateTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a date.");
        Record record = Record.of("foo", "bar");
        record.optionalDate("foo");
    }

    @Test
    public void getLocalDate() throws ParseException {
        LocalDate localDate = LocalDate.parse("2000-01-02");

        Record record = Record.of("foo", localDate);
        assertEquals(localDate, record.getLocalDate("foo"));
    }

    @Test
    public void getNullLocalDate() {
        Record record = Record.of("foo", null);
        assertNull(record.getLocalDate("foo"));
    }

    @Test
    public void getLocalDateTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a LocalDate.");
        Record record = Record.of("foo", "bar");
        record.getLocalDate("foo");
    }

    @Test
    public void optionalLocalDate() throws ParseException {
        LocalDate localDate = LocalDate.parse("2000-01-02");

        Record record = Record.of("foo", localDate);
        assertEquals(Optional.of(localDate), record.optionalLocalDate("foo"));
    }

    @Test
    public void optionalNullLocalDate() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalLocalDate("foo"));
    }

    @Test
    public void optionalLocalDateTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a LocalDate.");
        Record record = Record.of("foo", "bar");
        record.optionalLocalDate("foo");
    }

    @Test
    public void getLocalDateTime() throws ParseException {
        LocalDateTime localDateTime = LocalDateTime.parse("2000-01-02T01:15:30");

        Record record = Record.of("foo", localDateTime);
        assertEquals(localDateTime, record.getLocalDateTime("foo"));
    }

    @Test
    public void getNullLocalDateTime() {
        Record record = Record.of("foo", null);
        assertNull(record.getLocalDateTime("foo"));
    }

    @Test
    public void getLocalDateTimeTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a LocalDateTime.");
        Record record = Record.of("foo", "bar");
        record.getLocalDateTime("foo");
    }

    @Test
    public void optionalLocalDateTime() throws ParseException {
        LocalDateTime localDateTime = LocalDateTime.parse("2000-01-02T01:15:30");

        Record record = Record.of("foo", localDateTime);
        assertEquals(Optional.of(localDateTime), record.optionalLocalDateTime("foo"));
    }

    @Test
    public void optionalNullLocalDateTime() {
        Record record = Record.of("foo", null);
        assertEquals(Optional.empty(), record.optionalLocalDateTime("foo"));
    }

    @Test
    public void optionalLocalDateTimeTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"bar\" of class \"java.lang.String\" for key \"foo\" must be a LocalDateTime.");
        Record record = Record.of("foo", "bar");
        record.optionalLocalDateTime("foo");
    }

    @Test
    public void assocMap() {
        Record record = Record.of("foo", "bar",
                                  "baz", 1);

        assertEquals(2, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));

        Map<String, Object> map = new HashMap<>();

        record = record.assoc(null);

        assertEquals(2, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));

        map = new HashMap<>();
        record = record.assoc(map);

        assertEquals(2, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));

        map.put("bop", "goo");

        record = record.assoc(map);

        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals("goo", record.get("bop"));
    }

    @Test
    public void assoc() {
        Record record = new Record();

        assertEquals(0, record.size());

        Record newRecord = record.assoc("foo", "bar",
                                        "baz", 1);

        assertEquals(0, record.size());

        assertEquals(2, newRecord.size());
        assertEquals("bar", newRecord.get("foo"));
        assertEquals(1, newRecord.get("baz"));
    }

    @Test
    public void dissoc() {
        Record record = Record.of("foo", "bar",
                                  "baz", 1);
        assertEquals(2, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));

        Record newRecord = record.dissoc("foo", "baz");

        assertEquals(2, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));

        assertEquals(0, newRecord.size());
    }

    @Test
    public void selectKeys() {
        Record record = Record.of("foo", "bar",
                                  "baz", 1,
                                  "bop", 2);
        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        Record newRecord = record.select("foo", "baz");

        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        assertEquals(2, newRecord.size());
        assertEquals("bar", newRecord.get("foo"));
        assertEquals(1, newRecord.get("baz"));
    }

    @Test
    public void rename() {
        Record record = Record.of("foo", "bar",
                                  "baz", 1,
                                  "bop", 2);
        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        Record newRecord = record.rename("foo", "foot",
                                         "baz", "bazy");

        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        assertEquals(3, newRecord.size());
        assertEquals("bar", newRecord.get("foot"));
        assertEquals(1, newRecord.get("bazy"));
        assertEquals(2, record.get("bop"));
    }

    @Test
    public void renameWithMap() {
        Record record = Record.of("foo", "bar",
                                  "baz", 1,
                                  "bop", 2);
        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        Map<String, String> keyPairs = new HashMap<>();
        keyPairs.put("foo", "foot");
        keyPairs.put("baz", "bazy");

        Record newRecord = record.rename(keyPairs);

        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        assertEquals(3, newRecord.size());
        assertEquals("bar", newRecord.get("foot"));
        assertEquals(1, newRecord.get("bazy"));
        assertEquals(2, record.get("bop"));
    }

    @Test
    public void renameToMany() {
        Record record = Record.of("foo", "bar",
                                  "baz", 1,
                                  "bop", 2);
        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        Map<String, List<String>> keySets = new HashMap<>();
        keySets.put("foo", Arrays.asList("foot", "food"));
        keySets.put("baz", Collections.singletonList("bazy"));

        Record newRecord = record.renameToMany(keySets);

        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        assertEquals(4, newRecord.size());
        assertEquals("bar", newRecord.get("foot"));
        assertEquals("bar", newRecord.get("food"));
        assertEquals(1, newRecord.get("bazy"));
        assertEquals(2, record.get("bop"));
    }

    @Test
    public void selectAndRename() {
        Record record = Record.of("foo", "bar",
                                  "baz", 1,
                                  "bop", 2);
        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        Record newRecord = record.selectAndRename("foo", "foot",
                                                  "baz", "bazy");

        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        assertEquals(2, newRecord.size());
        assertEquals("bar", newRecord.get("foot"));
        assertEquals(1, newRecord.get("bazy"));
    }

    @Test
    public void selectAndRenameWithMap() {
        Record record = Record.of("foo", "bar",
                                  "baz", 1,
                                  "bop", 2);
        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        Map<String, String> keyPairs = new HashMap<>();
        keyPairs.put("foo", "foot");
        keyPairs.put("baz", "bazy");

        Record newRecord = record.selectAndRename(keyPairs);

        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        assertEquals(2, newRecord.size());
        assertEquals("bar", newRecord.get("foot"));
        assertEquals(1, newRecord.get("bazy"));
    }

    @Test
    public void selectAndRenameToMany() {
        Record record = Record.of("foo", "bar",
                                  "baz", 1,
                                  "bop", 2);
        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        Map<String, List<String>> keySets = new HashMap<>();
        keySets.put("foo", Arrays.asList("foot", "food"));
        keySets.put("baz", Collections.singletonList("bazy"));

        Record newRecord = record.selectAndRenameToMany(keySets);

        assertEquals(3, record.size());
        assertEquals("bar", record.get("foo"));
        assertEquals(1, record.get("baz"));
        assertEquals(2, record.get("bop"));

        assertEquals(3, newRecord.size());
        assertEquals("bar", newRecord.get("foot"));
        assertEquals("bar", newRecord.get("food"));
        assertEquals(1, newRecord.get("bazy"));
    }

    @Test
    public void equalitySanityTest() {
        Record a = Record.of("foo", "bar");
        Record b = Record.of("foo", "bar");
        assertEquals(a, b);
    }

    @Test
    public void updateString() {
        Record pre = Record.of("foo", "bar");
        Record post = pre.updateString("foo", String::toUpperCase);
        assertEquals(Record.of("foo", "bar"), pre);
        assertEquals(Record.of("foo", "BAR"), post);
    }

    @Test
    public void updateStringToNewType() {
        Record pre = Record.of("foo", "1");
        Record post = pre.updateString("foo", s -> (s.equals("2")));
        assertEquals(Record.of("foo", "1"), pre);
        assertEquals(Record.of("foo", false), post);
    }

    @Test
    public void updateBigDecimal() {
        Record pre = Record.of("foo", new BigDecimal("1.0"));
        Record post = pre.updateBigDecimal("foo", n -> n.add(new BigDecimal("2.0")));
        assertEquals(Record.of("foo", new BigDecimal("1.0")), pre);
        assertEquals(Record.of("foo", new BigDecimal("3.0")), post);
    }

    @Test
    public void updateBigDecimalToNewType() {
        Record pre = Record.of("foo", new BigDecimal("1.0"));
        Record post = pre.updateBigDecimal("foo", BigDecimal::toString);
        assertEquals(Record.of("foo", new BigDecimal("1.0")), pre);
        assertEquals(Record.of("foo", "1.0"), post);
    }

    @Test
    public void updateInteger() {
        Record pre = Record.of("foo", 1);
        Record post = pre.updateInteger("foo", v -> v + 1);
        assertEquals(Record.of("foo", 1), pre);
        assertEquals(Record.of("foo", 2), post);
    }

    @Test
    public void updateIntegerToNewType() {
        Record pre = Record.of("foo", 1);
        Record post = pre.updateInteger("foo", Object::toString);
        assertEquals(Record.of("foo", 1), pre);
        assertEquals(Record.of("foo", "1"), post);
    }

    @Test
    public void updateFloat() {
        Record pre = Record.of("foo", 1.0f);
        Record post = pre.updateFloat("foo", v -> v + 1.0f);
        assertEquals(Record.of("foo", 1.0f), pre);
        assertEquals(Record.of("foo", 2.0f), post);
    }

    @Test
    public void updateFloatToNewType() {
        Record pre = Record.of("foo", 1.0f);
        Record post = pre.updateFloat("foo", Object::toString);
        assertEquals(Record.of("foo", 1.0f), pre);
        assertEquals(Record.of("foo", "1.0"), post);
    }

    @Test
    public void updateDouble() {
        Record pre = Record.of("foo", 1.0);
        Record post = pre.updateDouble("foo", v -> v + 1.0);
        assertEquals(Record.of("foo", 1.0), pre);
        assertEquals(Record.of("foo", 2.0), post);
    }

    @Test
    public void updateDoubleToNewType() {
        Record pre = Record.of("foo", 1.0);
        Record post = pre.updateDouble("foo", Object::toString);
        assertEquals(Record.of("foo", 1.0), pre);
        assertEquals(Record.of("foo", "1.0"), post);
    }

    @Test
    public void updateBoolean() {
        Record pre = Record.of("foo", true);
        Record post = pre.updateBoolean("foo", v -> !v);
        assertEquals(Record.of("foo", true), pre);
        assertEquals(Record.of("foo", false), post);
    }

    @Test
    public void updateBooleanToNewType() {
        Record pre = Record.of("foo", true);
        Record post = pre.updateBoolean("foo", Object::toString);
        assertEquals(Record.of("foo", true), pre);
        assertEquals(Record.of("foo", "true"), post);
    }

    @Test
    public void updateRecord() {
        Record pre = Record.of("foo", Record.of("bar", 2));
        Record post = pre.updateRecord("foo", v -> v.assoc("baz", 3));
        assertEquals(Record.of("foo", Record.of("bar", 2)), pre);
        assertEquals(Record.of("foo", Record.of("bar", 2,
                                                "baz", 3)),
                     post);
    }

    @Test
    public void updateRecordToNewType() {
        Record pre = Record.of("foo", Record.of("bar", 2));
        Record post = pre.updateRecord("foo", AbstractMap::toString);
        assertEquals(Record.of("foo", Record.of("bar", 2)),
                     pre);
        assertEquals(Record.of("foo", "{bar=2}"),
                     post);
    }

    @Test
    public void mapValues() {
        Record pre = Record.of("foo", new BigDecimal("1.0"),
                               "bar", new BigDecimal("2.0"));
        Record post = pre.mapValues(BigDecimal.class, BigDecimal::toString);
        assertEquals(Record.of("foo", new BigDecimal("1.0"),
                               "bar", new BigDecimal("2.0")),
                     pre);
        assertEquals(Record.of("foo", "1.0",
                               "bar", "2.0"),
                     post);
    }

    @Test
    public void code() throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        TimeZone tz = TimeZone.getTimeZone("UTC");
        df.setTimeZone(tz);

        Record rec =
                Record.of("str", "bar",
                          "integ", 5,
                          "float", 2.5f,
                          "double", 5.0d,
                          "bigdec", new BigDecimal("1.0"),
                          "boole", true,
                          "long", 5L,
                          "list", Arrays.asList("foo", "bar"),
                          "map", new HashMap<>(),
                          "date", df.parse("2025-01-01T01:00Z"),
                          "LocalDate", LocalDate.of(2025, 1, 1),
                          "LocalDateTime", LocalDateTime.parse("2025-01-01T01:00:00"));

        assertEquals("Record.of(\"str\", \"bar\",\n          \"integ\", 5,\n          \"float\", 2.5f,\n          \"double\", 5.0d,\n          \"bigdec\", new BigDecimal(\"1.0\"),\n          \"boole\", true,\n          \"long\", new Long(5),\n          \"list\", Arrays.asList(\"foo\", \"bar\"),\n          \"map\", mapOf(),\n          \"date\", new Date(1735693200000L),\n          \"LocalDate\", LocalDate.of(2025, 1, 1),\n          \"LocalDateTime\", Instant.ofEpochMilli(1735714800000L).atZone(ZoneId.systemDefault()).toLocalDate())",
                     rec.code());
    }

    @Test
    public void getType() {
        Record record = Record.of("foo", 5);
        Integer foo = record.getType("foo", Integer.class);
        assertEquals(new Integer(5), foo);
    }

    @Test
    public void getTypeTypeMismatch() {
        thrown.expect(TypeMismatchException.class);
        thrown.expectMessage("Value \"1\" of class \"java.lang.Integer\" for key \"foo\" must be an an instance of \"java.lang.String\".");
        Record record = Record.of("foo", 1);
        record.getType("foo", String.class);
    }

    @SafeVarargs
    private static <T> Set<T> setOf(T... items) {
        return new HashSet<>(Arrays.asList(items));
    }
}
