public class Fibonacci {

    public static int getValueFromFibonacci(int element) {
        if (element == 0 || element == 1) {
            return element;
        }
        return getValueFromFibonacci(element - 2) + getValueFromFibonacci(element - 1);
    }
}
