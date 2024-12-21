import java.util.*;

// TC : O(n^2)
// SC : O(1)

public class Brute {
    public static int missingNumber(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }

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

        System.out.println("Enter the N value: ");
        int N = sc.nextInt();
        
        int ans = missingNumber(arr, N);
        System.out.println(ans);
        sc.close();
    }
}
