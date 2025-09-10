import java.util.HashSet;

public class q2hashmap {
    static class union {
      public HashSet find_union(int[] array1,int[] array2){
        HashSet union=new HashSet<>();
        for (int i : array1) {
            union.add(i);
        }
        for (int i:array2){
            union.add(i);
        }
        return union;
      }
        
    }
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6};
        int[] array2={1,5,7,8,4};
        union obj1=new union();
        System.out.println( obj1.find_union(array1, array2));
       
       
    }
}
