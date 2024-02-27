//create a program using arrays that sorts a list of integers in descending order
//descending order is highest value to lowest
//set up the program so that the numbers to sort are red in from keyboard
//implement the following methods-getIntegers, printArray, and sortIntegers
//getIntegers returns an array of entered integers from keyboard
//printArray prints out the contents of array
//and sortIntegers should sort the array and return a new array containing the sorted numbers
//you will have to figure out how to copy the array element from the passed array into a new
//array and sort them and return the new sorted array
import java.util.Scanner;
public class ArraysChallenge {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            //element 0  160
            //element 1  50
            //element 2  40

            for (int i = 0; i < sortedArray.length; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
}