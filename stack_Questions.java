import java.util.Stack;

public class stack_Questions {

    //1.Push At Bottom of the stack ----> O(n)
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }


    //2.Reverse the String using Stack
    public static void reverseString(String str){
        Stack<Character> c = new Stack<>();
        int idx=0;
        while (idx<str.length()){
            c.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!c.isEmpty()){
            char curr=c.pop();
            result.append(curr);
        }
        str=result.toString();
        System.out.println(str);
    }

    //3.reverse the Stack   ----> O(n)
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top= s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void printStack(Stack<Integer>s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        //Q.1
            // pushAtBottom(s,5);
            // printStack(s);

        //Q.2
            String str="kishuSingh";
            reverseString(str);

        //Q.3
            reverseStack(s);
            printStack(s);
    }
}
