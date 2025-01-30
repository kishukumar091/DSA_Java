package Array;
import java.util.Scanner;
public class Transpose {
    public static void createMatrix(int [][]matrix,int n,int m) {
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = x.nextInt();
            }
        }
    }
    public static void printMatrix(int [][] matrix,int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int [][] matrix,int n,int m){
        int [][] temp = new int [m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
        printMatrix(matrix,n,m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Row: ");
        int n = sc.nextInt();
        System.out.print("Enter the Size of Column: ");
        int m = sc.nextInt();
        int [][] matrix = new int[n][m];
        System.out.println("Enter the value of the matrix");
        createMatrix(matrix,n,m);
        System.out.println("Matrix");
        printMatrix(matrix,n,m);
        System.out.println("Transpose");
        transpose(matrix,n,m);
    }
}
