import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок:");
        String input = scanner.nextLine();

        String[] words = splitStringToWords(input);

        System.out.println("Масив слів:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String[] splitStringToWords(String input) {
        Scanner scanner = new Scanner(input);
        String[] words = new String[input.split(" ").length];
        int index = 0;
        while (scanner.hasNext()) {
            words[index++] = scanner.next();
        }
        return words;
    }
}
