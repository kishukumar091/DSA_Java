import java.util.Scanner;
public class nQueens {
    public static boolean isSafe(char[][] Board, int row, int col){
        //Vertical up
        for (int i = row-1; i >=0 ; i--) {
            if(Board[i][col]=='Q'){
                return false;
            }
        }
        //vertical left
        for (int i = row-1,j=col-1; i >=0 &&j>=0 ; i--,j--) {
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        //Vertical Right
        for (int i = row-1,j=col+1; i >=0 &&j<Board.length ; i--,j++) {
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char [][]Board,int row){
        //Base Case
        if(row== Board.length){
            //printBoard(Board);
            count++;
            return;
        }
        for(int j=0;j< Board.length;j++){
            if(isSafe(Board,row,j)){
                Board[row][j]='Q';
                nQueen(Board,row+1);    //Function Call
                Board[row][j]='X';          //Backtracking Step
            }
        }
    }
    /*public static void printBoard(char [][]Board){
        System.out.println("_______ Chess Board _______");
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }*/
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char [][] Board=new char[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                Board[i][j]='X';
            }
        }
        nQueen(Board,0);
        System.out.println("Thr number of ways = "+count);
    }
}
