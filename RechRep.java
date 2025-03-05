import java.util.Scanner;

public class RechRep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Saisir un Texte : ");
        String texte = scanner.nextLine();

        
        System.out.print("Donner mot 1 : ");
        String mot1 = scanner.nextLine();

        System.out.print("Donner mot 2 : ");
        String mot2 = scanner.nextLine();

        
        int position = texte.indexOf(mot1);
        if (position == -1) {
            System.out.println("Mot 1 n'existe pas dans le Texte");
        } else {
            int longueurMot1 = mot1.length();
           
            while (position != -1) {
                texte = texte.substring(0, position) + mot2 + texte.substring(position + longueurMot1);
                position = texte.indexOf(mot1, position + mot2.length());
            }
            
           
            System.out.println("Texte modifié : " + texte);
        }

        scanner.close();
    }
}