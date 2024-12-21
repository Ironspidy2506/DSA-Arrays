import java.util.*;

// TC : O(nlog(n) + n)
// SC : O(1)

public class Brute {
    public static int returnSecondMaximum(int[] arr) {
        int n = arr.length;
        int secondL = 0;
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                secondL = arr[i];
                break;
            }
        }
        return secondL;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(returnSecondMaximum(arr));

        sc.close();
    }
}
