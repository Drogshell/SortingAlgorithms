package Algorithms;

public class InsertionSort {

    /*
    In place algorithm
    Big O complexity: O(n^2)
    Stable Algorithm
     */


    public static void Sort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;
        }
    }


    //Sorting recursively is not only dangerous, you run the risk of stack overflow, it's also slower than sorting using a for loop.
    public static void SortRecursively(int[] array, int numberOfItems) {

        if (numberOfItems < 2) {
            return;
        }

        SortRecursively(array, numberOfItems - 1);

        int newElement = array[numberOfItems - 1];

        int i;

        for (i = numberOfItems - 1; i > 0 && array[i - 1] > newElement; i--) {
            array[i] = array[i - 1];
        }

        array[i] = newElement;
    }

}
