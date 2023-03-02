import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void sum() {
        //given -se pregatesc obiectele de care avem nevoie
//        Calculator/*obiectul*/ calculator = new Calculator(); /*constructorul*/
        //when - se executa metoda pe care vrem sa o testam
        int result = calculator.sum(3, 5);
        //then -o sa vedem in principiu clasa de assertions
        Assertions.assertEquals(8, result);
    }

    @Test
    void addingFirstTest() {
        //then t-trebuie sa avem intotdeauna
        Assertions.assertEquals(17, calculator.sum(8, 9), "Testing the sum of  8 and 9");
    }

    @Test
    void addingSecondTest() {
        Assertions.assertEquals(64, calculator.sum(34, 30), "Testing the sum of 34 and 30");
    }

    @Test
    void addingThirdTest() {
        Assertions.assertEquals(0, calculator.sum(0, 0), "Testing the sum of 0 and 0");
    }

    @Test
    void subtractFirstTest() {
        Assertions.assertEquals(32, calculator.subtraction(64, 32), "Testing the subtraction 64-32");
    }

    @Test
    void subtractSecondTest() {
        Assertions.assertEquals(-10, calculator.subtraction(25, 35), "Testing the subtraction 25-35");
    }

    @Test
    void subtractThirdTest() {
        Assertions.assertEquals(0, calculator.subtraction(10, 10), "Testing the subtraction 10-10");
    }

    @Test
    void multiplyFirstTest() {
        Assertions.assertEquals(100, calculator.multiplication(1, 100), "Testing 1*100");
    }

    @Test
    void multiplySecondTest() {
        Assertions.assertEquals(0, calculator.multiplication(0, 0), "Testing 0*0");
    }

    @Test
    void multiplyThirdTest() {
        Assertions.assertEquals(-30, calculator.multiplication(-6, 5), "Testing -6*5");
    }

    @Test
    void divisionFirstTest() {
        Assertions.assertEquals(1, calculator.division(10, 10), "Testing the division between 10 and 10");
    }

    @Test
    void divisionSecondTest() {
        Assertions.assertEquals(0, calculator.division(0, 10), "Testing the division between 0 and 10");
    }

    @Test
    void divisionThirdTest() {
        Assertions.assertEquals(-3, calculator.division(9, -3), "Testing the division between 9 and -3");
    }

}
