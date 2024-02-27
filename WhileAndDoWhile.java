public class WhileAndDoWhile {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        //for (int i = 1; i < 7; i++) {
        //    System.out.println("Count value is " + count);
        //}
        count = 1;
        while (true) {
            if (count == 7) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
            if(count > 100) {
                break;
            }
        } while(count != 100);

        /*int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        } */

        //modify the while code above
        //make it also record the total number of even number it has found
        //and break once 5 are found
        //and at the end, display the total number of even numbers found

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber) {
            number++;
            if(isEvenNumber(number)) {
                continue;
            }
            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
            System.out.println("Even number " + number);
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    //Challenge
    //create a method called isEvenNumber that takes a parameter of type int
    //its purpose is to determine if the argumnet passed to the method is
    //an even number or not
    //return true if an even number, otherwise return false,
    public static void isEvenNumber(int number) {
        if(number % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}