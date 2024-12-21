import java.util.*;

// TC : O(m * n)
// SC : O(1)

public class Optimal {
    public static void setZeroes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int col0 = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 1;
                    if (j != 0) {
                        mat[0][j] = 1;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][j] != 0) {
                    if (mat[0][j] == 0 || mat[i][0] == 0) {
                        mat[i][j] = 0;
                    }
                }
            }
        }

        if (mat[0][0] == 0) {
            for (int i = 0; i < n; i++) {
                mat[0][i] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < m; i++) {
                mat[i][0] = 0;
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
