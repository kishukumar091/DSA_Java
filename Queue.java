import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> q = new LinkedList<>();  //ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
