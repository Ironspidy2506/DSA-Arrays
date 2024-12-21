import java.util.*;

// TC : O(n log n)
// SC : O(1)

public class Optimal {
    public static int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int[] ans = new int[2];
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else if (sum == target) {
                ans[0] = i;
                ans[1] = j;
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