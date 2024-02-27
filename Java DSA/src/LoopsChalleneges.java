import java.util.Scanner;

public class LoopsChalleneges {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Q4
        int number = scanner.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }
}