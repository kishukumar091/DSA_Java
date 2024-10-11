public class Queue_LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head ==null && tail ==null;
        }

        //add   O(1)
        public static void add(int data){
            Node newNode = new Node(data);
            if(head ==null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove   O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            //single Element
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }

            return front;
        }

        //peek   O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue qq = new Queue();
        qq.add(1);
        qq.add(2);
        qq.add(3);

        while(!qq.isEmpty()){
            System.out.println(qq.peek());
            qq.remove();
        }
    }
}
