public class rettangolo {
    public static void main(String[] args) {
        int righe = 4;
        int colonne = 6;

        for(int i = 1; i<=righe; i++){
            for(int j=1; j<=colonne; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
