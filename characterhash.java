import java.util.Scanner;

public class characterhash {
 public static void main(String[] args) {
    System.out.println("enter the string");
    Scanner sc=new Scanner(System.in);
   String string=sc.nextLine();
   int[] hash=new int[256];
   for (int i = 0; i <string.length(); i++) {
      char  ch=string.charAt(i);
      hash[ch]++;

   }
   System.out.println("enter the number of queries");
   int q=sc.nextInt();
   while (q-->0) {
    System.out.println("enter the character");
    char chr=sc.next().charAt(0);
    System.out.println(hash[chr]);
   }


 }   
}
