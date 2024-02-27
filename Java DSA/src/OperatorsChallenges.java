import java.util.Scanner;

public class OperatorsChallenges {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*Q1
        int a = scanner.nextInt();
        if (a > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");

         */

        /*Q2
        double temp = 103.5;
        if (temp > 100)
            System.out.println("you have fever");
        else
            System.out.println("you don't have fever");

         */

        /*Q3
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("wrong input");
                break;
        }

         */

        /*Q4
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
        System.out.println(x);
        System.out.println(y);

         */

        //Q5
        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0)
            System.out.println("leap year");
        else if(year % 100 == 0 && year % 400 == 0)
            System.out.println("leap year");
        else
            System.out.println("not leap year");
    }
}
