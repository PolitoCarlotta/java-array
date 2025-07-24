public class massimo {
    public static void main(String[] args) {
        //trova massimo valore in un array

        int [] numeri = {1, 2, 3, 4, 5};
        int massimo = numeri[0];
        for( int i=0; i<numeri.length; i++){
            if(numeri[i]>massimo){
                massimo = numeri[i];
            }
        }
        System.out.println("il numero massimo è: " + massimo);
    }
}
