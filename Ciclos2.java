import java.util.Scanner;

public class Ciclos2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // Ejemplo 1
        int contador = 0;

        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 5);

        // ejemplo 2
        // insertar moneda
        // en un arcade

        String insertoMoneda;
        do {
            System.out.println("¿Deseas continuar el juego?");
            insertoMoneda = scanner.nextLine();
        } while (insertoMoneda.equals("si"));

        scanner.close();

        // Tecer ejemplo
        // Salud de un jugador
        // de arcade

        int saludJugador = 10;
        do {
            System.out.println("Estas siedo atacado! Te quedan: " + saludJugador + " puntos");
            saludJugador -= 2;
        } while (saludJugador > 0);
        System.out.println("Game Over!!!");

    }
}