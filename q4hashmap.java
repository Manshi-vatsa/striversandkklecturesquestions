import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//in this question we have the advanatage that we can make reverse map because accordign to the guven condition all the keys and values are unique but i have not created it here
//this question basicassy find the route from starting to end
public class q4hashmap {
    static class itinerary{
       public static  String find_starting(HashMap<String, String> map){
         String starting = null;
        Set<String> Froms=map.keySet();
        Set<String>  tos=new HashSet<>(map.values());
        for (String start:Froms) {
            if(!(tos.contains(start))){
                 starting=start;
            }
        } 
        return starting;   
       }
       public static void iterator(String starting,HashMap<String,String> map){
         while (map.containsKey(starting)) {
            System.out.print(starting + "->");
            starting=map.get(starting);
         }
         System.out.print(starting);
       }

    }
    public static void main(String[] args) {
        HashMap<String,String> places=new HashMap<>();
        places.put("Chennai", "Bengaluru");
        places.put("Mumbai","Delhi");
        places.put("Goa", "Chennai");
        places.put("Delhi", "Goa");

        itinerary obj1=new itinerary();
       String starting=obj1.find_starting(places);
       obj1.iterator(starting, places);

        
    }
}
