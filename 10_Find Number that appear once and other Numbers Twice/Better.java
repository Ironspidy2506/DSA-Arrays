import java.util.*;

// TC : O(n)
// SC : O(n)

public class Better {
    public static int numberAppearOnce(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int nums : map.keySet()) {
            if (map.get(nums) == 1) {
                return nums;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int number = numberAppearOnce(arr);
        System.out.println(number);
        sc.close();
    }
}
