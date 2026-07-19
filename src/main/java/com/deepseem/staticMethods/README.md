# 08 - Static Methods (Java 8)

# Overview

Java 8 introduced **Static Methods in Interfaces**.

Before Java 8, interfaces could only contain abstract methods.

Java 8 introduced:

- Default Methods
- Static Methods

Static methods belong to the interface itself, not to the implementing classes.

---

# Why Static Methods?

Suppose multiple classes need the same utility method.

Instead of creating a separate Utility class, Java 8 allows utility methods inside interfaces.

Example:

```java
interface Validator {

    static boolean isValid(String value){
        return value != null;
    }
}