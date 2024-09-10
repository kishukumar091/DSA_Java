import java.util.Scanner;

public class Roman_to_Integer {
    public static int getVal(char ch){
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    public static int RomanToInteger(String s){
        int n=s.length();
        int sum=0;
        for (int i = 0; i <n ; i++) {
            char ch1=s.charAt(i);
            if((i+1)<n&&getVal(ch1)<getVal(s.charAt(i+1))){
                sum-=getVal(ch1);
            }
            else{
                sum+=getVal(ch1);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(RomanToInteger(s));
    }
}
