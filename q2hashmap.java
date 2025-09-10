import java.util.*;

public class q2hashmap {
  static class  union{
    public void union(int array1[],int array2[]){
        HashSet<Integer> set= new HashSet<>();
        for (int i : array1) {
            set.add(i);
        }
        for (Integer integer : array2) {
            set.add(integer);
        }
        System.out.println(set.size());
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
    }

  }
  public static void main(String[] args) {
    int array1[]={1,2,2,3,4,5,6};
    int array2[]={1,2,5,6,7,3};
    union obj1= new union();
    obj1.union(array1, array2);
  }
}
