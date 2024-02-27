public class FibonnaciRecursion {
    public static int fibonnaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonnaci(n - 2) + fibonnaci(n - 1);
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibonnaci(n));
    }
}
