import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of inputs : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int index = findNearestNeighbors(nums);
        System.out.println("Index of the first number: " + index);
    }
    public static int findNearestNeighbors(int[] nums) {
        int minDiff = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[i-1]);
            if (diff < minDiff) {
                minDiff = diff;
                index = i-1;
            }
        }
        return index;
    }

}
