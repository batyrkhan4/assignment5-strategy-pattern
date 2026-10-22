# Strategy Pattern — Calculator

## 1. Project Description

This project demonstrates the **Strategy Design Pattern** in Java.

The program is a simple calculator that supports four mathematical operations:
- Addition
- Subtraction
- Multiplication
- Division

The main goal is to demonstrate how different algorithms can be implemented in separate classes and changed at runtime without modifying the `Calculator` class.

## 2. Design Pattern

The **Strategy Pattern** is a behavioral design pattern. It defines a family of algorithms, encapsulates each one, and makes them interchangeable.

In this project, the pattern has the following components:

- **Strategy Interface:** `OperationStrategy` defines the common `execute()` method.
- **Concrete Strategies:** `AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`, and `DivideStrategy` implement different mathematical operations.
- **Context:** `Calculator` stores the selected strategy and delegates calculations to it.
- **Client:** `Main` creates the calculator, selects strategies, and demonstrates how they can be changed at runtime.

## 3. Project Structure

```text
src/
├── strategy/
│   ├── OperationStrategy.java
│   ├── AddStrategy.java
│   ├── SubtractStrategy.java
│   ├── MultiplyStrategy.java
│   └── DivideStrategy.java
├── context/
│   └── Calculator.java
└── Main.java
```

## 4. How It Works

The `Calculator` receives an `OperationStrategy` through its constructor.

The `calculate()` method calls `execute()` on the current strategy. The `setStrategy()` method allows the client to change the operation at runtime.

For example, the same calculator object can perform addition first and multiplication next by switching the selected strategy.

The division strategy also checks for division by zero and throws an `ArithmeticException` when the second number is zero.

## 5. Example Output

For the numbers `20` and `5`, the program produces:

```text
Addition: 25.0
Subtraction: 15.0
Multiplication: 100.0
Division: 4.0
```

## 6. Benefits

- **Flexibility:** The operation can be changed at runtime.
- **Maintainability:** Each mathematical operation is implemented in a separate class.
- **Extensibility:** New strategies can be added without changing the internal calculation logic of `Calculator`.
- **Loose Coupling:** `Calculator` depends on the `OperationStrategy` interface instead of specific operation classes.

## 7. Clean Code Principles

- **Depend on Abstractions:** `Calculator` uses the `OperationStrategy` interface rather than concrete strategy classes.
- **Single Responsibility Principle:** Each concrete strategy is responsible for one mathematical operation.
- **Encapsulation:** The selected strategy is stored in a private field.
- **Open/Closed Principle:** New operations can be added by implementing `OperationStrategy` without modifying `Calculator`.
- **Meaningful Names:** Class and method names describe their responsibilities clearly.

## 8. How to Run

1. Clone or download the repository.
2. Open the project in an IDE such as IntelliJ IDEA.
3. Make sure the Java Development Kit (JDK) is configured.
4. Run `Main.java`.

## 9. Conclusion

This project demonstrates how the Strategy Pattern separates algorithms from the class that uses them. By using a common interface and interchangeable strategies, the calculator becomes easier to maintain, extend, and modify.

## 10. Repository

GitHub: https://github.com/batyrkhan4/assignment5-strategy-pattern