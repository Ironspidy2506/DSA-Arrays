import java.util.*;

// TC : O(m * n)
// SC : O(1)

public class Spiral {
    private static void spiralMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.println(mat[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.println(mat[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println(mat[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(mat[i][left]);
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns:");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        spiralMatrix(mat);
        sc.close();
    }
}
