public class triangolo {
    public static void main(String[] args) {

        int numero = 5;

        for( int i=1; i<=numero; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
