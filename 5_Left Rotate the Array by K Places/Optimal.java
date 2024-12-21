import java.util.*;

// TC : O(n)
// SC : O(1)

public class Optimal {
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        // Reverse(arr, arr+d)
        reverse(arr, 0, k - 1);
        // Reverse(arr+d, arr+n)
        reverse(arr, k, n - 1);
        // Reverse(arr arr+n)
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of positions to rotate: ");
        int k = sc.nextInt();

        leftRotate(arr, k);

        System.out.println("Array after left rotation:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
