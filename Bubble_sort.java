import java.util.*;
public class Bubble_sort {

    public static void bubble_sort( int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={5,4,1,3,2};
        bubble_sort(arr);

        //Getting Array
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
