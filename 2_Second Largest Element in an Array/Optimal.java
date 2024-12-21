import java.util.*;

// TC : O(n)
// SC : O(1)

public class Optimal {
    public static int returnSecondMaximum(int[] arr) {
        int largest = -1;
        int secondL = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondL = largest;
                largest = arr[i];
            } else if (arr[i] > secondL) {
                secondL = arr[i];
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
