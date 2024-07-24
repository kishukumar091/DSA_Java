package Java;
public class POW {
    private double calc(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1 / x;
        }
        if (n % 2 == 0) {
             return calc(x * x, n / 2);
        } 
        else {
            return x * calc(x, n - 1);
        }
    }
    public double myPow(double x, int n) {
        if (x == 1.0F) {
        return 1.0;
        }
        return calc(x, (long) n);
    }
    public static void main(String[] args) {
        System.out.println(new POW().myPow(2.0, 10));
    }
}