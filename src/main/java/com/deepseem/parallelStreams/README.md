# 13 - Parallel Streams (Java 8)

## Overview

Parallel Streams were introduced in **Java 8** to process collections concurrently using multiple CPU cores. They simplify parallel programming by leveraging the **Fork/Join Framework** without requiring developers to manage threads manually.

---

# Why Parallel Streams?

Sequential Stream:

```java
employees.stream()
```

Parallel Stream:

```java
employees.parallelStream()
```

or

```java
employees.stream().parallel()
```

Parallel Streams automatically divide work into multiple tasks and execute them concurrently.

---

# How Parallel Streams Work

1. Split the collection into smaller chunks.
2. Submit tasks to the **ForkJoinPool.commonPool()**.
3. Process chunks in parallel.
4. Merge the results.

---

# Project Structure

```text
13-Parallel-Streams
│
├── README.md
├── Employee.java
├── EmployeeData.java
├── 01_BasicParallelStream.java
├── 02_StreamVsParallelStream.java
├── 03_ParallelForEach.java
├── 04_ParallelForEachOrdered.java
├── 05_ParallelFilterEmployees.java
├── 06_ParallelMapExample.java
├── 07_ParallelReduceExample.java
├── 08_ParallelSorting.java
├── 09_ParallelGroupingBy.java
├── 10_ParallelPerformanceComparison.java
├── 11_CustomForkJoinPool.java
├── 12_ThreadNameExample.java
├── 13_ParallelSumExample.java
├── 14_ParallelFindMaxSalary.java
└── 15_RealTimeReportGeneration.java
```

---

# Stream vs Parallel Stream

| Stream | Parallel Stream |
|--------|-----------------|
| Sequential processing | Concurrent processing |
| Single thread | Multiple threads |
| Maintains order | Order not guaranteed (unless `forEachOrdered()`) |
| Lower overhead | Better for CPU-intensive tasks on large datasets |
| Easier to reason about | Requires thread-safe operations |

---

# `forEach()` vs `forEachOrdered()`

| `forEach()` | `forEachOrdered()` |
|-------------|--------------------|
| Order not guaranteed in parallel | Preserves encounter order |
| Better throughput | Slightly slower due to ordering |

---

# Fork/Join Framework

Parallel Streams use:

```java
ForkJoinPool.commonPool()
```

Internally:

- Split tasks (Fork)
- Execute in parallel
- Merge results (Join)

---

# Advantages

- Simple parallel programming
- Better CPU utilization
- Improved performance for large datasets
- No explicit thread management
- Integrates seamlessly with Stream API

---

# Limitations

- Not always faster for small collections.
- Shared mutable state can cause race conditions.
- Overhead of task splitting and merging.
- Less suitable for I/O-bound operations.

---

# Best Practices

- Use immutable data where possible.
- Avoid shared mutable variables.
- Use associative operations with `reduce()`.
- Prefer `forEachOrdered()` only when ordering is required.
- Benchmark performance before switching from sequential streams.

---

# Real-Time Use Cases

- Report generation
- Data analytics
- Payroll processing
- Financial calculations
- Log processing
- Bulk validation
- Image processing
- Batch transformations

---

# Frequently Asked Interview Questions

1. What is a Parallel Stream?
2. How does it differ from a normal Stream?
3. What is the Fork/Join Framework?
4. What is `ForkJoinPool.commonPool()`?
5. Difference between `forEach()` and `forEachOrdered()`?
6. Is a Parallel Stream always faster?
7. When should you avoid Parallel Streams?
8. Can you modify shared collections in a Parallel Stream?
9. Difference between `parallelStream()` and `stream().parallel()`?
10. How can you use a custom `ForkJoinPool`?

---

# Summary

- Introduced in Java 8
- Uses the Fork/Join Framework internally
- Executes stream operations concurrently
- Best suited for CPU-intensive tasks with large datasets
- Requires thread-safe, stateless operations
- Common interview topic for Java backend developers

⭐ If you found this repository useful, consider giving it a Star.