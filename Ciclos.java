public class Ciclos{
    public static void main(String[] args) {
        // for
        // es una estructura de control que repite
        // un bloque de código un número determinado de veces

        for (int j = 0; j <= 200; j++){
            System.out.println(j+ ".- No debo hablar en clase");
        }

        // While
        // Estructura de control que permite reperir un bloque
        // de código mientras una condición especificada sea verdadera

        // Variable de inicio
        int x = 1;
        while (x <= 5){
            System.out.println(x);
            x++;
        }

        // Do While
        // Nos va a permitir ejecutarun bloque de código al menos una vez
        // y después mientras una condición del código se mantenga verdadera.

        int numero = 10;
        do {
            System.out.println(numero);
            numero++;
        } while (numero <=15);

        // Arreglo de Alumnas del Grupo numero 18
        Alumnas[] alumnas = new Alumnas[3];

        // Crear valores de los alumnos.
        alumnas[0] = new Alumnas("Nancy", "Martinez");
        alumnas[1] = new Alumnas("Andrea", "Hernandez");
        alumnas[2] = new Alumnas("Dulce", "hernandez");

        for (int al = 0; al < alumnas.length; al++){
            System.out.println(alumnas[al].getNombre() + " " + alumnas[al].getApellido());
        }


    }
}