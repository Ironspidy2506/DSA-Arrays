import java.util.*;

// TC : O(n^2) * O(log(m))
// SC : O(n) + O(2 * no. of unique triplets)

public class Better {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int sum = -(nums[i] + nums[j]);
                if (set.contains(sum)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(sum);

                    Collections.sort(temp);

                    if (!list.contains(temp)) {
                        list.add(temp);
                    }
                }
                set.add(nums[j]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
