import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of inputs : ");
        int n = sc.nextInt(); // read number of inputs from user
        int[] nums = new int[n]; // create an array of size n to store the inputs
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt(); // read inputs from user and store them in array nums
        }
        int index = findNearestNeighbors(nums); // call the findNearestNeighbors method to find the index of the first number
        System.out.println("Index of the first number: " + index); // print the index of the first number
    }

    public static int findNearestNeighbors(int[] nums) {
        int minDiff = Integer.MAX_VALUE; // set initial minimum difference to the maximum value possible for an int
        int index = 0; // set initial index to 0
        for (int i = 1; i < nums.length; i++) { // loop through the array starting from index 1
            int diff = Math.abs(nums[i] - nums[i-1]); // calculate the absolute difference between each adjacent pair of numbers
            if (diff < minDiff) { // if the difference is less than the current minimum difference
                minDiff = diff; // update the minimum difference
                index = i-1; // update the index of the first number to the index of the first number in the pair with the minimum difference
            }
        }
        return index; // return the index of the first number
    }
}
