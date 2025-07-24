public class minimo {
    public static void main(String[] args) {
        int [] numeri = {1, 2, 3, 4, 5};
        int minimo= numeri[0];
        for( int i=0; i<numeri.length; i++){
            if(numeri[i]<minimo){
                minimo = numeri[i];
            }
        }
        System.out.println("il numero minimo è: " + minimo);
    }
}
