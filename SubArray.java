public class SubArray {
    public static void pair_array(int []arr){
        int ts=0;
        for (int i = 0; i < arr.length ; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum=0;
                System.out.print("Sum of SubArrays: ");
                for (int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.print("is "+sum);
                ts++;
                System.out.print("    ");
            }
            System.out.println();
        }
        System.out.println("Total SubArrays: "+ts);
    }
    public static void main(String[] args) {
        int []arr={2,4,6,8,10};
        pair_array(arr);
    }
}