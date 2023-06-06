import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        int[] numbers = getIntegers();
        System.out.println("Entered integers:");
        printArray(numbers);

        int[] sortedNumbers = sortIntegers(numbers);
        System.out.println("Sorted integers in descending order:");
        printArray(sortedNumbers);
    }

    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();
        int[] array = new int[count];

        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
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
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
