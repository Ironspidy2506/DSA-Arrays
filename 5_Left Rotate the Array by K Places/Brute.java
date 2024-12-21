import java.util.*;

// TC : O(n)
// SC : O(k)

public class Brute {
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        int idx = 0;
        for (int i = n - k; i < arr.length; i++) {
            arr[i] = list.get(idx++);
        }
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

        System.out.print("Enter the number of positions to rotate: ");
        int k = sc.nextInt();

        leftRotate(arr, k);

        System.out.println("Array after left rotation:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
