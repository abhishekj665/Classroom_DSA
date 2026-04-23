package Implementation;

public class BinaryTree {

    static class Node {
        Node left;
        Node right;
        int data;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insertBST(Node root, int val){
        if(root == null){
            Node newNode = new Node(val);
            return newNode;
        }

        if(root.data > val){
            root.left = insertBST(root.left, val);
        }else{
            root.right =  insertBST(root.right, val);
        }

        return root;


    }

    public static boolean searchBST(Node root, int val){

        if(root == null){
            return false;
        }

        if(root.data == val){
            return true;
        }


        if(root.data > val){
            return searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }
    }

    public static int cielBST(Node root, int val, int ciel){
        if(root == null){
            return ciel;
        }

        if(root.data == val){
            return val;
        }

        if(root.data > val && ciel > root.data){
            ciel = root.data;
        }

        if(root.data > val){
            return cielBST(root.left, val, ciel);
        }else{
            return cielBST(root.right, val, ciel);
        }
    }

    public static void main(String[] args) {

        int[] vals = {1,4,3,5,6,7,8};
        Node newNode = null;

        for(int i : vals){
            newNode = insertBST(newNode, i);
        }

        System.out.println(searchBST(newNode, 8));;

        System.out.println(cielBST(newNode, 2, Integer.MAX_VALUE));




    }
}
