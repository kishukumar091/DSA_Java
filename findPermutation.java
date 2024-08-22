public class findPermutation {
    public static void fPermutatiom(String str,String ans){
        //base Case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion     [O(n*n!)]
        for (int i = 0; i <str.length(); i++) {
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            fPermutatiom(newStr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        fPermutatiom(str,"");
    }
}
