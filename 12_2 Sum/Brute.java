import java.util.*;

// TC : O(n^2)
// SC : O(1)

public class Brute {
    public static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < ans.length; i++) {
            for (int j = i + 1; j < ans.length; j++) {
                if (i == j) {
                    continue;
                }

                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value:");
        int target = sc.nextInt();

        int[] res = twoSum(arr, target);
        System.out.println("The indexes which sum up to the target are " + res[0] + " and " + res[1]);
        sc.close();
    }
}