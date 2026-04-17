import java.util.Stack;

public class ReverseDLL {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        Node(int data, Node prev, Node next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public static Node reverseDLL(Node head){

        Node temp = head;
        Stack<Integer> s = new Stack();

        while(temp != null){
            s.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            temp.data = s.pop();
            temp = temp.next;
        }

        return head;
    }


    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);

        reverseDLL(head);

        print(head);

    }

}

