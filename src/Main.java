import context.Calculator;
import strategy.AddStrategy;
import strategy.DivideStrategy;
import strategy.MultiplyStrategy;
import strategy.SubtractStrategy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddStrategy());

        double a = 20;
        double b = 5;

        System.out.println("Addition: " + calculator.calculate(a, b));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Substraction: " + calculator.calculate(a, b));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + calculator.calculate(a, b));

        calculator.setStrategy(new DivideStrategy());
        System.out.println("Division: " + calculator.calculate(a, b));
    }
}