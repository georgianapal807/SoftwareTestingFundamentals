import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void shouldReturnZero() {
        Assertions.assertEquals(0, Fibonacci.getValueFromFibonacci(0));
    }

    @Test
    void shouldReturnOne() {
        Assertions.assertEquals(1, Fibonacci.getValueFromFibonacci(1));
    }

    @Test
    void shouldReturnValue() {
        Assertions.assertEquals(8, Fibonacci.getValueFromFibonacci(6));
        Assertions.assertEquals(144, Fibonacci.getValueFromFibonacci(12));
        Assertions.assertEquals(987, Fibonacci.getValueFromFibonacci(16));
    }

}