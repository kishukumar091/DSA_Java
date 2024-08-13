public class BackTracking {
    public static void changeArr(int [] arr,int i,int val){
        //base case
        if(i==arr.length){
            PrintArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr,i+1,val+1);      //func call step
        arr[i]=arr[i]-2;                    //Backtracking step
    }
    public static void PrintArr(int []arr){
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int [] arr=new int [5];
        changeArr(arr,0,1);
        PrintArr(arr);
    }
}
