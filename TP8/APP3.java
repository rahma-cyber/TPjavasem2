import java.util.Scanner;

public class APP3 {
    public static boolean estPalindrome(String ch) {
        ch = ch.replaceAll("\\s", "").toLowerCase(); // Ignorer les espaces et la casse
        int n = ch.length();
        for (int i = 0; i < n / 2; i++) {
            if (ch.charAt(i) != ch.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();
        if (estPalindrome(ch)) {
            System.out.println("La chaîne '" + ch + "' est un palindrome.");
        } else {
            System.out.println("La chaîne '" + ch + "' n'est pas un palindrome.");
        }
        scanner.close();
    }
}
