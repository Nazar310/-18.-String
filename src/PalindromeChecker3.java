import java.util.Scanner;

public class PalindromeChecker3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок для перевірки на паліндром:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Введений рядок є паліндромом.");
        } else {
            System.out.println("Введений рядок не є паліндромом.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int i = 0, j = str.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            }
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
