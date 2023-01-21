import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int arrayLength = 10;
        int[] array = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        //int[] array = {20, 35, -15, 7, 55, 1, -22};
        //int[] countingSortArray = {2,5,9,8,2,8,7,10,4,3};
        //int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        long startTime = System.nanoTime();

        QuickSort.Sort(array, 0, arrayLength);

        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;

        System.out.println("\nTime taken: " + duration + " ms\n");


        System.out.println("\n-Sorted-");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}