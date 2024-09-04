import java.util.Scanner;

public class GridWays {
    public static int gridWays(int i,int j,int n,int m){
        if(i==n-1&&j==m-1){
            return 1;
        }
        if(i==n||j==m){
            return 0;
        }
        int way1=gridWays(i+1,j,n,m);
        int way2=gridWays(i,j+1,n,m);
        return way1+way2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int n=sc.nextInt();
        System.out.print("Enter the Column: ");
        int m=sc.nextInt();
        System.out.println("The number of ways: "+gridWays(0,0,n,m));
    }
}
