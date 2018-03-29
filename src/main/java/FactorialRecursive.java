public class FactorialRecursive {
    public static int factorialRecursive(int i) {
        if (i <=1)
            return 1;
        else
            return i * factorialRecursive(i-1);
    }
}
