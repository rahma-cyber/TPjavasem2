import java.util.Scanner;

public class APP4 {
    public static String inverserChaine(String ch) {
        StringBuilder sb = new StringBuilder(ch);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();
        System.out.println("Chaîne inversée : " + inverserChaine(ch));
        scanner.close();
    }
}
