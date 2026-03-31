package Implementation;

public class Implementation {

    static class Node{
        Node[] children = new Node[26];
        boolean endOfWord = false;

        private Node(){
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }

    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.endOfWord = true;


    }

    public static void main(String[] args) {

        String[] words = {"the", "a", "there", "thee", "any", "their"};

        for (String word : words) {
            insert(word);
        }
    }
}
