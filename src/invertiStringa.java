
import java.util.Scanner;

public class invertiStringa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.err.print("Inserisci la parola da invertire: ");
        String parola = input.next();
        System.out.println("La parola invertita è: ");
        for( int i = parola.length()-1; i >= 0; i--) {
            char invertita = parola.charAt(i);
            System.out.print(invertita);
        }
    }
}
