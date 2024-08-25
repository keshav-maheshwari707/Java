import java.util.*;
 
public class Radius {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        double radius = myObj.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle is:" + area);
    }
}