public class Counting_sort {
    public static void counting_sort(int []arr){
        //Largest number or range
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
            System.out.println(largest);
        }
        //Create Count Array
        int [] count=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //Sorting of count array
        int j=0;
        for (int i=0; i<count.length;i++){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int []arr={1,5,1,7,3,5,1,3,5};
        counting_sort(arr);
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}




