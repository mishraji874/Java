import java.util.ServiceConfigurationError;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2; //1 + 2 = 3
        System.out.println(result);
        
        int previousResult = result;
        System.out.println(previousResult);
        
        result = result - 1; //3 - 1 = 2
        System.out.println(result);
        System.out.println(previousResult);
        
        result = result * 10; //2 * 10 = 20
        System.out.println(result);

        result = result / 10; //20 / 10 = 2
        System.out.println(result);

        result = result % 3; // the remainder of (2 % 3) = 2
        System.out.println(result);

        //result = result + 1;
        result++; // 2 + 1 = 2
        System.out.println(result);

        result--; // 3 - 1 = 2
        System.out.println(result);

        //result = result + 2
        result += 2; // 2 + 2 = 4
        System.out.println(result);

        //result = result * 10
        result *=10; // 4 * 10 = 40
        System.out.println(result);

        //result = result / 3
        result /=3; // 40 / 3 = 13
        System.out.println(result);

        //result = result - 2
        result -=2; // 13 - 2 = 11
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not supposed to happen");
        }
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }
    }
}