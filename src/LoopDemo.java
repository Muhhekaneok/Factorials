public class LoopDemo {
    public static void main(String[] args) {
        System.out.println(getFactorialByLoop(5));
        System.out.println(getFactorialByRecursion(4));
    }

    // loop
    private static int getFactorialByLoop(int n) {
        int x = 1;
        for (int i = n; i >= 1; i--) {
            x *= i;
        }
        return x;
    }

    // recursion
    private static int getFactorialByRecursion(int n) {
        if (n == 1)
            return 1;
        return getFactorialByRecursion(n - 1) * n;
    }
}
