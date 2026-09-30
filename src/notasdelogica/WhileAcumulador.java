package notasdelogica;

public class WhileAcumulador {


    public static void main(String[] args) {
        int contador = 0;
        int acumulador = 0;

        while (contador < 10){
            contador++;
            acumulador = acumulador + contador;
            System.out.println("Contador: " + contador + " Acumulador: " + acumulador);
        }
    }
}
