import java.util.Scanner;

public class Main {
    /**
     * This method returns the minimum value in an array.
     * Time Complexity: O(n) - iterate through the array once.
     * @param arr the input array
     * @return the minimum value in the array
     */
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        int min = findMin(arr);
        System.out.println("min element: " + min);
    }
}