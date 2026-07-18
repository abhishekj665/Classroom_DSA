package Questions;

public class Psuedocode {

    public static int print(int x, int y){
        if(x < 5){
            print(x + 1, y);
        }

        System.out.println(y);

        return print(x, y);
    }

    public static void main(String[] args) {
        print(3, 5);
    }
}
