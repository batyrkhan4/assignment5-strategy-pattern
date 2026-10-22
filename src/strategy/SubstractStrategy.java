package strategy;

public class SubstractStrategy implements OperationStrategy {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
