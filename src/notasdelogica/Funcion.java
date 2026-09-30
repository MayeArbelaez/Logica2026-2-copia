package notasdelogica;

import java.util.Scanner;

public class Funcion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args){
        System.out.println("Escriba su nombre");

        String nombre = sc.nextLine();

        saludarV2(nombre);

    }

    public static void saludar(){
        String saludo= "Hola";

        System.out.println(saludo);

    }


    public static void saludarV2(String nombre){

        System.out.println("Hola " + nombre);


    }
}
