import java.util.*;

// TC : O(n)
// SC : O(min(arr1.length, arr2.length))

public class Optimal {
    public static int[] Intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new TreeSet<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                set.add(arr1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            ans[idx++] = num;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array after Intersection:");
        int[] ans = Intersection(arr1, arr2);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
