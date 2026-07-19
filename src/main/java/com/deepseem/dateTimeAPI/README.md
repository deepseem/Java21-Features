# 09 - Date Time API (Java 8)

## Overview

Java 8 introduced the **java.time** package to replace the old and problematic `java.util.Date` and `Calendar` APIs.

The new Date-Time API is:

- Immutable
- Thread-safe
- Easy to use
- ISO-8601 compliant
- More readable

---

# Why was the new Date-Time API introduced?

Problems with the old API:

- `java.util.Date` is mutable.
- `Calendar` API is difficult to use.
- Date formatting was not thread-safe (`SimpleDateFormat`).
- Month indexing started from 0 in some APIs.
- Poor timezone handling.

The `java.time` package solves these issues.

---

# Main Classes

| Class | Purpose |
|--------|---------|
| LocalDate | Represents a date (yyyy-MM-dd) |
| LocalTime | Represents time (HH:mm:ss) |
| LocalDateTime | Represents both date and time |
| ZonedDateTime | Date and time with timezone |
| Instant | Machine timestamp (UTC) |
| Period | Difference between dates |
| Duration | Difference between times |
| DateTimeFormatter | Formatting and parsing dates |
| ChronoUnit | Calculate differences in days, months, years |

---

# Project Structure

```text
09-Date-Time-API
│
├── README.md
├── 01_LocalDateExample.java
├── 02_LocalTimeExample.java
├── 03_LocalDateTimeExample.java
├── 04_CurrentDateTime.java
├── 05_DateFormatting.java
├── 06_ParseDate.java
├── 07_AddSubtractDays.java
├── 08_DateDifference.java
├── 09_PeriodExample.java
├── 10_DurationExample.java
├── 11_ZonedDateTimeExample.java
├── 12_InstantExample.java
├── 13_ChronoUnitExample.java
├── 14_CompareDates.java
├── 15_FindAge.java
├── 16_FirstLastDayOfMonth.java
├── 17_NextPreviousDay.java
├── 18_LeapYearExample.java
├── 19_DateTimeFormatterPatterns.java
└── 20_RealTimeEmployeeExperience.java
```

---

# Common Date Patterns

| Pattern | Example |
|---------|---------|
| yyyy-MM-dd | 2026-07-19 |
| dd-MM-yyyy | 19-07-2026 |
| dd/MM/yyyy | 19/07/2026 |
| MMM dd yyyy | Jul 19 2026 |
| EEEE | Sunday |
| HH:mm:ss | 14:30:45 |
| hh:mm a | 02:30 PM |

---

# Real-Time Use Cases

- Employee experience calculation
- Age calculation
- Subscription expiry
- Loan EMI dates
- Invoice generation
- Scheduling jobs
- Booking systems
- Attendance tracking

---

# Advantages

- Immutable
- Thread-safe
- Better timezone support
- Rich API
- Easy formatting/parsing
- Cleaner code

---

# Frequently Asked Interview Questions

1. Why was the Date-Time API introduced?
2. Difference between `Date` and `LocalDate`?
3. Difference between `Period` and `Duration`?
4. Difference between `LocalDateTime` and `ZonedDateTime`?
5. What is `Instant`?
6. How do you calculate age?
7. How do you format dates?
8. How do you parse a date string?
9. How do you calculate date differences?
10. What is `ChronoUnit`?

---

# Summary

- Introduced in Java 8 (`java.time`)
- Immutable and thread-safe
- Replaces `Date` and `Calendar`
- Supports formatting, parsing, timezone handling, and date/time calculations
- Widely used in Spring Boot, Hibernate, REST APIs, and enterprise applications
- One of the most frequently asked Java 8 interview topics

