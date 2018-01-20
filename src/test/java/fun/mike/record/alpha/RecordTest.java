package fun.mike.record.alpha;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class RecordTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

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
        assertEquals(Optional.of(new Long(1L)), record.optionalLong("foo"));
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
        assertEquals(Optional.of(new Integer(1)), record.optionalInteger("foo"));
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
        Record record = Record.of("foo", new Float(1));
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
        Record record = Record.of("foo", new Float(1));
        assertEquals(Optional.of(new Float(1)), record.optionalFloat("foo"));
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
        Record record = Record.of("foo", new Double(1));
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
        Record record = Record.of("foo", new Double(1));
        assertEquals(Optional.of(new Double(1)), record.optionalDouble("foo"));
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
    public void assoc() throws ParseException {
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
    public void dissoc() throws ParseException {
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
    public void selectKeys() throws ParseException {
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
    public void equalitySanityTest() {
        Record a = Record.of("foo", "bar");
        Record b = Record.of("foo", "bar");
        assertEquals(a, b);
    }
}
