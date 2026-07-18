public class LL {

    static class Node{
        int data;
        Node next;

        public Node(){

        }

        public Node (int data, Node next){
            this.data = data;
            this.next = next;
        }

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {

        Node l1 = new Node();

    }
}
