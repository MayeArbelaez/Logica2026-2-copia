package notasdelogica;

import org.w3c.dom.ls.LSOutput;

public class While {


    public static void main(String[] args) {
        // Caso 1 Contador

        int contador = 0;

        while(contador < 10){
            System.out.println("Valor:" + contador);
            contador++;
        }


        // Imprimir los numeros impares del 1 al 100
        int numero = 1;
        while(numero <= 100){
            if(numero % 2 != 0){
                System.out.println("Numero impar:" + numero);
            }
            numero++;
        }

        // Imprimir los numeros pares del 1 al 100
        int numeroPar = 1;
        while(numeroPar <= 100){
            if(numeroPar % 2 == 0){
                System.out.println("Numero par:" + numeroPar);
            }
            numeroPar++;
        }






    }




}
