import java.util.*;

// TC : O(n)
// SC : O(n)

public class Brute {
    static void moveZeroes(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != 0) {
                list.add(num);
            }
        }

        int index = 0;
        for (int num : list) {
            arr[index++] = num;
        }

        while (index < arr.length) {
            arr[index++] = 0;
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
        moveZeroes(arr);
        System.out.println("Array after moving zeroes to the end:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
