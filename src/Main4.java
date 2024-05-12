import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок:");
        String input = scanner.nextLine();
        String result = removeDuplicates(input);
        System.out.println("Рядок без дублікатів: " + result);
        scanner.close();
    }

    public static String removeDuplicates(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!uniqueChars.contains(currentChar)) {
                result.append(currentChar);
                uniqueChars.add(currentChar);
            }
        }

        return result.toString();
    }
}
