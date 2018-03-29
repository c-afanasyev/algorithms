public class FactorialNonRecursive {
    public static int factorialNonRecursive(int i) {
        if (i <= 0)
            return 1;
        else {
            int factorial = 1;

            for ( ; i > 1; i--) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }
}
