# 07 - Default Methods (Java 8)

## Overview

Default Methods were introduced in **Java 8** to allow interfaces to contain method implementations.

Before Java 8, interfaces could only have abstract methods.

Java 8 introduced:

- Default Methods
- Static Methods

Java 9 additionally introduced:

- Private Methods in Interfaces

---

# Why Default Methods?

Suppose an interface is implemented by hundreds of classes.

Adding a new abstract method would require every implementation class to change.

Default methods solve this by providing a default implementation.

---

# Syntax

```java
interface Vehicle {

    default void start() {
        System.out.println("Vehicle Started");
    }
}
```

---

# Features

- Introduced in Java 8
- Have implementation
- Can be overridden
- Supports backward compatibility
- Works with Lambda Expressions
- Can coexist with abstract methods

---

# Project Structure

```

07-Default-Methods
│
├── README.md
├── 01_BasicDefaultMethod.java
├── 02_DefaultMethodOverride.java
├── 03_MultipleInheritanceDefaultMethod.java
├── 04_InterfaceStaticMethod.java
├── 05_DefaultMethodWithLambda.java
├── 06_DefaultMethodWithStreams.java
├── 07_DefaultMethodRealTimeExample.java
├── 08_DefaultMethodVsAbstractClass.java
├── 09_DefaultMethodPrivateMethod.java
└── 10_FunctionalInterfaceWithDefaultMethod.java

```

---

# Programs Included

| No | Program |
|----|----------|
|01|Basic Default Method|
|02|Override Default Method|
|03|Multiple Inheritance Conflict|
|04|Interface Static Method|
|05|Lambda + Default Method|
|06|Default Method with Streams|
|07|Real-Time Notification Example|
|08|Default Method vs Abstract Class|
|09|Private Method in Interface (Java 9+)|
|10|Functional Interface + Default Method|

---

# Default Method vs Abstract Method

| Default Method | Abstract Method |
|---------------|-----------------|
|Has implementation|No implementation|
|Can be overridden|Must be overridden|
|Introduced in Java 8|Available since Java 1.0|

---

# Advantages

- Backward Compatibility
- Less Boilerplate Code
- Better Code Reuse
- Easy API Evolution

---

# Limitations

- Multiple interface conflicts must be resolved.
- Cannot store instance variables.
- Should not contain complex business logic.

---

# Real-Time Use Cases

- Logging
- Notification Services
- Validation
- Utility Methods
- Stream Processing

---

# Interview Questions

1. What is a Default Method?
2. Why was it introduced?
3. Can it be overridden?
4. Can an interface have multiple Default Methods?
5. What happens if two interfaces have the same Default Method?
6. Difference between Default and Static Methods?
7. Difference between Default Methods and Abstract Classes?
8. Can a Functional Interface contain Default Methods?
9. Can Default Methods access instance variables?
10. What are Private Methods in Interfaces?

---

# Summary

- Introduced in Java 8
- Supports backward compatibility
- Provides method implementation inside interfaces
- Can be overridden
- Helps evolve APIs without breaking existing implementations
- Frequently asked in Java Backend interviews