import java.util.Scanner;
public class lines{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String:");
        StringBuilder javaCode = new StringBuilder();
        String line;
        while (!(line = input.nextLine()).isEmpty()) {
            javaCode.append(line).append("\n");
        }
        int lineCount = countLines(javaCode.toString());
        System.out.println("Total number of lines: " + lineCount);
        input.close();
    }
    public static int countLines(String text) {
        // Split the text by new lines
        String[] lines = text.split("\\r?\\n");
        return lines.length;
    }
}
