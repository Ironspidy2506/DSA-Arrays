import java.util.*;

// TC : O(n)
// SC : O(1)

public class Optimal {
    public static int missingNumber(int[] arr, int N) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
            xor1 ^= i + 1;
        }
        xor1 ^= N;

        return xor1 ^ xor2;
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

        System.out.println("Enter the N value: ");
        int N = sc.nextInt();

        int ans = missingNumber(arr, N);
        System.out.println(ans);
        sc.close();
    }
}
