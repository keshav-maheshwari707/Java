import java.util.*;

public class First {
    public static void main(String args[]) {
        // VARIABLES - We can change the value of variables.
        // int age = 18;
        // String name = "Keshav Maheshwari";
        // float price = 25.67;

        // name = "Ironman";
        // age = 20;
        int a = 10;
        int b = 20;
        int sum = a + b;
        int diff = b - a;
        int multiply = a * b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(multiply);

        int x = 10;
        int y = 5;
        int ans = (x * y) / (x - y);
        System.out.println(ans);
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");

        // INPUT
        Scanner sc = new Scanner(System.in); // Output ke liye system.out & input ke liye system.in. Scanner is a class from java.util.*
        
        // Scanner sc1 = new Scanner(System.in);
        
        // String name = sc.next();  // Storing user's input in a variable "name". Next function takes only one word as input, for sentence we have to use nextline() function.

        String fullName = sc.nextLine();
        // System.out.println(name);
        System.out.println(fullName);
    }
} 

// 3 ways to display output: 
// 1. print() same line mein display karega.
// 2. println() next line mein display karega.
// 3. "\n" next line mein display karega.

