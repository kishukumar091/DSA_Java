public class Recursion {

    // 1.Print Decreasing Order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }

    //2.Print Increasing Order
    public static void printInc(int  n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    //3.Print Factorial
    public static int printFact(int n){
        if(n==0){
            return 1;
        }
        return n*printFact(n-1);
    }

    //4.Sum of N natural numbers
    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        return n+printSum(n-1);
    }

    //5.Print Nth Fibonacci Number
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void P(int n){
        for (int i = 0; i <n ; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }

    //6.Array is Sorted or not
    public static boolean isSorted(int []arr,int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    //7.First Occurrence
    public static int firstOccurrence(int []arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurrence(arr,key,i+1);
    }

    //8.Last Occurrence
    public static int lastOccurrence(int []arr,int key,int i){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurrence(arr,key,i-1);
    }

    //9.Pint x^n
    public static double power(double x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    //10.Print x^n in O(log n)
    public static double optimizedPower(double x,int n) {
        if(n==0){
            return 1;
        }
        double halfPower=optimizedPower(x,n/2);
        double halfPowerSq=halfPower*halfPower;

        //n is odd
        if(n%2!=0){
            halfPowerSq=x*halfPowerSq;
        }
        return halfPowerSq;
    }

    //11.Tiling Problem
    public static int TilingProblem(int n){
        //base case
        if(n==0 ||n==1){
            return 1;
        }
        return TilingProblem(n-1)+TilingProblem(n-2);
    }

    //12. Remove Duplicates in String
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean Map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar=str.charAt(idx);
        if(Map[currChar - 'a']){
            removeDuplicates(str,idx+1,newStr,Map);
        }
        else{
            Map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),Map);
        }
    }

    //13.Friends Paring problem
    public static int Ways(int n){
        //Base Case
        if(n==1 ||n==2){
            return n;
        }
        return Ways(n-1)+(n-1)*Ways(n-2);
    }

    //14.Binary String Problem
    public static void BinaryString(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        BinaryString(n-1,0,str+"0");
        if(lastPlace==0){
            BinaryString(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        int n=10;
        //1.
        printDec(n);
        //2.
        printInc(n);
        System.out.println();
        //3.
        System.out.println(printFact(n));
        //4.
        System.out.println(printSum(n));
        //5.
        P(n);
        System.out.println();
        //6.
        int []arr={1,1,1,1,1};
        System.out.println(isSorted(arr,0));
        //7.
        System.out.println(firstOccurrence(arr,1,0));
        //8.
        System.out.println(lastOccurrence(arr,1,arr.length-1));
        //9.
        System.out.println(power(0.00002,10));
        //10.
        System.out.println(optimizedPower(2,32));
        //11.
        System.out.println(TilingProblem(5));
        //12.
        removeDuplicates("kishusinghrajput",0,new StringBuilder(""),new boolean[26]);
        //13.
        System.out.println(Ways(3));
        //14.
        BinaryString(3,1,"");
    }
}
