import java.lang.*;
import java.util.*;
public class EOArray {
    public static void main(String[] args)
    {
        int n, j=1;
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Count of numbers : ");
        int c  = sc.nextInt();
        System.out.println("Enter numbers : ");
        for(int i = 0;i<c;i++)
        {
            n = sc.nextInt();
            if(n%2==0)
            {
                even.add(n);
            }
            else
            {
                odd.add(n);
            }
        }
        System.out.println("Even Array : ");
        System.out.println(even);

        System.out.println("Odd Array : ");
        System.out.println(odd);
    }
}
