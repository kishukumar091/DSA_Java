package TTREE;

import java.util.*;

class Tree {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    Node root = null;
    Node loc = null;
    Node par = null;

    void search(int t) {
        par = null;
        loc = root;
        while (loc != null) {
            if (t == loc.data) {
                return;
            } else if (t > loc.data) {
                par = loc;
                loc = loc.right;
            } else {
                par = loc;
                loc = loc.left;
            }
        }
    }

    void insert(int t) {
        Node newNode = new Node(t);
        search(t);
        if (loc != null)
            System.out.println("Item already present");
        else if (par == null)
            root = newNode;
        else if (t < par.data)
            par.left = newNode;
        else
            par.right = newNode;
    }

    void inorder(Node temp) {
        if (temp == null) {
            System.out.println("Empty");
            return;
        }
        inorder(temp.left);
        System.out.print(temp.data + " ");
        inorder(temp.right);
    }

    void preorder(Node temp) {
        if (temp == null) {
            System.out.println("Empty");
            return;
        }
        System.out.print(temp.data + " ");
        preorder(temp.left);
        preorder(temp.right);
    }

    void postorder(Node temp) {
        if (temp == null) {
            System.out.println("Empty");
            return;
        }
        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data + " ");
    }

    void delete(int t) {
        search(t);
        if (loc == null) {
            System.out.println("Value not present");
        } else if (loc.left == null || loc.right == null)
            deleteone();
        else
            deletetwo();
    }

    void deleteone() {
        System.out.println(loc.data + " deleted");
        Node child;
        if (loc.left == null)
            child = loc.right;
        else if (loc.right == null)
            child = loc.left;
        else
            child = null;
        if (par == null)
            root = child;
        else if (loc == par.left)
            par.left = child;
        else
            par.right = child;
    }

    void deletetwo() {
        Node suc = loc.right;
        Node parsuc = loc;
        while (suc.left != null) {
            parsuc = suc;
            suc = suc.left;
        }
        int tt = loc.data;
        loc.data = suc.data;
        suc.data = tt;
        loc = suc;
        par = parsuc;
        deleteone();
    }
}

class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        Scanner sc = new Scanner(System.in);
        int c;
        while (true) {
            System.out.println("1. Search 2. Insert 3. Preorder 4. Inorder 5. Postorder 6. Delete 7. Exit");
            c = sc.nextInt();
            if (c == 1) {
                System.out.println("Enter value to be searched");
                int v = sc.nextInt();
                t.search(v);
                if (t.loc == null)
                    System.out.println("Not present");
                else
                    System.out.println("Present");
            } else if (c == 2) {
                System.out.println("Enter value to be inserted");
                int v = sc.nextInt();
                t.insert(v);
            } else if (c == 3)
                t.preorder(t.root);
            else if (c == 4)
                t.inorder(t.root);
            else if (c == 5)
                t.postorder(t.root);
            else if (c == 6) {
                System.out.println("Enter value to be deleted");
                int v = sc.nextInt();
                t.delete(v);
            } else if (c == 7)
                break;
            else
                System.out.println("Enter correct choice");
        }
    }
}