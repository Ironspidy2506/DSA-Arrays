import java.util.*;

// TC : O(2n)
// SC : O(1)

public class Optimal {
    public static int majorityElement(int[] nums) {
        // Moore's Voting Algorithm
        int element = nums[0];
        int cnt = 0;
        int cnt1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                element = nums[i];
            } else if (nums[i] == element) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // Verify Element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                cnt1++;
            }
        }

        if (cnt1 > nums.length / 2) {
            return element;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));

        sc.close();
    }
}
