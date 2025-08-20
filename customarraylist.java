
import java.util.*;

public class customarraylist {
    private int[] data;
    private int size=0;//acts as index
    private static int DEFAULT_SIZE=10;
    public customarraylist() {
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize() {
       int[] temp=new int[size*2];
       for (int i = 0; i < data.length; i++) {
        temp[i]=data[i];
       }
       data=temp;
    }
    private boolean isfull() {
       return size==DEFAULT_SIZE;
    }
    @Override
public String toString() {
    return Arrays.toString(Arrays.copyOf(data, size));
}
public int remove(int index){
    
   if(index<0 || index >=size){
    throw new IndexOutOfBoundsException("invalid index");
   }
   int removed=data[index];
  for (int i = index; i < size-1; i++) {
    data[i]=data[i+1];
    
  }
    size--;
    return removed;

}


    public static void main(String[] args) {
        customarraylist mylist=new customarraylist();
        for (int i = 0; i < 14; i++) {
            mylist.add(i*2);
        }
        System.out.println(mylist.toString());
        mylist.remove(5);
        System.out.println(mylist.toString());
    }
    
}
