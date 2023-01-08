public class ShellSort {

    /*
    Variation of Insertion Sort

    In place algorithm

    Difficult to judge the time complexity because it depends on the gap. Worst case scenario is O(n^2) but it can be much better than that.

    Unstable algorithm

    There are many sequences used to calculate the Gap value, one of the most popular is Knuth Sequence
    (3^k - 1) / 2 where k is set based on the length of the array, k needs to be as close the length of the array as possible without going over.
    For example; an array with 20 elements would use a K value of 3
     */

    public static void Sort(int[] array) {
        // This method does not use Knuth Sequence
        for (int gap = array.length; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newElement;
            }
        }
    }
}
