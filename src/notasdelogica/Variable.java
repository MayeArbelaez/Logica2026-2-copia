package notasdelogica;

public class Variable {

    public static void main(String [] args){

        // Declaración de variables

        String nombreEstudiante1;
        String apellidoEstudiante1;
        int edadEstudiante1;
        boolean aprobadoEstudiante1;
        float notaEstudiante1;
        char arroba;

        // inicialización de variables

        nombreEstudiante1 = "Juan";
        apellidoEstudiante1 = "Perez";
        edadEstudiante1 = 20;
        aprobadoEstudiante1 = true;
        notaEstudiante1 = 4.6f;
        arroba = '@';

        // Concatenación de variables

        System.out.println("Nombre : " + nombreEstudiante1 + " " + apellidoEstudiante1 + "\n" +
                "edad: " + edadEstudiante1 + "\n" +
                "Nota estudiante: " + notaEstudiante1 + "\n" +
                "Aprobado: " + aprobadoEstudiante1 );


    }
}

