package notasdelogica;

public class IfSimple {

    public static void main(String[] args) {


        boolean esActivadoBotonDeCambioSemaforo = false;
        int segundosARestarParaCambio = 10;
        int duracionCambioSemaforo = 40;


        if(esActivadoBotonDeCambioSemaforo == true){

            int nuevaDuracionParaCambio = duracionCambioSemaforo - segundosARestarParaCambio;
            System.out.println("Nuevo tiempo: " + nuevaDuracionParaCambio);
        }
    }


}
