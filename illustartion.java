// this code basically iterate through given array and will print the elements along the number of times they have appeared ..for the elements 
//which have appeared more than once

import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class illustartion {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
       
        System.out.println("start entering the texts");
        Scanner sc=new Scanner(System.in);
       Map<Integer,Integer> collection=new HashMap<>();
       int count=1;
       for (int i = 0; i < 10; i++) {
         int num=sc.nextInt();
        list1.add(num);
       }
       Collections.sort(list1);
       System.out.println(list1.toString());
       for(int i=0;i<9;i++){
         
          if(list1.get(i)==list1.get(i+1)){
           count++;
          }else{
            if(count>1){
              collection.put(list1.get(i),count);
            }
            count=1;
          }

       }
       if (count > 1) {
            collection.put(list1.get(list1.size() - 1), count);
        }
       for(Integer key:collection.keySet()){
        System.out.println(key + "->" + collection.get(key));
       }
}
}
