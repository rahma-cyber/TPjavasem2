import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String[][] medicaments = {
            {"amoxicilline", "antibiotique", "13-04-2023", "14-03-2026", "orale", "34.000"},
            {"corticoide", "antiinflammatoire", "24-08-2024", "25-06-2028", "orale", "10.255"},
            {"fluconazole", "antifongiques", "15-03-2022", "15-02-2025", "orale", "22.765"},
            {"ceftrixano", "antibiotiques", "01-01-2025", "01-10-2028", "injectable", "106.800"}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une catégorie (antibiotique, antiinflammatoire, antifongiques, antibiotiques) : ");
        String categorieChoisie = scanner.nextLine();
        System.out.println("Médicaments de la catégorie " + categorieChoisie + " :");
        for (String[] medicament : medicaments) {
            if (medicament[1].equalsIgnoreCase(categorieChoisie)) {
                for (String info : medicament) {
                    System.out.print(info + " ");
                }
                System.out.println();
            }
        }
        double[][] prixMiseAJour = new double[medicaments.length][1];
        for (int i = 0; i < medicaments.length; i++) {
            double prix = ex1.convertir(medicaments[i][5]);
            prix = prix * (1 + 0.05); 
            prixMiseAJour[i][0] = prix;
           
        System.out.println("\nTableau après mise à jour des prix :");
        for (String[] medicament : medicaments) {
            for (String info : medicament) {
                System.out.print(info + " ");
            }
            System.out.println();
        }
        System.out.println("\nPrix mis à jour  :");
        ex1.affichageM(prixMiseAJour);
        scanner.close();
    }
}













