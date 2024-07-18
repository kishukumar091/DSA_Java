public class Insertion_sort {
    public static void insertion_sort(int[]arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int []arr={5,3,2,4,1};
        insertion_sort(arr);
        //Getting an Array
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
