import java.util.Scanner;
class FibonacciGenerator {
    // Method to generate Fibonacci series up to n terms
    public void generateSeries(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(); // Print new line after the series
    }
}

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in Fibonacci Series: ");
        int n = scanner.nextInt();

        // Create an instance of FibonacciGenerator class
        FibonacciGenerator generator = new FibonacciGenerator();

        // Call the generateSeries method to print the Fibonacci series
        generator.generateSeries(n);

        scanner.close();
    }
}
