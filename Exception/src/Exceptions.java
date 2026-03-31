import java.util.*;

public class Exceptions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num : ");
        int a = sc.nextInt();
        System.out.print("Enter a num : ");
        int b = sc.nextInt();

        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e.getClass());
        }
    }
}
