import java.util.*;

// TC : O(n)
// SC : O(1)

public class Optimal {
    public static int numberAppearOnce(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        return xor;
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

        int number = numberAppearOnce(arr);
        System.out.println(number);
        sc.close();
    }
}
