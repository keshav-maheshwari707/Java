import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number :");
        double a = sc.nextDouble();

        System.out.println("enter second number :");
        double b = sc.nextDouble();

        System.out.println("enter operation you want to perform");
        System.out.println("1 for addition(+)");
        System.out.println("2 for subtraction(-)");
        System.out.println("3 for multiplication(*)");
        System.out.println("4 for division(/)");
        System.out.println("5 for modulus(%)");

        int operation = sc.nextInt();

        double result = 0;

        switch(operation) {
            
            case 1 : 
            result = a + b;
            System.out.println("RESULT = " + result);
            break;
            
            case 2 : 
            result = a - b;
            System.out.println("RESULT = " + result);
            break;
            
            case 3 : 
            result = a * b;
            System.out.println("RESULT = " + result);
            break;
            
            case 4 : 
            result = a * b;
            System.out.println("RESULT = " + result);
            break;
            
            case 5 : 
            result = a % b;
            System.out.println("RESULT = " + result);
            break;
            default : System.out.println("invalid");
        }
    }
}