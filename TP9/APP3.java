import java.util.Scanner;

public class APP3 {
    public static String mettreEnMajuscule(String ch) {
        String[] mots = ch.split(" ");
        StringBuilder resultat = new StringBuilder();

        for (String mot : mots) {
            if (!mot.isEmpty()) {
                resultat.append(Character.toUpperCase(mot.charAt(0)))
                        .append(mot.substring(1))
                        .append(" ");
            }
        }
        return resultat.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Entrez une chaîne de caractères (max 20 caractères) : ");
        String ch = scanner.nextLine();
        if (ch.length() > 20) {
            System.out.println("Erreur : La chaîne ne doit pas dépasser 20 caractères.");
            return;
        }

       
        System.out.println("Chaîne après transformation : " + mettreEnMajuscule(ch));

        scanner.close();
    }
}
