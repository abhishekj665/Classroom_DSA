package Questions;



import java.util.Scanner;
import java.util.TreeMap;

public class CharacterSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        StringBuilder ans  = new StringBuilder();


        TreeMap<Character,Integer> map = new TreeMap<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0) + 1);
            }else{
                map.put(ch, 1);
            }
        }

        for(char ch : map.keySet()){
            if(map.get(ch) != 0){
                ans.append(ch);
                map.put(ch, map.get(ch) - 1);
            }
        }

        System.out.println(ans);


    }
}
