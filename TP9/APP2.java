import java.util.Scanner;

public class APP2 {
    public static String coderChaine(String ch) {
        StringBuilder coded = new StringBuilder();

        for (char c : ch.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + 3) % 26 + base);
            }
            coded.append(c);
        }
        return coded.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Entrez une chaîne de caractères (max 30 caractères) : ");
        String ch = scanner.nextLine();
        if (ch.length() > 30) {
            System.out.println("Erreur : La chaîne ne doit pas dépasser 30 caractères.");
            return;
        }

        
        System.out.println("Chaîne codée : " + coderChaine(ch));

        scanner.close();
    }
}
