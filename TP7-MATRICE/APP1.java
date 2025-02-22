import java.util.Scanner;

public class APP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int nl, nc;
        do {
            System.out.print("Entrez le nombre de lignes (nl < 50): ");
            nl = scanner.nextInt();
        } while (nl <= 0 || nl >= 50);

        do {
            System.out.print("Entrez le nombre de colonnes (nc < 50): ");
            nc = scanner.nextInt();
        } while (nc <= 0 || nc >= 50);

     
        int[][] M = new int[nl][nc];

     
        System.out.println("Remplissez la matrice avec des entiers pairs:");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    System.out.print("M[" + i + "][" + j + "]: ");
                    M[i][j] = scanner.nextInt();
                } while (M[i][j] % 2 != 0); 
            }
        }

       
        int X;
        do {
            System.out.print("Entrez un entier pair X à rechercher: ");
            X = scanner.nextInt();
        } while (X % 2 != 0); 

       
        boolean trouve = false;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                if (M[i][j] == X) {
                    trouve = true;
                    break;
                }
            }
            if (trouve) break;
        }

        
        if (trouve) {
            System.out.println("L'entier " + X + " existe dans le tableau.");
        } else {
            System.out.println("L'entier " + X + " n'existe pas dans le tableau.");
        }

        scanner.close();
    }
}