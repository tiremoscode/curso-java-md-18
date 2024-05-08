public class Tipos {
    public static void main(String args[]) {
        // Tipos de datos
        // Tipos de datos primitivos

        // int - Entero
        // Valor decimal
        // Rango
        // 32 bits
        int edad = 18;

        // float - Flotante
        // 32 bits
        // 1.4 e-45 hasta 3.4 e38
        float pi = 3.1416f;

        // double -
        // Valor con decimal
        // 64 bits
        // Rango de datos - 4.9 e-324 a 1.8 e308

        double valorPi = 3.141592653;

        // Char - Caracter
        // Dato rango de 0 a 65535 en valor decimal, pues utiliza 16 bits.
        char letra = 'A';

        // Boolean
        // almacena un valor verdadro o falso
        // que representar rel resultado de una expresión lógica
        boolean yaDesayune = true;

        // tipos de datos de referencia
        // String
        String nombre = "Alberto";
        String email = "alberto.luebbert@jamexico.org.mx";
        String holaMundo = "¡Hola Mundo!";
        String otraCadena = "HOLA GRUPO 18";

        System.out.println("Nombre en minusculas: " + nombre);
        System.out.println("Nombre en mayusculas: " + nombre.toUpperCase());
        System.out.println("otra cadena en minusculas " + otraCadena.toLowerCase());

    }
}