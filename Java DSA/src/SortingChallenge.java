public class SortingChallenge {
    public static void bubbleSort(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[min] > numbers[j]) {
                    min = j;
                }
            }
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void insertionSort(int numbers[]) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
    }

    public static void printArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int numbers[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(numbers);
        printArray(numbers);
        selectionSort(numbers);
        printArray(numbers);
        insertionSort(numbers);
        printArray(numbers);
    }
}
