public class Power {
    public static void main(String[] args) {
        double x = 3;
        int n = 4;
        double result = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }

    public static double power(double x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: x^n = x * x^(n-1)
        return x * power(x, n - 1);
    }
}
