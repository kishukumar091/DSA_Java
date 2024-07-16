public class Reverse_Array {
    public static void reverse(int []arr){
        int first=0;int last= arr.length-1;
        while(first<last){
            int temp= arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
    public static void PrintArr(int []arr){
        for (int i:arr) {
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        reverse(arr);
        PrintArr(arr);
    }
}
