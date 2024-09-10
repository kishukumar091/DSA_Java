public class LinkedList_Scratch {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    //Add First
    public void addFirst(int data){

        //Step1 - Create new Node
        Node newNode=new Node(data);
        size++;

        //For Empty linkList
        if (head==null){
            head=tail=newNode;
            return;
        }
        //Step2 - newNode next = head
        newNode.next=head; //Link

        //Step3 - head = newNode
        head = newNode;
    }


    // Add Last
    public void addLast(int data){
        //Step1 - Create new Node
        Node newNode=new Node(data);
        size++;

        //For Empty linkList
        if (head==null){
            head=tail=newNode;
            return;
        }
        //Step2 - tail
        tail.next=newNode;
        //Step3
        tail=newNode;

    }


    // Add in Any Index
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }


    //Remove First
    public int removeFirst(){
        if(size==0){
            System.out.println("null");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }


    //Remove last

    public int removeLast(){
        if (size==0){
            System.out.println("null");
            return Integer.MIN_VALUE;
        }
        else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev: i=size-2
        Node prev=head;
        for (int i = 0; i <size-2 ; i++) {
            prev=prev.next;
        }
        int val= tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    //Iterative Search in LinkedList  ----O(N)
    public int iteSearch(int key){
        int i=0;
        Node temp=head;
        while (temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    // Recursive Search in LInkedList //O(N)
    public int helper(Node head,int key){
        if (head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }


    //Reverse LinkedList(Iterative Approach)
    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //Find & Remove Nth node from End

    public void deleteNthFromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head=head.next;
            return;
        }
        //sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //LinkedList is a Palindrome or Not

        //find MidNode
    public Node findMidNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    // Check Palindrome
    public boolean checkPalindrome(){
        if(head==null ||head.next==null){
            return true;
        }

        //Find MidNode
        Node mid=findMidNode(head);

        //Reverse 2nd half
        Node curr=mid;
        Node prev=null;
        while (curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        //check if Equal
        while (right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    // Is LL is Cyclic or Not
    /*public  boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next;  //+2
            if(slow==fast){
                return true;  //cycle exists
            }
        }
        return false;   //cycle doesn't exists
    }*/

    //Remove Cycle
    /*public static void removeCycle(){
        //detect cycle
        Node slow =head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast == slow) {
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        //find meeting point
        slow=head;
        Node prev=null;
        while (slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle last.next=null
        prev.next=null;

    }*/


    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1 !=null &&head2 !=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    private Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left & right MS
        Node rightHead= mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);

    }

    //Print LinkedList
    public void print(){     //O(N)
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList_Scratch l1=new LinkedList_Scratch();

       l1.addFirst(1);
        l1.addFirst(1);

        l1.addFirst(10);
        l1.addLast(1);
        l1.addLast(2);


        l1.print();

        /*System.out.println(l1.checkPalindrome());*/
        
        /*head =new Node(2);
        head.next =new Node(2);
        head.next.next =new Node(2);
        head.next.next.next =head;
        System.out.println(isCycle());*/

        l1.head=l1.mergeSort(l1.head);
        l1.print();
    }
}
