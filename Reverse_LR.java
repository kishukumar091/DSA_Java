public class Reverse_LR {
    public class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static ListNode head;
    public void addFirst(int data){

        //Step1 - Create new Node
        ListNode newNode=new ListNode(data);


        //For Empty linkList
        if (head==null){
            head=newNode;
            return;
        }
        //Step2 - newNode next = head
        newNode.next=head; //Link

        //Step3 - head = newNode
        head = newNode;
    }

    public void print(){     //O(N)
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverseBetween(int left, int right) {

        if(head == null || head.next == null || right == left){
            return;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for(int i = 1; i < left ; i++){
            prev = prev.next;
        }

        ListNode curr = prev.next;

        for(int i = 1; i <= right - left; i++){
            ListNode temp = prev.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = temp;
        }

    }

    public static void main(String[] args) {
        Reverse_LR rl = new Reverse_LR();
        rl.addFirst(5);
        rl.addFirst(3);
        rl.addFirst(2);
        rl.addFirst(78);
        rl.addFirst(9);
        rl.addFirst(11);
        rl.print();

        rl.reverseBetween(2,5);
        rl.print();
    }
}
