import java.util.*;

public class IT26100284Lab9Q2 {

public static void main(String[] args) {
Scanner value = new Scanner(System.in);

System.out.print("Enter the radius of the circle: ");
double radius = value.nextDouble();

double area = circleArea(radius);

System.out.print("The area of the circle with radius " + radius + " is: " + area);

value.close();
}