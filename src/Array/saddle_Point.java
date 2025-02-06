package Array;

public class saddle_Point {
    public static void findSaddlePoint(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            int minRowVal = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minRowVal) {
                    minRowVal = matrix[i][j];
                    colIndex = j;
                }
            }

            boolean isSaddlePoint = true;
            for (int k = 0; k < n; k++) {
                if (matrix[k][colIndex] > minRowVal) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                System.out.println("Saddle Point: " + minRowVal);
                return;
            }
        }
        System.out.println("No Saddle Point found");
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,0,3},
                           {0,1,9},
                           {6,2,8}};

        findSaddlePoint(matrix,3);


    }
}
