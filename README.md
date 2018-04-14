# record

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/fun.mike/record-alpha/badge.svg)](https://maven-badges.herokuapp.com/maven-central/fun.mike/record-alpha)
[![Javadocs](https://www.javadoc.io/badge/fun.mike/record-alpha.svg)](https://www.javadoc.io/doc/fun.mike/record-alpha)

A friendly heterogeneous map class for Java.

## Examples

Import it:

```java
import fun.mike.record.alpha;
```

Make a `Record` by passing alternating keys and values:

```java
Record rec = Record.of("str", "bar",
                       "integ", 5,
                       "bigdec", new BigDecimal("1.0"),
                       "boole", true,
                       "long", 5L,
                       "list", Arrays.asList("foo", "bar"),
                       "map", new HashMap<>());
```

Pull out values without casting:

```java
String str = rec.getString("str");
// => "bar"

Integer integ = rec.getInteger("integ");
// => 5

BigDecimal bigdec = rec.getBigDecimal("bigdec");
// => 1.0

Boolean boole = rec.getBoolean("boole");
// => true

BigDecimal bigdec = rec.getLong("bigdec");
// => 1.0

List<String> = rec.getList("list"); // => [foo, bar]
// => [foo, bar]

Map<String, String> = rec.getMap("map");
// => {}
```

Get `java.util.Optional`s instead:

```java
rec.optionalString("str").orElse("baz");
// => "bar"

rec.optionalString("wat").orElse("baz");
// => "baz"

rec.optionalInteger("wat").orElseThrow(() => new RuntimeException("wat"));
// => RuntimeException: wat
```

Here are all the access methods available:

| Class                | Value         | java.util.Optional |
| -------------------- | ------------- | ------------------ |
| java.lang.String     | getString     | optionalString     |
| java.lang.Boolean    | getBoolean    | optionalBoolean    |
| java.lang.Integer    | getInteger    | optionalInteger    |
| java.lang.Long       | getLong       | optionalLong       |
| java.lang.Float      | getFloat      | optionalFloat      |
| java.lang.Double     | getDouble     | optionalDouble     |
| java.math.BigDecimal | getBigDecimal | optionalBigDecimal |
| java.util.Date       | getDate       | optionalDate       |
| java.util.List       | getList       | optionalList       |
| java.util.Map        | getMap        | optionalMap        |
| fun.mike.Record      | getRecord     | getRecord          |

A `fun.mike.record.alpha.TypeMismatchException` is thrown when the present value doesn't match the expected type:

```java
Integer str = rec.getInteger("str");
=> fun.mike.record.alpha.TypeMismatchException: Value "foo" of class "java.lang.String" for key "str" must be an integer.
```

`Record`s extend `java.util.LinkedHashMap<String, Object>`:

```java
Object str = rec.get("str");
// => "bar"

Object str = rec.get("wat");
// => null
```

So they're mutable:

```java
Record rec = Record.of("a", 1, "b", 2, "c", 3);
// => {a=1, b=2, c=3}

rec.put("d", "3");
// => {a=1, b=2, c=3, d=4}

rec
// => {a=1, b=2, c=3, d=4}
```

But you can use `assoc`, `dissoc`, and `select` to avoid mutation:

```java
Record rec = Record.of("a", 1, "b", 2, "c", 3);
// => {a=1, b=2, c=3}

Record withD = rec.assoc("d", 4);
// => {a=1, b=2, c=3, d=4}

Record withoutA = rec.dissoc("a");
// => {b=2, c=3}

Record aAndB = rec.select("a", "b");
// => {a=1, b=2}

rec
// => {a=1, b=2, c=3}
```

But you can use `assoc`, `dissoc`, and `select` to avoid mutation:

```java
Record rec = Record.of("a", 1, "b", 2, "c", 3);
// => {a=1, b=2, c=3}

Record withD = rec.assoc("d", 4);
// => {a=1, b=2, c=3, d=4}

Record withoutA = rec.dissoc("a");
// => {b=2, c=3}

Record aAndB = rec.select("a", "b");
// => {a=1, b=2}

rec
// => {a=1, b=2, c=3}
```

Or use `set` to do a lot of mutation at once:

```java
Record rec = Record.of("a", 1, "b", 2, "c", 3);
// => {a=1, b=2, c=3}

rec.set("b", 3, "c", 4, "d", 5, "e", 6);
// => {a=1, b=3, c=4, d=5, e=6}

rec
// => {a=1, b=3, c=4, d=5, e=6}
```

## Build

[![CircleCI](https://circleci.com/gh/mike706574/java-record.svg?style=svg)](https://circleci.com/gh/mike706574/java-record)

## Copyright and License

The use and distribution terms for this software are covered by the
[Eclipse Public License 1.0] which can be found in the file
epl-v10.html at the root of this distribution. By using this softwaer
in any fashion, you are agreeing to be bound by the terms of this
license. You must not remove this notice, or any other, from this
software.

[Eclipse Public License 1.0]: http://opensource.org/licenses/eclipse-1.0.php
