package context;

import strategy.OperationStrategy;

import java.util.Objects;

public class Calculator {
    private OperationStrategy operation;
    public Calculator(OperationStrategy operation) {
        this.operation = Objects.requireNonNull(operation, "operation cannot be null");
    }

    public void setStrategy(OperationStrategy operation) {
        this.operation = Objects.requireNonNull(operation, "operation cannot be null");
    }

    public double calculate(double a, double b) {
        return operation.execute(a, b);
    }
}
