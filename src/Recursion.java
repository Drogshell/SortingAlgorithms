public class Recursion {

    public static int Recurse(int num) {
        if (num == 0) {
            return 1;
        }

        return num * Recurse(num - 1);
    }

    public static int IterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
