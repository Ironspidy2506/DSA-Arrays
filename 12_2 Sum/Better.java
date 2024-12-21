import java.util.*;

// TC : O(n)
// SC : O(n)

public class Better {
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < ans.length; i++) {
            int sum = target - arr[i];
            if (map.containsKey(sum)) {
                ans[0] = i;
                ans[1] = map.get(sum);
                return ans;
            }
            map.put(arr[i], i);
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