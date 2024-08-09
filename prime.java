import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n, i, num, count;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        n = input.nextInt();
        System.out.println("Prime numbers up to " + n + ":");

        for (num = 1; num <= n; num++) {
            count = 0;
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && num != 1) {
                System.out.println(num);
            }
        }
    }
}
