package LinkedList;
import java.util.Scanner;
class linkedList{
    class Node{
        int data;
        Node next;
        public Node(int d){
            data = d;
            next = null;
        }
    }
    public Node head = null;
    public void addfirst(int d){
        Node newNode = new Node(d);
        if(newNode == null){
            System.out.println("Overflow");
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addList(int d){
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void addPos(int p,int d){
        Node newNode = new Node(d);
        if(newNode == null) System.out.println("OverFlow");
        else if (p == 1) {
            newNode.next = head;
        }
        else{
            Node temp = head;
            for (int i = 0; i < p-2; i++) {
                temp = temp.next;
                if(temp == null){
                    System.out.println("LinkedList is Small");
                    return;
                }
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void deleteFirst(){
        if(head == null) System.out.println("underflow");
        else{
            System.out.println(head.data + "Data Deleted");
            head = head.next;
        }
    }
    public void deleteLast(){
        if(head == null) System.out.println("Underflow");
        else if (head.next == null) {
            System.out.println(head.data + "Data deleted");
            head = null;
        }
        else{
            Node temp = head;
            Node loc = head.next;
            while(loc.next != null){
                temp = loc;
                loc = loc.next;
            }
            System.out.println(loc.data + "data deleted");
            temp.next=loc.next;
        }
    }
    public void deletePos(int p){
        if(head == null) System.out.println("Underflow");
        else if (p == 1) {
            System.out.println(head.data+"data deleted");
            head = head.next;
        }
        else{
            Node temp = head;
            Node loc = temp.next;
            for (int i = 0; i < p-2; i++) {
                temp = loc;
                loc = loc.next;
                if(loc == null){
                    System.out.println("linkedList is small");
                    return;
                }
            }
            System.out.println(loc.data + "data deleted");
            temp.next = loc.next;
        }
    }
    public void display(){
        if(head == null) System.out.println("Empty LinkedList");
        else{
            Node temp = head;
            System.out.println("LinkedList");
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }
    }
}
public class SingularLinkedList {
    public static void main(String[] args) {
        linkedList sList = new linkedList();
        Scanner sc = new Scanner(System.in);
        int k;
        while(true){
            System.out.println("enter 1 for insert at beginning");
            System.out.println("enter 2 for insert at last ");
            System.out.println("enter 3 for insert at particular position");
            System.out.println("enter 4 for delete from begin");
            System.out.println("enter 5 for delete from last");
            System.out.println("enter 6 for delete from particular position");
            System.out.println("enter 7 for display");
            System.out.println("enter 8 for exit");
            k=sc.nextInt();
            if(k == 1){
                System.out.println("Enter value in linkedList");
                int a = sc.nextInt();
                sList.addfirst(a);
            } 
            else if (k==2) {
                System.out.println("Enter value in linkedList");
                int b = sc.nextInt();
                sList.addList(b);
            } else if (k==3) {
                System.out.println("Enter position and value of LinkedList");
                int c = sc.nextInt();
                int d = sc.nextInt();
                sList.addPos(c,d);
            }
            else if(k==4) sList.deleteFirst();
            else if(k==5) sList.deleteLast();
            else if (k==6) {
                System.out.println("Enter position to delete");
                int e = sc.nextInt();
                sList.deletePos(e);
            }
            else if (k==7) sList.display();
            else if (k==8) break;
            else System.out.println("Enter the correct choice");
        }
    }
}