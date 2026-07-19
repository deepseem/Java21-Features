# 11 - Collectors (Java 8)

## Overview

The **Collectors** class, introduced in Java 8 (`java.util.stream.Collectors`), provides a rich set of utility methods for collecting and transforming Stream results into collections, maps, summary statistics, grouped data, and more.

Collectors are typically used as the terminal operation in a Stream pipeline with the `collect()` method.

---

# Why Collectors?

Without Collectors:

```java
List<String> names = new ArrayList<>();
for (Employee emp : employees) {
    names.add(emp.getName());
}
```

With Collectors:

```java
List<String> names = employees.stream()
                              .map(Employee::getName)
                              .collect(Collectors.toList());
```

Collectors reduce boilerplate code and improve readability.

---

# Syntax

```java
stream.collect(Collectors.method());
```

Example:

```java
employees.stream()
         .collect(Collectors.toList());
```

---

# Common Collectors

| Collector | Purpose |
|-----------|---------|
| `toList()` | Collect elements into a List |
| `toSet()` | Collect unique elements into a Set |
| `toMap()` | Convert Stream to Map |
| `joining()` | Join Strings |
| `counting()` | Count elements |
| `groupingBy()` | Group by key |
| `partitioningBy()` | Partition into true/false groups |
| `mapping()` | Transform elements during collection |
| `averagingDouble()` | Calculate average |
| `summingDouble()` | Calculate total |
| `maxBy()` | Maximum element |
| `minBy()` | Minimum element |
| `summarizingDouble()` | Count, Sum, Min, Max, Average |
| `collectingAndThen()` | Apply a finishing transformation |
| `filtering()` *(Java 9+)* | Filter during collection |
| `flatMapping()` *(Java 9+)* | Flatten nested structures |
| `teeing()` *(Java 12+)* | Combine results from two collectors |

---

# Project Structure

```text
11-Collectors
│
├── README.md
├── Employee.java
├── EmployeeData.java
├── 01_CollectToList.java
├── 02_CollectToSet.java
├── 03_CollectToMap.java
├── 04_GroupByDepartment.java
├── 05_CountEmployeesByDepartment.java
├── 06_AverageSalary.java
├── 07_TotalSalary.java
├── 08_MaxSalaryEmployee.java
├── 09_MinSalaryEmployee.java
├── 10_PartitionBySalary.java
├── 11_JoiningEmployeeNames.java
├── 12_SummarizingSalary.java
├── 13_MappingExample.java
├── 14_FilteringCollectors.java
├── 15_CollectingAndThen.java
├── 16_TeeingCollector.java
├── 17_GroupByGender.java
├── 18_NestedGrouping.java
├── 19_FlatMappingExample.java
└── 20_RealTimeEmployeeReport.java
```

---

# Advantages

- Reduces boilerplate code
- Simplifies data aggregation
- Improves readability
- Supports complex grouping and summarization
- Works seamlessly with Streams

---

# Real-Time Use Cases

- Employee reports
- Sales summaries
- Dashboard analytics
- Grouping API responses
- Financial calculations
- Order processing
- Log aggregation
- Customer segmentation

---

# Frequently Asked Interview Questions

1. What is `Collectors` in Java 8?
2. Difference between `collect()` and `Collectors`?
3. Explain `groupingBy()`.
4. Difference between `groupingBy()` and `partitioningBy()`?
5. Difference between `toList()` and `toSet()`?
6. What is `joining()`?
7. Explain `summarizingDouble()`.
8. What is `collectingAndThen()`?
9. What is `mapping()`?
10. What is `teeing()` and in which Java version was it introduced?

---

# Summary

- Introduced in Java 8
- Used with the Stream API
- Converts Streams into collections and summary results
- Supports grouping, partitioning, aggregation, and transformation
- One of the most frequently asked Java 8 interview topics
- Widely used in Spring Boot and enterprise applications

⭐ If you found this repository useful, consider giving it a Star.