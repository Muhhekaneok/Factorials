public class LoopDemo {
    public static void main(String[] args) {
        System.out.println(getFactorialByLoop(5));
    }
    private static int getFactorialByLoop(int n) {
        int x = 1;
        for (int i = n; i >= 1; i--) {
            x *= i;
        }
        return x;
    }
}
