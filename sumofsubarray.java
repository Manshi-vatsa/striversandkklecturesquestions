import java.util.HashMap;
import java.util.Map;
import java.util.stream.Gatherer.Integrator;

public class sumofsubarray {
    
        public static void main(String[] args) {
        
        int[] array={1,2,3,4,5,6,78};
        HashMap<Integer,Integer> subarray=new HashMap<>();
        subarray.put(0,1)
        int sum=0;
        int ans=0;

        for (int i = 0; i < array.length; i++) {
             sum=sum+array[i];
             if (subarray.containsKey(sum-k)) {
                subarray.put(, null)
             }
        }
    }
}
