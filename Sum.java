import java.util.*;

public class Sum {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter two numbers to print their sum");
        
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int sum = num1 + num2;

        System.out.println(sum);
    }
}