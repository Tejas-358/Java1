import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        // Initialize variables and ArrayLists
        int n, j=1;
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter count of numbers
        System.out.println("Enter Count of numbers : ");
        int c  = sc.nextInt();

        // Prompt user to enter the numbers
        System.out.println("Enter numbers : ");
        for(int i = 0;i<c;i++)
        {
            // Read the number from the user
            n = sc.nextInt();

            // Check if the number is even or odd
            if(n%2==0)
            {
                // Add even number to the even ArrayList
                even.add(n);
            }
            else
            {
                // Add odd number to the odd ArrayList
                odd.add(n);
            }
        }

        // Print the even ArrayList
        System.out.println("Even Array : ");
        System.out.println(even);

        // Print the odd ArrayList
        System.out.println("Odd Array : ");
        System.out.println(odd);
    }
}
