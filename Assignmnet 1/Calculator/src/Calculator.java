import java.util.*;

public class Calculator {
    public void add(int a, int b) {
        System.out.println("Addition : " + (a+b));
    }

    public void power(int a, int b) {
        System.out.println("Power : " + Math.pow(a,b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction : " + (a-b));
    }

    public void div(int a, int b) {
        System.out.println("Division : " + (a+b));
    }

    public void multi(int a, int b) {
        System.out.println("Multiplication : " + (a*b));
    }

    public void mean(ArrayList<Integer> arr)
    {
        int sum = 0;
        int count = arr.size();
        for(Integer i:arr)
        {
            sum = sum+i;
        }
        System.out.println("Mean : "+sum/count);
    }
    public void standardDeviation(ArrayList<Integer> arr)
    {
        int sum = 0, sd = 0;
        int count = arr.size();
        for(Integer i:arr)
        {
            sum = sum+i;
        }
        int mean = sum/count;
        for(Integer i:arr)
        {
            sd = (int) (sd + Math.pow((i-mean), 2));
        }
        sd = sd/count;
        System.out.println("Standard Deviation : "+Math.sqrt(sd));
    }
}
