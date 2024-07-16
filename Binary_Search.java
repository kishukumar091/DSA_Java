public class Binary_Search {
    public static int binary_search(int []arr,int key){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void printArr(int []arr,int key){
        int result = binary_search(arr,key);
        if (result == -1) {
            System.out.print("Element is not present in array");
        }
        else {
            System.out.print("Element is present at index " + result);
        }
    }


    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,100};
        int key=100;
        printArr(arr,key);

    }
}
