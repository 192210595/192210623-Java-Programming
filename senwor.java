  import java.util.Scanner;
public class senwor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        String[] sentences = text.split("[.!?]+");
        int sentenceCount = sentences.length;
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
    }
}
