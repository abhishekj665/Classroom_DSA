package BST;


public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinarySearchTree {
        static int idx = -1;

        public static Node insert(Node root, int val){
            if(root == null){
                root = new Node(val);
                return root;
            }

            if(root.data > val){
                root.left = insert(root.left, val);
            }else{
                root.right = insert(root.right, val);
            }

            return root;
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static boolean search(Node root, int key){
            if(root == null){
                return false;
            }
            if(root.data == key){
                return true;
            }

            if(root.data > key){
                return search(root.left, key);
            }else{
                return search(root.right, key);
            }

        }
    }

    public static void main(String[] args) {
        int[] data = {5,1,3,4,2,7};

        BinarySearchTree tree = new BinarySearchTree();

        Node root = null;

        int key = 8;

        for(int i = 0; i < data.length; i++){
            root = tree.insert(root, data[i]);
        }

        tree.inOrder(root);

        System.out.println(tree.search(root, key));
    }
}
