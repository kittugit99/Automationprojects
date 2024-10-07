public class test3 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // Print even numbers
        System.out.println("Even numbers in the array:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

        // Print odd numbers
        System.out.println("Odd numbers in the array:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
