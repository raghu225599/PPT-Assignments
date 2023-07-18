/***Question 8**

        Given two [sparse matrices](https://en.wikipedia.org/wiki/Sparse_matrix) mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible.

        **Example 1:**
 * **Input:** mat1 = [[1,0,0],[-1,0,3]], mat2 = [[7,0,0],[0,0,0],[0,0,1]]
 * **Output:**
 * [[7,0,0],[-7,0,3]]
 */
public class Q8 {
    public static void main(String[] args) {
        Q8 smm = new Q8();
        int[][] mat1 = {{1, 0, 0}, {-1, 0, 3}};
        int[][] mat2 = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        int[][] result = smm.multiply(mat1, mat2);

        System.out.println("Result of matrix multiplication:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int x = 0; x < k; x++) {
                    result[i][j] += mat1[i][x] * mat2[x][j];
                }
            }
        }

        return result;
    }
}
