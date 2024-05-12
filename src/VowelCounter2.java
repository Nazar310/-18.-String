import java.util.Scanner;

public class VowelCounter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок:");
        String input = scanner.nextLine();
        int vowelCount = countVowels(input);
        System.out.println("Кількість голосних літер у рядку: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}