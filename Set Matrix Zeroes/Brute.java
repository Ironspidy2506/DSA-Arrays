import java.util.*;

// TC : O(m * n * (m + n))
// SC : O(1)

public class Brute {
    public static void markRow(int[][] mat, int row) {
        for (int i = 0; i < mat[0].length; i++) {
            if (mat[row][i] != 0) {
                mat[row][i] = -1;
            }
        }
    }

    public static void markCol(int[][] mat, int col) {
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] != 0) {
                mat[i][col] = -1;
            }
        }
    }

    public static void setZeroes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    markRow(mat, i);
                    markCol(mat, j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        setZeroes(matrix);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
