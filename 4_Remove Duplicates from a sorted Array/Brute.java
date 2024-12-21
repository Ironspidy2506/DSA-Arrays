import java.util.*;

// TC : O(n)
// SC : O(1)

public class Brute {
    public static int duplicateRemove(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            set.add(arr[i]);
        }

        Arrays.fill(arr, 0);
        for (int element : set) {
            arr[i++] = element;
        }
        
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(duplicateRemove(arr));

        sc.close();
    }
}
