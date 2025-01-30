package Array;
import java.util.Scanner;
public class Multiplication {
    public static void createMatrix(int [][] matrix,int n,int m){
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
    public static void multiply(int [][] matrix1,int [][] matrix2,int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication is Not possible");
            return;
        }
        int [][] temp = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    temp[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix");
        printMatrix(temp,r1,c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Row1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the Size of Column1: ");
        int c1 = sc.nextInt();
        int [][] matrix1 = new int[r1][c1];
        System.out.print("Enter the Values of Matrix 1:");
        createMatrix(matrix1,r1,c1);
        System.out.println("Matrix 1");
        printMatrix(matrix1,r1,c1);
        System.out.print("Enter the Size of Row1: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the Size of Column1: ");
        int c2 = sc.nextInt();
        int [][] matrix2 = new int[r2][c2];
        System.out.print("Enter the Values of Matrix 2:");
        createMatrix(matrix2,r2,c2);
        System.out.println("Matrix 2");
        printMatrix(matrix2,r2,c2);
        multiply(matrix1,matrix2,r1,c1,r2,c2);
    }
}
