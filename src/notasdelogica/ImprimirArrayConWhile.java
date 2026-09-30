package notasdelogica;

public class ImprimirArrayConWhile {


    public static void main(String[] args) {

        String[] nombres = {"Juan", "Maria", "Pedro", "Ana", "Luis"};

        int i = 0;

        while (i < nombres.length) {
            System.out.println(nombres[i]);
            i++;
        }
    }




}
