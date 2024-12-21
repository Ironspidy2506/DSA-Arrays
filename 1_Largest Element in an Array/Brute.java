import java.util.*;

// TC : O(nlog(n))
// SC : O(1)

public class Brute {
    public static int returnMaximum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(returnMaximum(arr));

        sc.close();
    }
}
