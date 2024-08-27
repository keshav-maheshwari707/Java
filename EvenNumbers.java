import java.util.*;

public class EvenNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = scanner.nextInt();
        System.out.println("even numbers from zero to " + n + " are :");

        for(int i = 0; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }
}