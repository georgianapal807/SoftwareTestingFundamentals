public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public long multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(int dividend, int divisor) {
        int result;
        try {
            result = dividend / divisor;
            return result;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Operatia nu are sens");
        }
    }

}
