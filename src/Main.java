public class Main {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        InsertionSort.Sort(array);

        System.out.println("\n-Sorted-");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}