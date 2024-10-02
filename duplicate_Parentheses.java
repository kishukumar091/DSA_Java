import java.util.Stack;

public class duplicate_Parentheses {
    public static boolean isDuplicate(String str){
        Stack<Character>S=new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);

            //closing
            if(ch==')'){
                int count =0;
                while (S.peek() != '(') {
                    S.pop();
                    count++;
                }
                if(count <1){
                    return true; //duplicate
                }
                else{
                    S.pop();  //opening pair
                }
            }
            else{
                S.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";
        System.out.println(isDuplicate(str));
    }
}
