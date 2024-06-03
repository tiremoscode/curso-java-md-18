public class Cinema {
    public static void main(String args[]) {
        // Iremos al cine.
        // Vivir en CDMX
        // Pelicula - Intensamente 2
        // Llevemos dinero
        // Fecha - 2 de Junio

        boolean vivimosCDMX = true;
        boolean peliculaDisponible = true;
        boolean hayDineritoDulceria = true;
        boolean puedo2Junio = false;

        if (vivimosCDMX == true) {
            if (peliculaDisponible == true) {
                if (hayDineritoDulceria == true) {
                    if (puedo2Junio == true) {
                        System.out.println("Vamos a ver Intensamente 2");
                    } else {
                        System.out.println("No podemos ir, ese día hay votaciones");
                    }
                } else {
                    System.out.println("Metemos tortas de contrabando");
                }
            } else {
                System.out.println("Vemos Garfield");
            }
        } else {
            System.out.println("No podemos ir al cine porque no vivimos en CDMX");
        }
    }
}
