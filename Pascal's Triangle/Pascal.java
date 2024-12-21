import java.util.*;

// Given R and C, find the element at that place
// Print any nth row of Pascal Triangle
// Print the entire Pascal Triangle

public class Pascal {
    public static long nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= i + 1;
        }
        return res;
    }

    public static long returnElement(int r, int c) {
        // R-1 (C) C-1
        return nCr(r - 1, c - 1);
    }

    public static void generateRow(int n) {
        // Nth row - N Elements
        int ans = 1;
        System.out.println(ans);
        for (int i = 1; i < n; i++) {
            ans *= (n - i);
            ans /= i;
            System.out.print(ans + " ");
        }
    }

    public static void generateTriangle(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> temp = new ArrayList<>();
            int ans = 1;
            temp.add(ans);
            for (int j = 1; j < i; j++) {
                ans *= (i - j);
                ans /= j;
                temp.add(ans);
            }
            list.add(temp);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int num : list.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Give row and column to get the element");
        System.out.println("2) Generate the particular row of the Pascal Triangle");
        System.out.println("3) Generate the Pascal Triangle");
        System.out.print("Enter the input what do you want to do: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Enter the row value: ");
                int r = sc.nextInt();
                System.out.print("Enter the col value: ");
                int c = sc.nextInt();
                System.out.println(returnElement(r, c));
                break;

            case 2:
                System.out.print("Enter the row value: ");
                int k = sc.nextInt();
                generateRow(k);
                break;

            case 3:
                System.out.print("Enter the number of rows to generate: ");
                int row = sc.nextInt();
                generateTriangle(row);
                break;

        }
        sc.close();
    }
}
