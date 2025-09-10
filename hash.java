import java.util.Scanner;


public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute (hash array of size 13, initialized to 0)
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Queries
        System.out.println("enetr the number of queeries");
        int q = sc.nextInt();
        
        while (q-- > 0) {
            System.out.println("enter the element");
            int number = sc.nextInt();
            // Fetch frequency
            System.out.println(hash[number]);
        }

        sc.close();
    }
}
