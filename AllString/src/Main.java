import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        String text = new Scanner(System.in).nextLine();
        String regex = "[^a-zA-Z]";
        String formattedText = text.replaceAll(regex, " ");
        String[] words = formattedText.split("\\s");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}