import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] k) throws IOException {
        int n, fact = 1, con = 1; //declare variables for later use
        do {
            Scanner sc = new Scanner(System.in); //create a scanner object for user input
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in)); //create a buffered reader object for user input
            System.out.println("1) Fibonacci using Scanner");
            System.out.println("2) Fibonacci using Buffer");
            System.out.println("3) Factorial using Scanner");
            System.out.println("4) Factorial using Buffer");
            switch (Integer.parseInt(k[0])) { //parse user input as an integer and switch based on the value
                case 1: { //if user input is 1
                    System.out.println("Enter number 1 : ");
                    int n1 = sc.nextInt(); //get first number from user
                    System.out.println("Enter number 2 : ");
                    int n2 = sc.nextInt(); //get second number from user
                    System.out.println("Enter length : ");
                    int len = sc.nextInt(); //get length of Fibonacci series from user
                    for(int i =0;i<len;i++) //loop for specified length
                    {
                        int p = n1+n2; //compute next number in Fibonacci series
                        n1 = n2;
                        n2=p;
                        System.out.println(p + " "); //print the next number
                    }
                    break; //break out of switch statement
                }
                case 2: { //if user input is 2
                    System.out.println("Enter number 1 : ");
                    int n1 = Integer.parseInt(rd.readLine()); //get first number from user
                    System.out.println("Enter number 2 : ");
                    int n2 = Integer.parseInt(rd.readLine()); //get second number from user
                    System.out.println("Enter length : ");
                    int len = Integer.parseInt(rd.readLine()); //get length of Fibonacci series from user
                    for(int i =0;i<len;i++) //loop for specified length
                    {
                        int p = n1+n2; //compute next number in Fibonacci series
                        n1 = n2;
                        n2 = p;
                        System.out.println(p + " "); //print the next number
                    }
                    break; //break out of switch statement
                }
                case 3: { //if user input is 3
                    fact = 1; //initialize factorial to 1
                    System.out.println("Enter number for Factorial : ");
                    n = sc.nextInt(); //get number to compute factorial of from user
                    for (int i = 1; i <= n; i++) //loop from 1 to specified number
                    {
                        fact = fact * i; //compute factorial
                    }
                    System.out.println("Factorial SC : " + fact); //print the result
                    break; //break out of switch statement
                }
                case 4: //if user input is 4
                {
                    fact = 1; //initialize factorial to 1
                    try //use try-catch to handle IOException from BufferedReader
                    {
                        System.out.println("Enter number for Factorial : ");
                        n = Integer.parseInt(rd.readLine()); //get number to compute factorial of from user
                        for (int i = n; i > 0; i--) //loop from specified number to 1
                        {
                            fact = fact * i; //compute factorial
                        }
                        System.out.println("Factorial BR : " + fact);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
            System.out.println("Continue 1) Yes 2) No : "); //Continue or not
            con = sc.nextInt();
        }while (con==1); //Input for Continuation
    }
}
