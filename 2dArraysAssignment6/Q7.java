/***Question 7**

        Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

        **Example 1:**
 * **Input:** n = 3
 * **Output:** [[1,2,3],[8,9,4],[7,6,5]]
 */
public class Q7 {
    public static void main(String[] args) {
       Q7 sm = new Q7();
        int n = 3;
        int[][] matrix = sm.generateMatrix(n);

        System.out.println("Generated matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse top row
            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = num++;
            }
            topRow++;

            // Traverse right column
            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = num++;
            }
            rightCol--;

            // Traverse bottom row
            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    matrix[bottomRow][i] = num++;
                }
                bottomRow--;
            }

            // Traverse left column
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    matrix[i][leftCol] = num++;
                }
                leftCol++;
            }
        }

        return matrix;
    }
}
