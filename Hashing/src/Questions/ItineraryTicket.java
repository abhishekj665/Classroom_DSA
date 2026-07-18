package Questions;

import java.util.ArrayList;
import java.util.HashMap;


public class ItineraryTicket {

    public static void main(String[] args) {

        HashMap<String,String> from = new HashMap<>();
        HashMap<String, String> to = new HashMap<>();

        ArrayList<String> destinations = new ArrayList<>();

        String start = "";

        from.put("Chennai","Bangalore");
        from.put("Mumbai", "Delhi");
        from.put("Goa", "Chennai");
        from.put("Delhi", "Goa");

        for(String str : from.keySet()) {
            to.put(from.get(str), str);
        }
        for(String str : from.keySet()){
            if(!to.containsKey(str)){
                start = str;
            }
        }



        while(from.containsKey(start)){
            destinations.add(start);
            start = from.get(start);
        }

        destinations.add(start);

        System.out.println(destinations);

    }
}
