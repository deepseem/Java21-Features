# 12 - Map Enhancements (Java 8)

## Overview

Java 8 introduced several new methods to the `Map` interface that simplify common tasks such as conditional insertion, updating values, merging data, and iterating over entries.

These enhancements reduce boilerplate code and make `Map` operations more expressive.

---

# Why Map Enhancements?

Before Java 8:

```java
if (!map.containsKey(key)) {
    map.put(key, value);
}
```

Java 8:

```java
map.putIfAbsent(key, value);
```

This is shorter, cleaner, and easier to read.

---

# Java 8 Map Methods

| Method | Description |
|---------|-------------|
| `putIfAbsent()` | Adds a key-value pair only if the key is absent |
| `getOrDefault()` | Returns a default value if the key does not exist |
| `forEach()` | Iterates over all entries |
| `replace()` | Replaces the value of an existing key |
| `replaceAll()` | Replaces all values using a function |
| `compute()` | Computes a new value for a key |
| `computeIfAbsent()` | Computes a value only if the key is absent |
| `computeIfPresent()` | Computes a value only if the key exists |
| `merge()` | Merges values using a remapping function |
| `remove(key, value)` | Removes an entry only if both key and value match |

---

# Project Structure

```text
12-Map-Enhancements
│
├── README.md
├── 01_PutIfAbsentExample.java
├── 02_GetOrDefaultExample.java
├── 03_ForEachExample.java
├── 04_ReplaceExample.java
├── 05_ReplaceAllExample.java
├── 06_ComputeExample.java
├── 07_ComputeIfAbsentExample.java
├── 08_ComputeIfPresentExample.java
├── 09_MergeExample.java
├── 10_RemoveExample.java
├── 11_WordFrequencyCounter.java
├── 12_StudentMarksExample.java
├── 13_EmployeeSalaryIncrement.java
├── 14_CacheExample.java
└── 15_RealTimeInventoryExample.java
```

---

# Advantages

- Reduces boilerplate code
- Improves readability
- Simplifies conditional updates
- Supports functional programming
- Integrates well with Lambda Expressions

---

# Real-Time Use Cases

- Word frequency counting
- Inventory management
- Caching
- Salary updates
- Student marks processing
- Shopping cart quantity updates
- Session management

---

# Frequently Asked Interview Questions

1. What are Map Enhancements in Java 8?
2. What is the difference between `put()` and `putIfAbsent()`?
3. How does `getOrDefault()` work?
4. Explain `compute()`, `computeIfAbsent()`, and `computeIfPresent()`.
5. What is the purpose of `merge()`?
6. When would you use `replaceAll()`?
7. What is the difference between `compute()` and `merge()`?
8. How can `merge()` be used to count word frequencies?
9. Is `forEach()` on `Map` different from `Stream.forEach()`?
10. What are some real-world use cases of Java 8 Map enhancements?

---

# Best Practices

- Use `putIfAbsent()` instead of manually checking `containsKey()`.
- Use `merge()` for counters and aggregations.
- Use `computeIfAbsent()` for lazy initialization or caching.
- Use `replaceAll()` for bulk updates.
- Keep remapping functions free of side effects.

---

# Summary

- Introduced in Java 8
- Added powerful functional methods to the `Map` interface
- Simplifies insertion, updates, iteration, and aggregation
- Frequently used in enterprise Java applications
- Common topic in Java 8 and Spring Boot interviews
