package Array;

public class reverse {
    public static void Reversed(int [] array1){
        int n = array1.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int temp = array1[start];
            array1[start] = array1[end];
            array1[end] = temp;
            start ++;
            end --;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Reversed(arr);
        for (int ar:arr) {
            System.out.print(ar+" ");
        }
    }
}
