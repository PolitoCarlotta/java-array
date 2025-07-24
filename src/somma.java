public class somma {
    public static void main(String[] args) {
        int [] numeri = {1, 2, 3, 4, 5};

        //calcola somma di elementi dell'array

        int somma=0;
        for( int i=0; i<=numeri.length; i++){
            somma += i;
        }
        System.out.println("la somma dell'array è: " + somma);
    }
}
