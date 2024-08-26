import java.util.*;

public class Conditions {
    public static void main(String args[]) {

        // Scanner myObj = new Scanner(System.in);
        // System.out.println("Enter your age :");
        // int age = myObj.nextInt();
        // if (age > 18) {
        // System.out.println("You are adult");
        // }
        // else {
        // System.out.println("You are underage");
        // }

        // Scanner myNum = new Scanner(System.in);
        // System.out.println("Enter number :");
        // int number = myNum.nextInt();
        // if(number % 2 == 0) {
        // System.out.println("Number is even");
        // }
        // else {
        // System.out.println("Number is odd");
        // }

        // Scanner anyNum = new Scanner(System.in);
        // System.out.println("Enter two numbers :");
        // int number1 = anyNum.nextInt();
        // int number2 = anyNum.nextInt();
        // if (number1 == number2) {
        //     System.out.println("Equal");
        // } else if (number1 > number2) {
        //     System.out.println(number1 + " is greater than " + number2);
        // } else {
        //     System.out.println(number2 + " is greater than " + number1);
        // }

        // Scanner greeting = new Scanner(System.in);
        // System.out.println("Enter 1 or 2 or 3");
        // int myGreeting = greeting.nextInt();
        // if (myGreeting == 1) {
        //     System.out.println("hello");
        // }
        // else if (myGreeting == 2) {
        //     System.out.println("namaste");
        // }
        // else if (myGreeting == 3) {
        //     System.out.println("bonjour");
        // }
        // else {
        //     System.out.println("invalid");
        // }

        // SWITCH BREAK STATEMENT

        Scanner myButton = new Scanner(System.in);
        System.out.println("press any button");
        int button = myButton.nextInt();
        switch(button) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("namaste");
            break;
            case 3 : System.out.println("bonjour");
            break;
            default : System.out.println("invalid button");
        }
    }
}