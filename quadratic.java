import java.util.Scanner;
public class quadratic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        System.out.print("a = ");
        double a  = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if (d> 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two distinct real roots:");
            System.out.println("Root 1 = " + root1); 
            System.out.println("Root 2 = " + root2);
        } else if (d== 0) {
            double root = -b / (2 * a);
            System.out.println("One real root:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("No real roots. Complex roots:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart);
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart);
        }
        scanner.close();
    }
}
