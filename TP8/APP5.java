import java.util.Scanner;

public class APP5 {
    public static String ajouterAsterisques(String ch) {
        return String.join("*", ch.split(""));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();
        System.out.println("Chaîne modifiée : " + ajouterAsterisques(ch));
        scanner.close();
    }
}
