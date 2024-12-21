import java.util.*;

// TC : O(n^2)
// SC : O(1)

public class Brute {
    public static int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }
            if (cnt > nums.length / 2) {
                return nums[i];
            }
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
