package Searching;
public class BinarySearch {
    public static int binarySearch(int [] arr , int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = (end + start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int target = 500;
        int result = binarySearch(arr,target);
        System.out.println(result);
    }
}
