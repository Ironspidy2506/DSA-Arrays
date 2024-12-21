import java.util.*;

// TC : O(n^3)
// SC : O(n)

public class Better {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Set<Integer> set = new HashSet<>();
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = -(nums[i] + nums[j] + nums[k]);
                    if (set.contains(sum)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(sum);

                        Collections.sort(temp);

                        if (!list.contains(temp)) {
                            list.add(temp);
                        }
                    }
                    set.add(nums[k]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        List<List<Integer>> result = fourSum(nums, target);

        System.out.println("Result: " + result);
        sc.close();
    }
}
