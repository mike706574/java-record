package fun.mike.record.alpha;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Record extends LinkedHashMap<String, Object> {
    public Record() {
        super();
    }

    public Record(Record record) {
        super(record);
    }

    public Record(Map<String, Object> map) {
        super(map);
    }

    public static Record of() {
        return new Record();
    }

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

    public Record dissoc(String... keys) {
        return dissoc(Arrays.asList(keys));
    }

    public Record dissoc(Collection<String> keys) {
        Record record = new Record();
        record.putAll(this);
        for (String key : keys) {
            record.remove(key);
        }
        return record;
    }

    public Record select(String... keys) {
        return select(Arrays.asList(keys));
    }

    public Record select(Collection<String> keys) {
        Record record = new Record();
        for (String key : keys) {
            if (containsKey(key)) {
                record.put(key, get(key));
            }
        }
        return record;
    }

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

    public Record set(String k1, Object v1) {
        put(k1, v1);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2) {
        Record record = new Record();
        put(k1, v1);
        put(k2, v2);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3) {
        Record record = new Record();
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4) {
        Record record = new Record();
        put(k1, v1);
        put(k2, v2);
        put(k3, v3);
        put(k4, v4);
        return this;
    }

    public Record set(String k1, Object v1, String k2, Object v2,
            String k3, Object v3, String k4, Object v4,
            String k5, Object v5) {
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
        Record record = new Record();
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
}
