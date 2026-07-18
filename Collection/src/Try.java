import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Try {

    public static void main(String[] args) {

        Collection<String> string = new ArrayList<>();

        string.add("One");
        string.add("Two");
        string.add("Three");
        string.add("Four");

        for(Iterator<String> iterator = string.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }


    }
}
