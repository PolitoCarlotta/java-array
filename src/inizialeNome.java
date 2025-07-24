
import javax.print.attribute.standard.PresentationDirection;
import jdk.jshell.spi.ExecutionControl;

public class inizialeNome {
    public static void main(String[] args) {
        String [] persone = {"Anna", "Luca", "Alberto", "Giulia", "Andrea"};

        System.out.print("I nomi che iniziano con la A sono: ");

        for (int i =0; i<persone.length; i++) {
            if(persone[i].startsWith("A")) {
                System.out.print(persone[i]);
                if(i<persone.length -1){
                    System.out.print(", ");
                }
            }
           
        }
    }

}
