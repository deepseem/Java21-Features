# 06 - Method References (Java 8)

## Overview

Method References were introduced in **Java 8** to provide a concise and readable way to refer to methods or constructors using the `::` operator.

A Method Reference is simply a shorthand for a Lambda Expression when the lambda expression only calls an existing method.

Instead of writing:

```java
list.forEach(name -> System.out.println(name));
```

You can write:

```java
list.forEach(System.out::println);
```

Both statements produce the same result, but the Method Reference version is cleaner and easier to read.

---

# Why Method References?

Method References improve:

- Code readability
- Maintainability
- Reusability
- Less boilerplate code
- Cleaner Stream API code

---

# Syntax

```java
ClassName::staticMethod
```

```java
objectReference::instanceMethod
```

```java
ClassName::instanceMethod
```

```java
ClassName::new
```

---

# Types of Method References

Java 8 supports four types of Method References.

## 1. Static Method Reference

Reference a static method.

### Lambda

```java
list.forEach(value -> Utility.print(value));
```

### Method Reference

```java
list.forEach(Utility::print);
```

Syntax

```java
ClassName::staticMethod
```

Example

```java
Math::abs
```

---

## 2. Instance Method Reference of a Particular Object

Reference an instance method using an object.

### Lambda

```java
Printer printer = new Printer();

list.forEach(value -> printer.print(value));
```

### Method Reference

```java
list.forEach(printer::print);
```

Syntax

```java
objectReference::instanceMethod
```

---

## 3. Instance Method Reference of an Arbitrary Object

Reference an instance method where the object is supplied by the Stream.

### Lambda

```java
list.stream()
    .map(name -> name.toUpperCase())
    .forEach(System.out::println);
```

### Method Reference

```java
list.stream()
    .map(String::toUpperCase)
    .forEach(System.out::println);
```

Syntax

```java
ClassName::instanceMethod
```

Examples

```java
String::length

String::toUpperCase

Employee::getSalary

Employee::getName
```

---

## 4. Constructor Reference

Reference a constructor instead of calling it explicitly.

### Lambda

```java
EmployeeFactory factory =
(id,name,dept,salary) ->
new Employee(id,name,dept,salary);
```

### Method Reference

```java
EmployeeFactory factory = Employee::new;
```

Syntax

```java
ClassName::new
```

---

# Lambda vs Method Reference

Lambda

```java
employee -> employee.getName()
```

Method Reference

```java
Employee::getName
```

---

Lambda

```java
name -> System.out.println(name)
```

Method Reference

```java
System.out::println
```

---

Lambda

```java
name -> name.toUpperCase()
```

Method Reference

```java
String::toUpperCase
```

---

# Project Structure

```
06-Method-References
│
├── Employee.java
├── EmployeeData.java
│
├── 01_StaticMethodReference.java
├── 02_InstanceMethodReference.java
├── 03_InstanceMethodReferenceUsingObject.java
├── 04_ConstructorReference.java
├── 05_ForEachMethodReference.java
├── 06_SortUsingMethodReference.java
├── 07_MapUsingMethodReference.java
├── 08_FilterAndMethodReference.java
├── 09_CollectNamesUsingMethodReference.java
├── 10_ConvertToUpperCase.java
├── 11_PrintEmployeeNames.java
├── 12_FindHighestSalary.java
├── 13_GroupByDepartment.java
├── 14_MethodReferenceWithComparator.java
└── 15_CustomMethodReference.java
```

---

# Programs Included

| No | Program | Concept |
|----|----------|----------|
|01|Static Method Reference|Class::staticMethod|
|02|Instance Method Reference|object::method|
|03|Instance Method Reference (String)|String::toUpperCase|
|04|Constructor Reference|Employee::new|
|05|forEach() Method Reference|System.out::println|
|06|Sorting using Method Reference|Comparator.comparing()|
|07|Mapping using Method Reference|Employee::getName|
|08|Filtering with Method Reference|Stream API|
|09|Collecting Names|Collectors.toList()|
|10|Convert to Uppercase|String::toUpperCase|
|11|Print Employee Names|Employee::getName|
|12|Find Highest Salary|Comparator.comparing()|
|13|Group Employees by Department|Collectors.groupingBy()|
|14|Comparator with Method Reference|Employee::getName|
|15|Custom Method Reference|Custom Functional Interface|

---

# Advantages

- Improves readability
- Less code
- Easy to understand
- Better maintainability
- Eliminates unnecessary Lambda expressions
- Works seamlessly with Stream API
- Promotes code reuse

---

# Limitations

- Cannot replace every Lambda Expression.
- Works only when the Lambda directly invokes an existing method.
- Complex logic still requires Lambda Expressions.

---

# Method Reference with Streams

Filter Employees

```java
employees.stream()
         .filter(emp -> emp.getSalary() > 50000)
         .forEach(System.out::println);
```

Map Employee Names

```java
employees.stream()
         .map(Employee::getName)
         .forEach(System.out::println);
```

Sort Employees

```java
employees.stream()
         .sorted(Comparator.comparing(Employee::getSalary))
         .forEach(System.out::println);
```

Find Maximum Salary

```java
employees.stream()
         .max(Comparator.comparing(Employee::getSalary));
```

---

# Commonly Used Method References

```java
System.out::println

String::length

String::toUpperCase

String::toLowerCase

Employee::getName

Employee::getSalary

Employee::new

Math::abs

Integer::parseInt

Long::parseLong

Double::parseDouble
```

---

# Interview Questions

### What is Method Reference?

A Method Reference is a shorthand notation for a Lambda Expression that directly calls an existing method.

---

### Why was Method Reference introduced?

- Improve readability
- Reduce boilerplate code
- Make Stream API code cleaner

---

### How many types of Method References are available?

There are four types:

1. Static Method Reference
2. Instance Method Reference (Particular Object)
3. Instance Method Reference (Arbitrary Object)
4. Constructor Reference

---

### Difference between Lambda Expression and Method Reference?

| Lambda | Method Reference |
|---------|------------------|
| More flexible | More readable |
| Can contain multiple statements | References an existing method |
| Suitable for complex logic | Suitable for simple method calls |

---

### Can every Lambda Expression be converted into a Method Reference?

No.

Only Lambda Expressions that simply call an existing method can be converted.

Example:

```java
employee -> employee.getName()
```

becomes

```java
Employee::getName
```

But this cannot:

```java
employee -> {
    employee.setSalary(employee.getSalary()+1000);
    return employee;
}
```

---

# Summary

- Introduced in Java 8
- Uses the `::` operator
- Improves readability
- Eliminates unnecessary Lambda Expressions
- Works perfectly with Streams
- Supports Static, Instance, Arbitrary Object, and Constructor references
- Frequently asked in Java Backend interviews

---

⭐ If you found this repository useful, consider giving it a Star.