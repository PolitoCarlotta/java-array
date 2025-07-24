public class inverti {
    public static void main(String[] args) {
        int [] numeri = {1, 2, 3, 4, 5};

        for(int i=numeri.length; i >=0; i--){
            System.out.print(i);
            if(i>0){
                System.err.print(", ");
            }
        }
    }
}
