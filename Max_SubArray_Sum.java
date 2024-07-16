public class Max_SubArray_Sum {
    public static void mx_Sum(int []arr){
        int largest=Integer.MIN_VALUE;
        //int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j<arr.length;j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (largest < sum) {
                    largest = sum;
                }
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int [] arr={1,-2,6,-1,3};
        mx_Sum(arr);
    }
}
