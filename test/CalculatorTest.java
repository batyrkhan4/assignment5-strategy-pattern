
import context.Calculator;
import org.junit.jupiter.api.Test;
import strategy.AddStrategy;
import strategy.MultiplyStrategy;
import strategy.DivideStrategy;
import strategy.SubtractStrategy;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void additionReturnsCorrectResult() {
        Calculator calculator = new Calculator(new AddStrategy());

        assertEquals(25.0, calculator.calculate(20, 5));
    }

    @Test
    void subtractionReturnsCorrectResult() {
        Calculator calculator = new Calculator(new SubtractStrategy());

        assertEquals(15.0, calculator.calculate(20, 5));
    }

    @Test
    void multiplicationReturnsCorrectResult() {
        Calculator calculator = new Calculator(new MultiplyStrategy());

        assertEquals(100.0, calculator.calculate(20, 5));
    }

    @Test
    void divisionReturnsCorrectResult() {
        Calculator calculator = new Calculator(new DivideStrategy());

        assertEquals(4.0, calculator.calculate(20, 5));
    }

    @Test
    void divisionByZeroThrowsException() {
        Calculator calculator = new Calculator(new DivideStrategy());

        assertThrows(
                ArithmeticException.class,
                () -> calculator.calculate(20, 0)
        );
    }

    @Test
    void constructorRejectsNullStrategy() {
        assertThrows(
                NullPointerException.class,
                () -> new Calculator(null)
        );
    }

    @Test
    void setStrategyRejectsNull() {
        Calculator calculator = new Calculator(new AddStrategy());

        assertThrows(
                NullPointerException.class,
                () -> calculator.setStrategy(null)
        );
    }

    @Test
    void calculatorCanSwitchStrategyAtRuntime() {
        Calculator calculator = new Calculator(new AddStrategy());

        assertEquals(25.0, calculator.calculate(20, 5));

        calculator.setStrategy(new MultiplyStrategy());

        assertEquals(100.0, calculator.calculate(20, 5));
    }
}
