import java.util.Arrays;
public class Inbuilt_sort {
    public static void main(String[] args) {
       int [] arr={6,2,4,1,5,0,9} ;
       Arrays.sort(arr);
       //Arrays.sort(arr,1,5);
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
