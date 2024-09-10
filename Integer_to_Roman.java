import java.util.Scanner;

public class Integer_to_Roman {
    public static String IntegerToRoman(int num){
       StringBuilder sb=new StringBuilder();
        Process(sb,'*','M','*',num/1000);
        num=num%1000;
        Process(sb,'M','C','D',num/100);
        num=num%100;
        Process(sb,'C','X','L',num/10);
        num=num%10;
        Process(sb,'X','I','V',num);
        return sb.toString();
    }
    public static void Process(StringBuilder sb,char major,char minor,char  middle,int val){
        if(val<=3){
            for (int i = 1; i <=val ; i++) {
                sb.append(minor);
            }
        }
        else if (val==4) {
            sb.append(minor);
            sb.append(middle);
        }
        else if (val==5) {
            sb.append(middle);
        }
        else if (val<=8) {
            sb.append(middle);
            for (int i = 6; i <= val; i++) {
                sb.append(minor);
            }
        }
        else if (val==9) {
            sb.append(minor);
            sb.append(major);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num=sc.nextInt();
        System.out.println(IntegerToRoman(num));
    }
}
