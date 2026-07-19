# 10 - forEach() Method (Java 8)

## Overview

The `forEach()` method was introduced in **Java 8** to iterate over collections and streams in a simple and functional way.

It is a **terminal operation** in the Stream API, meaning it consumes the stream and does not return another stream.

---

# Syntax

```java
collection.forEach(element -> {
    System.out.println(element);
});
```

Using a Method Reference:

```java
collection.forEach(System.out::println);
```

---

# Why use `forEach()`?

- Simplifies iteration
- Eliminates explicit `for` and `Iterator` loops
- Integrates seamlessly with Streams
- Supports Lambda Expressions and Method References
- Produces cleaner, more readable code

---

# Project Structure

```text
10-forEach
│
├── README.md
├── Employee.java
├── EmployeeData.java
├── 01_ForEachWithList.java
├── 02_ForEachWithSet.java
├── 03_ForEachWithMap.java
├── 04_ForEachWithStream.java
├── 05_ForEachWithMethodReference.java
├── 06_ForEachEmployeeNames.java
├── 07_ForEachFilterEmployees.java
├── 08_ForEachSortEmployees.java
├── 09_ForEachUpdateSalary.java
├── 10_ForEachParallelStream.java
├── 11_ForEachOrdered.java
├── 12_ForEachIndexExample.java
├── 13_ForEachMapValues.java
├── 14_ForEachNestedCollection.java
└── 15_ForEachRealTimeExample.java
```

---

# Programs Included

| No | Program | Concept |
|----|---------|---------|
|01|forEach with List|Basic iteration|
|02|forEach with Set|Set traversal|
|03|forEach with Map|Map traversal|
|04|forEach with Stream|Stream terminal operation|
|05|Method Reference|`System.out::println`|
|06|Employee Names|Lambda|
|07|Filter + forEach|Filtering|
|08|Sort + forEach|Sorting|
|09|Update Salary|Transformation during iteration|
|10|Parallel Stream|Parallel execution|
|11|forEachOrdered|Maintaining order|
|12|Index Example|IntStream|
|13|Map Values|Map iteration|
|14|Nested Collections|Nested `forEach()`|
|15|Real-Time Example|Employee filtering|

---

# `forEach()` vs `forEachOrdered()`

| `forEach()` | `forEachOrdered()` |
|-------------|--------------------|
|Order not guaranteed in parallel streams|Maintains encounter order|
|Faster in parallel|Slightly slower due to ordering|
|Preferred when order doesn't matter|Use when output order matters|

Example:

```java
list.parallelStream().forEach(System.out::println);
```

```java
list.parallelStream().forEachOrdered(System.out::println);
```

---

# Advantages

- Concise code
- Functional programming style
- Works with Lambda Expressions
- Supports Method References
- Integrates with Stream API

---

# Limitations

- Terminal operation; cannot continue the stream pipeline afterward.
- Not suitable when you need to break or continue like a traditional loop.
- Avoid modifying the source collection during iteration.

---

# Real-Time Use Cases

- Logging records
- Sending notifications
- Processing API responses
- Exporting reports
- Displaying search results
- Processing employee lists

---

# Frequently Asked Interview Questions

1. What is `forEach()` in Java 8?
2. Is `forEach()` an intermediate or terminal operation?
3. What is the difference between `forEach()` and `forEachOrdered()`?
4. Can `forEach()` be used with collections and streams?
5. Can we break out of a `forEach()` loop?
6. Is `forEach()` thread-safe with parallel streams?
7. What is the difference between `Collection.forEach()` and `Stream.forEach()`?
8. Can we modify the source collection inside `forEach()`?
9. When should `forEachOrdered()` be used?
10. How does `forEach()` work with Method References?

---

# Best Practices

- Use `forEach()` for side effects such as logging or printing.
- Prefer Method References (`System.out::println`) when possible.
- Avoid mutating shared state inside `parallelStream().forEach()`.
- Use `forEachOrdered()` if the order of processing is important.

---

# Summary

- Introduced in Java 8
- Available on both `Collection` and `Stream`
- Terminal Stream operation
- Supports Lambda Expressions and Method References
- Widely used in enterprise applications and Spring Boot projects
- Frequently asked in Java 8 interviews

⭐ If you found this repository helpful, consider giving it a Star.