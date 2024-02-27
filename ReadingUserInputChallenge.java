import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + " :");

            boolean isAnInt = number.hasNextInt();
            if(isAnInt) {
                int num = number.nextInt();
                counter++;
                sum += num;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            number.nextLine();
        }
        System.out.println("sum = " + sum);
        number.close();
    }
}