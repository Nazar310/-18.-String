import java.util.Scanner;

public class StringReverse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок:");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.println("Обернений рядок: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}