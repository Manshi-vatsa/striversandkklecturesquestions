import java.util.HashSet;



public class q3hashmap {
    public static HashSet find_intersection(int[] array1,int[] array2){
        HashSet<Integer> newset=new HashSet<>();
        for (Integer nums:array1) {
              for (int i = 0; i < array2.length; i++) {
                if (array2[i]==nums) {
                    newset.add(nums);
                }
              }            
        }
        return newset;
    }
    public static void main(String[] args) {
        int array1[]={1,2,3,4,1,5,6};
    int array2[]={4,7};
    System.out.println(find_intersection(array1,array2));
    }
    
}
