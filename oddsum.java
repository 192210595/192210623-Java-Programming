import java.util.Scanner;
public class oddsum{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        int sumOfOddDigits = 0;
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            if (digit % 2 != 0) { // Check if the digit is odd
                sumOfOddDigits += digit; // Add odd digit to the sum
            }
            number /= 10;
        }
        System.out.println("Sum of odd digits: " + sumOfOddDigits);
        reader.close();
    }
}
