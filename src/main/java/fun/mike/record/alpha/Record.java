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
}
