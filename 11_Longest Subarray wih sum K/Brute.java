import java.util.*;

// TC :
// SC : 

public class Brute {
    public static int longestSubarray(int[] arr, int k) {
        return -1;
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
        System.out.print("Enter the target sum K: ");
        int K = sc.nextInt();

        int result = longestSubarray(arr, K);
        System.out.println("The length of the longest subarray with sum " + K + " is: " + result);
        sc.close();
    }
}
