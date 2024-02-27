public class PrimeNumber {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {
            return isPrime;
        }
        else {
            for (int i = 2; i <= n -1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static boolean prime(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
        System.out.println(prime(17));
        primesInRange(10);
    }
}
