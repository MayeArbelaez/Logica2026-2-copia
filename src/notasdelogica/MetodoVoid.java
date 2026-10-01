package notasdelogica;

public class MetodoVoid {


    public static void main(String[] args) {

        // String name = "Juan";
        saludarPorElNombre("Juan");
        sumarDosNumeros(100, 320);
    }


    public static void saludarPorElNombre(String nombre){

        System.out.println("Hola " + nombre);

    }

    public static void sumarDosNumeros(int num1, int suma2){
        int resultado = num1 + suma2;
        System.out.println("Resultdo = " +  resultado);
    }






}
