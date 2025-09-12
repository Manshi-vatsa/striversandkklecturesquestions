import java.util.*;
import java.util.Map.Entry;


public class countinefrequencies {
    static void count(int[] array){
       HashMap<Integer,Integer> map=new HashMap<>();
       for (int i = 0; i < array.length; i++) {
         if (map.containsKey(array[i])) {
            map.put(array[i],(map.get(array[i]))+1);
        }
        else{
            map.put(array[i],1);
        }
       }
      for(Entry<Integer, Integer> entry:map.entrySet()){
        System.out.println(entry.getKey()+":"+ entry.getValue());
      }
    }
    public static void main(String[] args) {
        int[] array={1,2,2,1,3};
        count(array);
        
    }

}