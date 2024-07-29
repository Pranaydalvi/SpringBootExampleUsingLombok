# SpringBootExample_Lombok

This project demonstrates the use of Lombok annotations in a Spring Boot application for managing employee data. Lombok helps to reduce boilerplate code, making your classes more concise and readable.

## Why Use Lombok?

Lombok provides a set of annotations that automatically generate boilerplate code such as getters, setters, constructors, `toString`, `equals`, and `hashCode` methods. This reduces the amount of code you need to write, making your codebase cleaner and easier to maintain.

## Lombok Annotations

### @Setter

Generates setter methods for all fields in the class.

### @Setter

Generates getter methods for all fields in the class.

### @ToString
Generates a toString method that includes all fields in the class.

### @NoArgsConstructor
Generates a no-argument constructor. You can control the access level of the constructor.

### @EqualsAndHashCode
Generates equals and hashCode methods that include all fields in the class.

### @RequiredArgsConstructor
Generates a constructor with one parameter for each final field and for each field that is marked with @NonNull.

### @Data
A shortcut annotation that combines @Getter, @Setter, @ToString, @EqualsAndHashCode, and @RequiredArgsConstructor.

### @Builder
Provides a builder pattern implementation for your class.

### @Entity
Marks a class as a JPA entity.

#### Example Usage
### Without Builder
Creating an OrderEntity object without using the builder pattern:
- OrderEntity oe = new OrderEntity();
- oe.setId(12);
- oe.setOrderName("cake");
- oe.setOrderStatus("done");
- oe.setOrderType("online");
- System.out.println(oe);

### With Builder
Creating an OrderEntity object using the builder pattern:
- OrderEntity oe1 = OrderEntity.builder()
-     .id(1)
-   .orderName("pizza")
-       .orderStatus("done")
-       .orderType("cash")
-       .payment(Payment.builder().pid(1).status("done").build())
-       .build();
-   System.out.println(oe1);

###  Project Structure

The project is organized into the following packages:

- **`com.example.expo.model`**: Contains the entity classes used in the application.
  - `OrderEntity.java`: Represents the order details.
  - `Payment.java`: Represents the payment details.

- **`com.example.expo`**: Contains the main application class and configuration files.
  - `SpringBootExampleLombokApplication.java`: The main class that runs the Spring Boot application.

## Getting Started

To get started with this project, follow these steps:

1. **Clone the Repository**

   Clone the repository to your local machine using Git:

   ```bash
   git clone https://github.com/Pranaydalvi/SpringBootExampleUsingLombok.git
