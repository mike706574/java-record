# record

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/fun.mike/record-alpha/badge.svg)](https://maven-badges.herokuapp.com/maven-central/fun.mike/record-alpha)
[![Javadocs](https://www.javadoc.io/badge/fun.mike/record-alpha.svg)](https://www.javadoc.io/doc/fun.mike/record-alpha)

A friendly heterogeneous map wrapper for Java.

## Examples

Here are a few examples. Look at the tests if you want more.

###

Import it.

```java
import fun.mike.record.alpha;
```

Build a `Record`.

```java
Record rec = Record.of("str", "bar",
                       "integ", 5,
                       "bigdec", new BigDecimal("1.0"),
                       "boole", true,
                       "long", 5L,
                       "list", Arrays.asList("foo", "bar"),
                       "map", new HashMap<>());
```

Pull out values with casting.

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

Get `java.util.Optional`'s instead.

```java
rec.optionalString("str").orElse("baz");
// => "bar"

rec.optionalString("wat").orElse("baz");
// => "baz"

rec.optionalInteger("wat").orElseThrow(() => new RuntimeException("wat"));
// => RuntimeException("wat")
```

`Record`'s are just `java.util.LinkedHashMap<String, Object>`.

```java
Object str = rec.get("str");
// => "bar"

Object str = rec.get("wat");
// => null
```

Which means they're mutable.

```java
rec.put("str", "baz");
// => {str=baz, integ=5, bigdec=1.0, boole=true, list=[foo, bar], map={}}
```

But you can use `assoc`, `dissoc`, and `select` to avoid mutation:
```java
Record orig = Record.of("a", 1, "b", 2, "c", 3);
// => {a=1, b=2, c=3}

Record withD = rec.assoc("d", 4);
// => {a=1, b=2, c=3, d=4}

Record withoutA = rec.dissoc("b");
// => {a=1, c=3}

Record aAndB = rec.select("a", "b");
// => {a=1, b=2}

orig
// => {a=1, b=2, c=3}
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
