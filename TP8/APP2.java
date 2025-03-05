import java.util.Scanner;

public class APP2 {
    public static String premierMot(String ch) {
        String[] mots = ch.split(" ");
        return mots.length > 0 ? mots[0] : "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();
        System.out.println("Le premier mot est : " + premierMot(ch));
        scanner.close();
    }
}
