package fun.mike.record.alpha;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * A friendly heterogeneous map class.
 */
public class Record extends LinkedHashMap<String, Object> {
    /**
     * Creates an empty Record.
     */
    public Record() {
        super();
    }

    /**
     * Creates a record from another Record.
     * @param record A record
     */
    public Record(Record record) {
        super(record);
    }

    /**
     * Creates a Record from a map.
     * @param map A map
     */
    public Record(Map<String, Object> map) {
        super(map);
    }

    /**
     * Returns an empty record.
     * @return a empty record
     */
    public static Record of() {
        return new Record();
    }

    /**
     * Returns a record containing the given keys and values. Takes an
     * alternating sequence of keys and values.
     * @param k1 a key
     * @param v1 a value
     * @return a record
     */
    public static Record of(String k1, Object v1) {
        Record record = new Record();
        record.put(k1, v1);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        record.put(k16, v16);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        record.put(k16, v16);
        record.put(k17, v17);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17, String k18, Object v18) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        record.put(k16, v16);
        record.put(k17, v17);
        record.put(k18, v18);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17, String k18, Object v18,
            String k19, Object v19) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        record.put(k16, v16);
        record.put(k17, v17);
        record.put(k18, v18);
        record.put(k19, v19);
        return record;
    }

    public static Record of(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17, String k18, Object v18,
            String k19, Object v19, String k20, Object v20) {
        Record record = new Record();
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        record.put(k16, v16);
        record.put(k17, v17);
        record.put(k18, v18);
        record.put(k19, v19);
        record.put(k20, v20);
        return record;
    }

    /**
     * Returns the string value to which the specified key is mapped, or null
     * if this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not a string.
     * @param key the key whose associated value is to be returned
     * @return the string value to which the specified key is mapped, or null
     *         if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a string
     */
    public String getString(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
            return (String) value;
        }
        throw new TypeMismatchException(key, value, "string", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the string value to which the specified
     * key is mapped, or an empty Optional if this map contains no mapping for
     * the key. Throws a {@code TypeMismatchException} if the value mapped to the key
     * is not a string.
     * @param key the key whose associated value is to be returned
     * @return an Optional containing the string value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a string
     */
    public Optional<String> optionalString(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof String) {
            return Optional.of((String) value);
        }
        throw new TypeMismatchException(key, value, "string", value.getClass().getName());
    }

    /**
     * Returns the boolean value to which the specified key is mapped, or null
     * if this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not a boolean.
     * @param key the key whose associated value is to be returned
     * @return the boolean value to which the specified key is mapped, or null
     *         if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a boolean
     */
    public Boolean getBoolean(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        throw new TypeMismatchException(key, value, "boolean", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the boolean value to which the specified
     * key is mapped, or an empty Optional if this map contains no mapping for
     * the key. Throws a {@code TypeMismatchException} if the value mapped to the key
     * is not a boolean.
     * @param key the key whose associated value is to be returned
     * @return an Optional containing the boolean value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a boolean
     */
    public Optional<Boolean> optionalBoolean(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof Boolean) {
            return Optional.of((Boolean) value);
        }
        throw new TypeMismatchException(key, value, "boolean", value.getClass().getName());
    }

    /**
     * Returns the integer value to which the specified key is mapped, or null
     * if this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not an integer.
     * @param key the key whose associated value is to be returned
     * @return the integer value to which the specified key is mapped, or null
     *         if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * an integer
     */
    public Integer getInteger(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof Integer) {
            return (Integer) value;
        }
        throw new TypeMismatchException(key, value, "integer", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the integer value to which the specified
     * key is mapped, or an empty Optional if this map contains no mapping for
     * the key. Throws a {@code TypeMismatchException} if the value mapped to the key
     * is not an integer.
     * @param key the key whose associated value is to be returned
     * @return an Optional containing the integer value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * an integer
     */
    public Optional<Integer> optionalInteger(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof Integer) {
            return Optional.of((Integer) value);
        }
        throw new TypeMismatchException(key, value, "integer", value.getClass().getName());
    }

    /**
     * Returns the long value to which the specified key is mapped, or null
     * if this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not an long.
     * @param key the key whose associated value is to be returned
     * @return the long value to which the specified key is mapped, or null
     *         if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a long
     */
    public Long getLong(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof Long) {
            return (Long) value;
        }
        throw new TypeMismatchException(key, value, "long", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the long value to which the specified key
     * is mapped, or an empty Optional if this map contains no mapping for the
     * key. Throws a {@code TypeMismatchException} if the value mapped to the key is not
     * a long.
     * @param key the key whose associated value is to be returned
     * @return an Optional containing the long value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a long
     */
    public Optional<Long> optionalLong(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof Long) {
            return Optional.of((Long) value);
        }
        throw new TypeMismatchException(key, value, "long", value.getClass().getName());
    }


    /**
     * Returns the List value to which the specified key is mapped, or null
     * if this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not a List.
     * @param key the key whose associated value is to be returned
     * @param <T> the list type
     * @return the List value to which the specified key is mapped, or null
     *         if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a list
     */
    public <T> List<T> getList(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof List) {
            @SuppressWarnings("unchecked")
            List<T> result = (List<T>) value;
            return result;
        }
        throw new TypeMismatchException(key, value, "list", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the List value to which the specified key
     * is mapped, or an empty Optional if this map contains no mapping for the
     * key. Throws a {@code TypeMismatchException} if the value mapped to the key is not
     * a List.
     * @param key the key whose associated value is to be returned
     * @param <T> the list type
     * @return an Optional containing the List value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a list
     */
    public <T> Optional<List<T>> optionalList(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof List) {
            @SuppressWarnings("unchecked")
            Optional<List<T>> result = Optional.of((List<T>) value);
            return result;
        }
        throw new TypeMismatchException(key, value, "list", value.getClass().getName());
    }

    /**
     * Returns the Map value to which the specified key is mapped, or null
     * if this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not a Map.
     * @param key the key whose associated value is to be returned
     * @param <K> the map's key type
     * @param <V> the map's value type
     * @return the Map value to which the specified key is mapped, or null
     *         if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a map
     */
    public <K, V> Map<K, V> getMap(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof Map) {
            @SuppressWarnings("unchecked")
            Map<K, V> result = (Map<K, V>) value;
            return result;
        }
        throw new TypeMismatchException(key, value, "map", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the Map value to which the specified key
     * is mapped, or an empty Optional if this map contains no mapping for the
     * key. Throws a {@code TypeMismatchException} if the value mapped to the key is not
     * an Map.
     * @param key the key whose associated value is to be returned
     * @param <K> the map's key type
     * @param <V> the map's value type
     * @return an Optional containing the Map value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a map
     */
    public <K, V> Optional<Map<K, V>> optionalMap(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof Map) {
            @SuppressWarnings("unchecked")
            Optional<Map<K, V>> result = Optional.of((Map<K, V>) value);
            return result;
        }
        throw new TypeMismatchException(key, value, "map", value.getClass().getName());
    }

    /**
     * Returns the record value to which the specified key is mapped, or null
     * if this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not a record.
     * @param key the key whose associated value is to be returned
     * @return the record value to which the specified key is mapped, or null
     *         if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a record
     */
    public Record getRecord(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof Record) {
            return (Record) value;
        }
        throw new TypeMismatchException(key, value, "record", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the record value to which the specified key
     * is mapped, or an empty Optional if this map contains no mapping for the
     * key. Throws a {@code TypeMismatchException} if the value mapped to the key is not
     * a record.
     * @param key the key whose associated value is to be returned
     * @return an Optional containing the record value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a record
     */
    public Optional<Record> optionalRecord(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof Record) {
            return Optional.of((Record) value);
        }
        throw new TypeMismatchException(key, value, "record", value.getClass().getName());
    }

    /**
     * Returns the float value to which the specified key is mapped, or null
     * if this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not a float.
     * @param key the key whose associated value is to be returned
     * @return the float value to which the specified key is mapped, or null
     *         if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a float
     */
    public Float getFloat(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof Float) {
            return (Float) value;
        }
        throw new TypeMismatchException(key, value, "float", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the float value to which the specified key
     * is mapped, or an empty Optional if this map contains no mapping for the
     * key. Throws a {@code TypeMismatchException} if the value mapped to the key is not
     * a float.
     * @param key the key whose associated value is to be returned
     * @return an Optional containing the float value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a float
     */
    public Optional<Float> optionalFloat(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof Float) {
            return Optional.of((Float) value);
        }
        throw new TypeMismatchException(key, value, "float", value.getClass().getName());
    }

    /**
     * Returns the double value to which the specified key is mapped, or null
     * if this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not a double.
     * @param key the key whose associated value is to be returned
     * @return the double value to which the specified key is mapped, or null
     *         if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a double
     */
    public Double getDouble(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof Double) {
            return (Double) value;
        }
        throw new TypeMismatchException(key, value, "double", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the double value to which the specified key
     * is mapped, or an empty Optional if this map contains no mapping for the
     * key. Throws a {@code TypeMismatchException} if the value mapped to the key is not
     * a double.
     * @param key the key whose associated value is to be returned
     * @return an Optional containing the double value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a double
     */
    public Optional<Double> optionalDouble(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof Double) {
            return Optional.of((Double) value);
        }
        throw new TypeMismatchException(key, value, "double", value.getClass().getName());
    }

    /**
     * Returns the BigDecimal value to which the specified key is mapped, or
     * nullif this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not a BigDecimal.
     * @param key the key whose associated value is to be returned
     * @return the BigDecimal value to which the specified key is mapped, or
     *         null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a BigDecimal
     */
    public BigDecimal getBigDecimal(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof BigDecimal) {
            return (BigDecimal) value;
        }
        throw new TypeMismatchException(key, value, "big decimal", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the BigDecimal value to which the specified key
     * is mapped, or an empty Optional if this map contains no mapping for the
     * key. Throws a {@code TypeMismatchException} if the value mapped to the key is not
     * a BigDecimal.
     * @param key the key whose associated value is to be returned
     * @return an Optional containing the BigDecimal value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a BigDecimal
     */
    public Optional<BigDecimal> optionalBigDecimal(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof BigDecimal) {
            return Optional.of((BigDecimal) value);
        }
        throw new TypeMismatchException(key, value, "big decimal", value.getClass().getName());
    }

    /**
     * Returns the Date value to which the specified key is mapped, or
     * nullif this map contains no mapping for the key. Throws a
     * TypeMismatchException if the value mapped to the key is not a Date.
     * @param key the key whose associated value is to be returned
     * @return the Date value to which the specified key is mapped, or null if
     *         this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a Date
     */
    public Date getDate(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof Date) {
            return (Date) value;
        }
        throw new TypeMismatchException(key, value, "date", value.getClass().getName());
    }

    /**
     * Returns an Optional containing the Date value to which the specified key
     * is mapped, or an empty Optional if this map contains no mapping for the
     * key. Throws a {@code TypeMismatchException} if the value mapped to the key is not
     * a Date.
     * @param key the key whose associated value is to be returned
     * @return an Optional containing the Date value to which the specified
     *         key is mapped, or null if this map contains no mapping for the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a Date
     */
    public Optional<Date> optionalDate(String key) {
        Object value = this.get(key);
        if (value == null) {
            return Optional.empty();
        }
        if (value instanceof Date) {
            return Optional.of((Date) value);
        }
        throw new TypeMismatchException(key, value, "date", value.getClass().getName());
    }

    /**
     * Returns a new Record without the given {@code keys}.
     * @param keys The keys to remove
     * @return a new Record without the given keys
     */
    public Record dissoc(String... keys) {
        return dissoc(Arrays.asList(keys));
    }

    /**
     * Returns a new Record without the given {@code keys}.
     * @param keys The keys to remove
     * @return a new Record without the given keys
     */
    public Record dissoc(Collection<String> keys) {
        Record record = new Record();
        record.putAll(this);
        for (String key : keys) {
            record.remove(key);
        }
        return record;
    }

    /**
     * Returns a new Record with only the given {@code keys}.
     * @param keys The keys to keep
     * @return a new Record with only the given keys
     */
    public Record select(String... keys) {
        return select(Arrays.asList(keys));
    }

    /**
     * Returns a new Record with only the given {@code keys}.
     * @param keys The keys to keep
     * @return a new Record with only the given keys
     */
    public Record select(Collection<String> keys) {
        Record record = new Record();
        for (String key : keys) {
            if (containsKey(key)) {
                record.put(key, get(key));
            }
        }
        return record;
    }

    /**
     * Returns a new Record with the given keys and values added.
     * @param k1 a key
     * @param v1 a value
     * @return a new Record with the given keys and values added
     */
    public Record assoc(String k1, Object v1) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        return record;
    }


    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        record.put(k16, v16);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        record.put(k16, v16);
        record.put(k17, v17);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17, String k18, Object v18) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        record.put(k16, v16);
        record.put(k17, v17);
        record.put(k18, v18);
        return record;
    }

    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17, String k18, Object v18,
            String k19, Object v19
    ) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        record.put(k16, v16);
        record.put(k17, v17);
        record.put(k18, v18);
        record.put(k19, v19);
        return record;
    }


    public Record assoc(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17, String k18, Object v18,
            String k19, Object v19, String k20, Object v20) {
        Record record = new Record();
        record.putAll(this);
        record.put(k1, v1);
        record.put(k2, v2);
        record.put(k3, v3);
        record.put(k4, v4);
        record.put(k5, v5);
        record.put(k6, v6);
        record.put(k7, v7);
        record.put(k8, v8);
        record.put(k9, v9);
        record.put(k10, v10);
        record.put(k11, v11);
        record.put(k12, v12);
        record.put(k13, v13);
        record.put(k14, v14);
        record.put(k15, v15);
        record.put(k16, v16);
        record.put(k17, v17);
        record.put(k18, v18);
        record.put(k19, v19);
        record.put(k20, v20);
        return record;
    }

    /**
     * Returns a new Record with the given keys and values added.
     * @param k1 a key
     * @param v1 a value
     * @return a new Record with the given keys and values added
     */
    public Record set(String k1, Object v1) {
        put(k1, v1);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2) {
        put(k1, v1);
        put(k2, v2);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        put(k11, v11);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        put(k11, v11);
        put(k12, v12);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        put(k11, v11);
        put(k12, v12);
        put(k13, v13);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        put(k11, v11);
        put(k12, v12);
        put(k13, v13);
        put(k14, v14);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        put(k11, v11);
        put(k12, v12);
        put(k13, v13);
        put(k14, v14);
        put(k15, v15);
        return this;
    }


    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        put(k11, v11);
        put(k12, v12);
        put(k13, v13);
        put(k14, v14);
        put(k15, v15);
        put(k16, v16);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        put(k11, v11);
        put(k12, v12);
        put(k13, v13);
        put(k14, v14);
        put(k15, v15);
        put(k16, v16);
        put(k17, v17);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17, String k18, Object v18) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        put(k11, v11);
        put(k12, v12);
        put(k13, v13);
        put(k14, v14);
        put(k15, v15);
        put(k16, v16);
        put(k17, v17);
        put(k18, v18);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17, String k18, Object v18,
            String k19, Object v19
    ) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        put(k11, v11);
        put(k12, v12);
        put(k13, v13);
        put(k14, v14);
        put(k15, v15);
        put(k16, v16);
        put(k17, v17);
        put(k18, v18);
        put(k19, v19);
        return this;
    }


    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5, String k6, Object v6,
            String k7, Object v7, String k8, Object v8,
            String k9, Object v9, String k10, Object v10,
            String k11, Object v11, String k12, Object v12,
            String k13, Object v13, String k14, Object v14,
            String k15, Object v15, String k16, Object v16,
            String k17, Object v17, String k18, Object v18,
            String k19, Object v19, String k20, Object v20) {
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        put(k5, v5);
        put(k6, v6);
        put(k7, v7);
        put(k8, v8);
        put(k9, v9);
        put(k10, v10);
        put(k11, v11);
        put(k12, v12);
        put(k13, v13);
        put(k14, v14);
        put(k15, v15);
        put(k16, v16);
        put(k17, v17);
        put(k18, v18);
        put(k19, v19);
        put(k20, v20);
        return this;
    }

    /**
     * Returns a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key.
     * @param key a key
     * @param update a function to apply to the current value mapped to key
     * @return a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a string
     */
    public <T> Record updateString(String key, Function<String, T> update) {
        Record newRecord = new Record(this);
        String value = getString(key);
        newRecord.put(key, update.apply(value));
        return newRecord;
    }

    /**
     * Returns a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key.
     * @param key a key
     * @param update a function to apply to the current value mapped to key
     * @return a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a BigDecimal
     */
    public Record updateBigDecimal(String key, UnaryOperator<BigDecimal> update) {
        Record newRecord = new Record(this);
        BigDecimal value = getBigDecimal(key);
        newRecord.put(key, update.apply(value));
        return newRecord;
    }


    /**
     * Returns a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key.
     * @param key a key
     * @param update a function to apply to the current value mapped to key
     * @return a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a BigDecimal
     */
    public <T> Record updateBigDecimal(String key, Function<BigDecimal, T> update) {
        Record newRecord = new Record(this);
        BigDecimal value = getBigDecimal(key);
        newRecord.put(key, update.apply(value));
        return newRecord;
    }

    /**
     * Returns a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key.
     * @param key a key
     * @param update a function to apply to the current value mapped to key
     * @return a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * an integer
     */
    public <T> Record updateInteger(String key, Function<Integer, T> update) {
        Record newRecord = new Record(this);
        Integer value = getInteger(key);
        newRecord.put(key, update.apply(value));
        return newRecord;
    }

    /**
     * Returns a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key.
     * @param key a key
     * @param update a function to apply to the current value mapped to key
     * @return a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a float
     */
    public <T> Record updateFloat(String key, Function<Float, T> update) {
        Record newRecord = new Record(this);
        Float value = getFloat(key);
        newRecord.put(key, update.apply(value));
        return newRecord;
    }

    /**
     * Returns a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key.
     * @param key a key
     * @param update a function to apply to the current value mapped to key
     * @return a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a float
     */
    public <T> Record updateDouble(String key, Function<Double, T> update) {
        Record newRecord = new Record(this);
        Double value = getDouble(key);
        newRecord.put(key, update.apply(value));
        return newRecord;
    }

    /**
     * Returns a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key.
     * @param key a key
     * @param update a function to apply to the current value mapped to key
     * @return a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a boolean
     */
    public <T> Record updateBoolean(String key, Function<Boolean, T> update) {
        Record newRecord = new Record(this);
        Boolean value = getBoolean(key);
        newRecord.put(key, update.apply(value));
        return newRecord;
    }

    /**
     * Returns a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key.
     * @param key a key
     * @param update a function to apply to the current value mapped to key
     * @return a new Record with the given key mapped to the result of applying
     * the given function to the current value mapped to the key
     * @throws fun.mike.record.alpha.TypeMismatchException if the value is not
     * a Record
     */
    public <T> Record updateRecord(String key, Function<Record, T> update) {
        Record newRecord = new Record(this);
        Record value = getRecord(key);
        newRecord.put(key, update.apply(value));
        return newRecord;
    }

    // TODO: Add updates for List and Map?

    /**
     * Returns a new Record with the given mapping function applied to all
     * values of the given type.
     * @param type The type of value to apply the mapping function to
     * @param mapper A mapping function
     * @return a new Record with the given mapping function applied to all
     * values
     */
    public <T, U> Record mapValues(Class<T> type, Function<T, U> mapper) {
        Record newRecord = new Record();

        for(Map.Entry<String, Object> entry : entrySet()) {
            String key = entry.getKey();
            @SuppressWarnings("unchecked")
            T value = (T) entry.getValue();
            if(type.isInstance(value)) {
                newRecord.put(key, mapper.apply(value));
            }
            else {
                newRecord.put(key, value);
            }
        }

        return newRecord;
    }

    public void print() {
        System.out.println(code());
    }

    public String code() {
        String values = entrySet()
            .stream()
            .map(entry -> {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    return String.format("\"%s\", %s",
                                         key,
                                         code(value));
                })
            .collect(Collectors.joining(",\n"));

        return String.format("Record.of(%s);",
                             values);
    }

    private String code(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof String) {
            return String.format("\"%s\"", value);
        }
        if (value instanceof BigDecimal) {
            return String.format("new BigDecimal(\"%s\")", value);
        }
        if (value instanceof Integer) {
            return String.format("new Integer(%s)", value);
        }
        if (value instanceof Long) {
            return String.format("new Long(%s)", value);
        }
        if (value instanceof Boolean) {
            return value.toString();
        }
        if (value instanceof List) {
            String items = ((List<Object>)value)
                .stream()
                .map(item -> code(item))
                .collect(Collectors.joining(", "));
            return String.format("Arrays.asList(%s)",
                                 items);
        }
        if (value instanceof Record) {
            return ((Record)value).code();
        }
        if (value instanceof Map) {
            String values = ((Map<Object, Object>)value)
                .entrySet()
                .stream()
                .map(entry -> {
                        Object k = entry.getKey();
                        Object v = entry.getValue();
                        return String.format("%s, %s",
                                             code(k),
                                             code(v));
                    })
                .collect(Collectors.joining(", "));
            return String.format("mapOf(%s)",
                                 values);
        }

        String message =
            String.format("Value \"%s\" of unsupported class \"%s\".",
                          value,
                          value.getClass().getName());
        throw new IllegalArgumentException(message);
    }
}
