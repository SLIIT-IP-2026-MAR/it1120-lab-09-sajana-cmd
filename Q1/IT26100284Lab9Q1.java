import java.util.Scanner;

public class IT26100284Lab9Q1 {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);


double[] coefficients = new double[3];

char[] labels = {'a', 'b', 'c'};


for (int i = 0; i < coefficients.length; i++) {
System.out.print("Enter value " + labels[i] + ": ");
coefficients[i] = input.nextDouble();
}

System.out.println();

calculateQuadraticRoots(coefficients);

input.close();
}

public static void calculateQuadraticRoots(double[] coeffs) {
double a = coeffs[0];
double b = coeffs[1];
double c = coeffs[2];

double discriminant = Math.pow(b, 2) - (4 * a * c);


if (discriminant > 0) {
System.out.println("Roots are real and different :");

double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

System.out.printf("Root 1: %.2f\n", root1);
System.out.printf("Root 2: %.2f\n", root2);

} else if (discriminant == 0) {
System.out.println("Roots are real and equal :");
double root = -b / (2 * a);
System.out.printf("Root: %.2f\n", root);

} else {
System.out.println("Roots are complex and imaginary.");
}
}
}