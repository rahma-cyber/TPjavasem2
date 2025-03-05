import java.util.Scanner;

public class APP1 {
    public static int nbrOcc(char car, String ch) {
        int count = 0;
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == car) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();
        System.out.print("Entrez un caractère à rechercher : ");
        char car = scanner.next().charAt(0);
        System.out.println("Le nombre d'occurrences de '" + car + "' dans '" + ch + "' est : " + nbrOcc(car, ch));
        scanner.close();
    }
}
