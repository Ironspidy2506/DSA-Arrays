import java.util.*;

// TC : O(2n)
// SC : O(1)

public class Better {
    public static void sortArray(int[] arr) {
        int[] count = new int[3];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[idx++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortArray(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
