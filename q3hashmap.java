import java.util.*;

public class q3hashmap {
    static class intersection{
        public void intersection(int array1[],int array2[]){
            HashSet<Integer> set=new HashSet<>();
            HashSet<Integer> result=new HashSet<>();
            for (Integer integer : array1) {
                set.add(integer);

            }
            for (Integer integer : array2) {
                if (set.contains(integer)) {
                    result.add(integer);
                }
                

            }
            for (Integer integer : result) {
                System.out.print(integer + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] array1={7,3,9};
        int[] array2={6,3,9,2,9,4};
        intersection obj1=new intersection();
        obj1.intersection(array1, array2);
    }
    
}
