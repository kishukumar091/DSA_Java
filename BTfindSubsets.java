public class BTfindSubsets {
    public static void findSubset(String str, int i,String ans ){
        //Base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //for yes
        findSubset(str,i+1,ans+str.charAt(i));
        //for no
        findSubset(str,i+1,ans);
    }

    public static void main(String[] args) {
        String str="abc";
        findSubset(str,0,"");
    }
}
