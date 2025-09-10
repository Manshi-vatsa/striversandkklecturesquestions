import java.util.HashMap;
import java.util.Map;

public class q1ofhashmap {

  // program without using hashmap
//     public static void find_frequency(int[] array){
//         for(int i=0;i<array.length;i++){
//             boolean already_printed=false;
//             int  count=1;
//             for(int k=0;k<i;k++){
//                 if (array[k]==array[i]) {
//                     already_printed=true;
//                      break;
//                 }
//             }
//             if (already_printed) {
//                 continue;
//             }
//             for (int j = i+1; j < array.length; j++) {
//                 if (array[i]==array[j]) {
//                     count++;
//                 }
//             }
//             System.out.println( array[i]+":"+count);
            
//         }
//     }

//    public static void main(String[] args) {
//     int array[]={1,2,3,4,2,2,4,4,5,7};
       
//        find_frequency(array);
//    }
// time complexity=o(n2)
//program using hashmap
//steps-
//1.cretae map 2.find frrequency of all numvers and store in map 2.check if the 
//element already exits the update the frequency and if doesnt exit then add new pair


 static void count_frequency(int[] array){
        HashMap<Integer,Integer> nums = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (nums.containsKey(array[i])) {
                nums.put(array[i], nums.get(array[i]) + 1);  // ✅ fixed
            } else {
                nums.put(array[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : nums.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for(Map.Entry<Integer,Integer> entry: nums.entrySet()){
            
        }
    }

    public static void main(String[] args){
        int[] array = {1,2,3,1,2,3,1,1,6,5,5,7};
        count_frequency(array);
    }
}