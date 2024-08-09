import java.util.Scanner;
public class conc{
    public static void main(String[] args) {
        String a, b, c;
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the first string:");
        a = str.nextLine();
        System.out.println("Enter the second string:");
        b = str.nextLine();
        c = a + b;  
        System.out.println("Concatenated string: " + c);
   }
}
