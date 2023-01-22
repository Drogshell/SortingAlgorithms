import Algorithms.RadixSort;
import Lists.EmployeeDummy;
import Lists.EmployeeLinkedList;

public class Main {
    public static void main(String[] args) {

//        int arrayLength = 10;
//        int[] array = new int[arrayLength];
//        Random random = new Random();
//
//        for (int i = 0; i < arrayLength; i++) {
//            array[i] = random.nextInt(201) - 100;
//        }
//
//        int[] array = {20, 35, -15, 7, 55, 1, -22};
//        int[] countingSortArray = {2,5,9,8,2,8,7,10,4,3};
//        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
//        String[] array = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
//
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ",");
//        }
//
//        long startTime = System.nanoTime();
//
//        RadixSort.SortString(array, 26, 5);
//
//        long endTime = System.nanoTime();
//
//        long duration = (endTime - startTime) / 1000000;
//
//        System.out.println("\nTime taken: " + duration + " ms\n");
//
//        System.out.println("\n-Sorted-");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ",");
//        }

        EmployeeDummy RosemaryCarter = new EmployeeDummy("Rosemary", "Carter", 1001);
        EmployeeDummy JemmaGentry = new EmployeeDummy("Jemma", "Gentry", 1002);
        EmployeeDummy BethanChristian = new EmployeeDummy("Bethan", "Christian", 1003);
        EmployeeDummy BernardLowery = new EmployeeDummy("Bernard", "Lowery", 1004);
        EmployeeDummy BillHancock = new EmployeeDummy("Bill", "Hancock", 1005);
        EmployeeDummy MilaTownsend = new EmployeeDummy("Mila", "Townsend", 1006);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.AddToFront(RosemaryCarter);
        list.AddToFront(JemmaGentry);
        list.AddToFront(BethanChristian);
        list.AddToFront(BernardLowery);
        list.AddToFront(BillHancock);
        list.AddToFront(MilaTownsend);

        list.PrintList();

        System.out.println(list.getSize());


    }
}