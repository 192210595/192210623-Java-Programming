import java.util.Scanner;
class SumCalculator {
    private int sum;
    public SumCalculator() {
        sum = 0;
    }
    public void addNumber(int num) {
        sum += num;
    }
    public int getSum() {
        return sum;
    }
}
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        SumCalculator calculator = new SumCalculator();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            calculator.addNumber(number);
        }
        int totalSum = calculator.getSum();
        System.out.println("Sum of the " + n + " numbers is: " + totalSum);

        scanner.close();
    }
}
