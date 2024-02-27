public class SmallestAndLargestValueInArray {
    public static int smallAndLarge(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println("smallest number is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("largest number is: " + smallAndLarge(numbers));
    }
}
