import java.util.Scanner;

public class EdadGenero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál, es tu genero?");
        String genero = sc.nextLine();

        System.out.println("¿Cuál es tu edad?");
        int edad = sc.nextInt();

        // ahora debes poner el código necesario para realizar el ejercicio.
        // Meta
        // Hola, eres un hombre de 18 años. Eres mayor de edad.
        String generoSeleccionado;
        String mensajeEdad;
        if (edad >= 18) {
            if (genero.equals("masculino")) {
                generoSeleccionado = "un hombre";
            } else {
                generoSeleccionado = "una mujer";
            }
            mensajeEdad = "Eres mayor de edad";
        } else {
            /*
             * if (genero.equals("masculino")) {
             * generoSeleccionado = "un niño";
             * } else {
             * generoSeleccionado = "una niña";
             * }
             * mensajeEdad = "Eres menor de edad";
             */
            switch (genero) {
                case "masculino":
                    generoSeleccionado = "un niño";
                    break;
                case "femenino":
                    generoSeleccionado = "una niña";
                    break;
                default:
                    generoSeleccionado = "una persona";
                    break;
            }
            mensajeEdad = "Eres menor de edad";
        }

        System.out.println("Hola, eres " + generoSeleccionado + ". " + mensajeEdad);

    }
}