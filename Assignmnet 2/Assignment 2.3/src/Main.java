import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create an instance of the ATA class
        ATA obj = new ATA();
        
        // Call the ATAL method to get an ArrayList
        ArrayList l = obj.ATAL();
        
        // Call the ALTA method and pass the ArrayList as an argument
        obj.ALTA(l);
    }
}

class ATA {
    // Declare a private ArrayList to store the elements
    private ArrayList j;

    // This method creates an ArrayList, adds elements to it, and returns it
    ArrayList ATAL() {
        // Create an array of strings
        String[] names = {"A", "B", "C", "D", "E"};
        
        // Create an ArrayList of strings and add the elements from the array
        ArrayList<String> a1 = new ArrayList<String>();
        for (int i = 0; i < names.length; i++) {
            a1.add(names[i]);
        }
        
        // Print the original ArrayList
        System.out.println("Original ArrayList : ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(a1.get(i) + " ");
        }
        
        // Add more elements to the ArrayList
        a1.add("X");
        a1.add("Y");
        a1.add("Z");

        // Print the new ArrayList
        System.out.println("\nNew ArrayList : ");
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i) + " ");
        }
        
        // Return the ArrayList
        return (a1);
    }

    // This method receives an ArrayList as an argument and converts it to an array of strings
    void ALTA(ArrayList j) {
        // Set the private ArrayList to the one passed as an argument
        this.j = j;
        
        // Create an array of strings
        String[] str = new String[5];

        // Copy the elements of the ArrayList to the array of strings
        for (int i = 0; i < str.length; i++) {
            str[i]=(String) j.get(i);
        }

        // Print the array of strings
        System.out.println("\nArray : ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
