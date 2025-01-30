package Array;
import java.util.Scanner;
public class Addition {
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
    public static void addition(int [][] temp,int [][] matrix1,int [][]matrix2,int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Row: ");
        int n = sc.nextInt();
        System.out.print("Enter the Size of Column: ");
        int m = sc.nextInt();
        int [][] matrix1 = new int[n][m];
        System.out.print("Enter the Values of Matrix 1:");
        createMatrix(matrix1,n,m);
        System.out.println("Matrix 1");
        printMatrix(matrix1,n,m);
        int [][] matrix2 = new int[n][m];
        System.out.print("Enter the Values of Matrix 2:");
        createMatrix(matrix2,n,m);
        System.out.println("Matrix 2");
        printMatrix(matrix2,n,m);
        int [][] temp = new int[n][m];
        System.out.println("Addition of Matrix 1 And Matrix 2");
        addition(temp,matrix1,matrix2,n,m);
        printMatrix(temp,n,m);
    }
}