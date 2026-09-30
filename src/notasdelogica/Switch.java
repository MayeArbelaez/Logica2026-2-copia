package notasdelogica;

import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione 1. Usuario Standard \n" +
                "2. Usuario Frecuente \n" +
                "3. Usuario Vip \n" +
                "4. Usuario nuevo");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Cliente Standard");
                break;
            case 2:
                System.out.println("Cliente Frecuente");
                break;
            case 3:
                System.out.println("Cliente VIP");
                break;
            case 4:
                System.out.println("Cliente Nuevo");
                break;
            default:
                System.out.println("Opción no valida");
        }





    }



}
