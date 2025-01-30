package Searching;

public class LinearSearch {
    public static int linearSearch(int [] arr,int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,67};
        int target = 0;
        int result = linearSearch(arr,target);
        System.out.println(result);
    }
}

