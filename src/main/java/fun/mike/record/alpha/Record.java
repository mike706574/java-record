package fun.mike.record.alpha;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    public <T> List<T> getList(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof List) {
            return (List<T>) value;
        }
        throw new TypeMismatchException(key, value, "list", value.getClass().getName());
    }

    public <K, V> Map<K, V> getMap(String key) {
        Object value = this.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof Map) {
            return (Map<K, V>) value;
        }
        throw new TypeMismatchException(key, value, "map", value.getClass().getName());
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
        return this;
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
        return this;
    }
}
