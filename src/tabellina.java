
import java.util.Scanner;

public class tabellina {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //chiedere all'utente di quale numero stampare la tabellina
        System.out.print("Di quale numero vuoi stampata la tabellina? ");
        int tabellina = input.nextInt();

        //chiedere fino a quale numero arrivare
        System.out.print("Fino  a quale moltiplicatore vuoi arrivare? ");
        int moltiplicatore = input.nextInt();

        //calcolare la tabellina
        System.out.println("La tabellina che hai scelto è: ");
        for( int i=0; i<= moltiplicatore; i++){
            System.out.println(tabellina*i);
        }


        //stampare

    }
}
