import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        double result = 3.14 * radius * radius;
        System.out.println(result);
    }
}
