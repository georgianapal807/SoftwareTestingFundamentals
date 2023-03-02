import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest2 {
    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void sumTest() {
        Assertions.assertThat(calculator.sum(3, 5)).isEqualTo(8);
    }

    @Test
    void subtractTest() {
        Assertions.assertThat(calculator.subtraction(12, 10)).isPositive().isEqualTo(2);
    }

    @Test
    void multiplicationTest() {
        Assertions.assertThat(calculator.multiplication(0, 100)).isEqualTo(0).isGreaterThanOrEqualTo(0);
    }

    @Test
    void divisionTest(){
        Assertions.assertThat(calculator.division(100,10)).isEqualTo(10).isBetween(0,100);
    }
}
