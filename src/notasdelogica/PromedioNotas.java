package notasdelogica;

public class PromedioNotas {


    public static void main(String[] args) {


        System.out.println("El promedio de las notas es: " + calcularPromedioNotas(4.5f, 3.8f, 4.2f));

    }


    public static float calcularPromedioNotas(float nota1, float nota2 , float nota3){
        float promedioNotas = (nota1 + nota2 + nota3) / 3;
        return promedioNotas;
    }
}
