import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez une chaîne de caractères: ");
        String input = scanner.nextLine();
        
   
        String reversed = new StringBuilder(input).reverse().toString();
        
       
        System.out.println("Chaîne inversée: " + reversed);
        
        scanner.close();
    }
}