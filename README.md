# SpringBootExample_Lombok

This project demonstrates the use of Lombok annotations in a Spring Boot application for managing employee data. Lombok helps to reduce boilerplate code, making your classes more concise and readable.

## Why Use Lombok?

Lombok provides a set of annotations that automatically generate boilerplate code such as getters, setters, constructors, `toString`, `equals`, and `hashCode` methods. This reduces the amount of code you need to write, making your codebase cleaner and easier to maintain.

## Lombok Annotations

### @Setter

Generates setter methods for all fields in the class.

```java
@Setter
public class Example {
    private String name;
}

### @Getter

Generates getter methods for all fields in the class.

```java
@Getter
public class Example {
    private String name;
}
