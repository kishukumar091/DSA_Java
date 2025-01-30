package Array;
public class arr {
    public static void main(String[] args) {
        int [] ar = {1,2,3,4,6};
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        double avg = (double) sum/ar.length;
        System.out.println(avg);
    }
}
