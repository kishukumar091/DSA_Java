public class Linear_Search {
    public static int linear_search(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void printValue(int []arr,int key){
        int result = linear_search(arr,key);
        if (result == -1) {
            System.out.print("Element is not present in array");
        }
        else {
            System.out.print("Element is present at index " + result);
        }
    }
    public static void main(String[] args) {
        int [] arr={10,4,6,23,87,16,24};
        int key=4;
        printValue(arr,key);
    }
}
