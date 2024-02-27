import java.util.Scanner;

public class BionomialCoefficient {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }
    public static int bionomial(int n, int r) {
        int nfact = fact(n);
        int rfact = fact(r);
        int nmrfact = fact(n - r);
        int bionomial = nfact/(rfact * nmrfact);
        return bionomial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(bionomial(n, r));
    }
}
