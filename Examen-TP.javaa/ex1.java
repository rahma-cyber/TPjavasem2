public class ex1{
    public static double convertir(String chaine) {
        try {
            return Double.parseDouble(chaine);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : La chaîne \"" + chaine + "\" ne peut pas être convertie en réel.");
            return Double.NaN; 
        }
    }
    public static void affichageM(double[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}