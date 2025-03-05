import java.util.Scanner;

public class APP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Entrez une chaîne de caractères (max 50 caractères) : ");
        String ch = scanner.nextLine();
        if (ch.length() > 50) {
            System.out.println("Erreur : La chaîne ne doit pas dépasser 50 caractères.");
            return;
        }

      
        System.out.print("Entrez le mot à remplacer (max 10 caractères) : ");
        String mot1 = scanner.next();
        if (mot1.length() > 10) {
            System.out.println("Erreur : Le mot à remplacer ne doit pas dépasser 10 caractères.");
            return;
        }

        System.out.print("Entrez le mot de remplacement (max 10 caractères) : ");
        String mot2 = scanner.next();
        if (mot2.length() > 10) {
            System.out.println("Erreur : Le mot de remplacement ne doit pas dépasser 10 caractères.");
            return;
        }

      
        String resultat = ch.replace(mot1, mot2);
        System.out.println("Texte après remplacement : " + resultat);

        scanner.close();
    }
}
