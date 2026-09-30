package notasdelogica;

public class ElseIf {


    public static void main(String[] args) {


        int puntosUsuario = 230;
        float descuentoUsuarioStandard = 0.10f;
        float descuentoUsuarioFrecuente = 0.15f;
        float descuentoUsuarioVip = 0.20f;
        double valorCompra = 300000;

        if (puntosUsuario >= 50 && puntosUsuario <= 100) {

            double descuento = valorCompra * descuentoUsuarioStandard;
            valorCompra -= descuento; // valorCompra = valorCompra - descuento

            System.out.println("puntos: " + puntosUsuario + "\n" +
                    "Descuento " + descuento + "\n" +
                    "Valor final " + valorCompra);

        } else if (puntosUsuario >= 101 && puntosUsuario <= 500) {

            double descuento = valorCompra * descuentoUsuarioFrecuente;
            valorCompra -= descuento; // valorCompra = valorCompra - descuento

            System.out.println("puntos: " + puntosUsuario + "\n" +
                    "Descuento " + descuento + "\n" +
                    "Valor final " + valorCompra);


        } else if (puntosUsuario >= 501) {

            double descuento = valorCompra * descuentoUsuarioVip;
            valorCompra -= descuento; // valorCompra = valorCompra - descuento

            System.out.println("puntos: " + puntosUsuario + "\n" +
                    "Descuento " + descuento + "\n" +
                    "Valor final " + valorCompra);


        } else {

            System.out.println("Sigue acumulando puntos");
        }


    }
}
