import java.util.*;

// TC : O(n)
// SC : O(n)

public class Better {
    public static int missingNumber(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
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
