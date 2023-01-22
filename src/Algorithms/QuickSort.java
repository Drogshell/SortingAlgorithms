package Algorithms;

public class QuickSort {
    /*
    In place algorithm
    Big O complexity: O(nlogn) - base 2
    Unstable Algorithm
     */

    public static void Sort(int[] input, int start, int end) {

        if (input.length == 0) return;

        if (end - start < 2) return;

        int pivotIndex = partition(input, start, end);
        Sort(input, start, pivotIndex);
        Sort(input, pivotIndex + 1, end);

    }

    private static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;


        while (i < j) {

            //NOTE: Empty loop body
            while (i < j && input[--j] >= pivot);

            if (i < j) {
                input[i] = input[j];
            }

            //NOTE: Empty loop body
            while (i < j && input[++i] <= pivot);

            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
