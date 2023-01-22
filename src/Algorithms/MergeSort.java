package Algorithms;

public class MergeSort {

    /*
    Not an in place algorithm
    Big O complexity: O(nlogn) - base 2
    Stable Algorithm
     */

    public static void Sort(int[] input, int start, int end, boolean isAscending){

        if (end - start < 2) {
            return;
        }
        
        int mid = (start + end) / 2;
        
        Sort(input, start, mid, isAscending);
        
        Sort(input, mid, end, isAscending);

        merge(input, start, mid, end, isAscending);
        
    }

    private static void merge(int[] input, int start, int mid, int end, boolean isAscending) {
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        if (isAscending) {
             /*
        This piece of code is a small optimisation.
        input[mid - 1] is the last element in the first partition
        input[mid] is the first element of the second partition

        if the last element of the first partition is smaller than the first element in the second partition,
        then both arrays are sorted and simply need to be merged.
         */
            if (input[mid - 1] <= input[mid]) {
                return;
            }
            while (i < mid && j < end) {
                temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
            }
        }
        else {
            if (input[mid - 1] >= input[mid]) {
                return;
            }
            while (i < mid && j < end) {
                temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
            }
        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
