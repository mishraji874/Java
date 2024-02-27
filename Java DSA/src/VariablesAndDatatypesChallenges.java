import java.util.Scanner;

public class VariablesAndDatatypesChallenges {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*Q1
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        float average = (a + b + c) / 3;
        System.out.println(average);
        */

        /*Q2
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        float area = length * breadth;
        System.out.println(area);
         */

        //Q3
        float pencil = scanner.nextFloat();
        float pen = scanner.nextFloat();
        float eraser = scanner.nextFloat();
        float total = (pencil + pen + eraser);
        System.out.println(total);

        //with tax

        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax is: " + newTotal);

        /*Q4
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);

         */

        /*Q5
        int $ = 24;

         */
    }
}
