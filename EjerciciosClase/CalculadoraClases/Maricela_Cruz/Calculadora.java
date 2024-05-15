package EjerciciosClase.CalculadoraClases.Maricela_Cruz;

public class Calculadora {
    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();

        double valor1 = 30;
        double valor2 = 31;

        // Forma1
        double suma = operacion.sumar(valor1, valor2);
        System.out.println("Suma Ejemplo 1: " + suma);

        // Forma 2
        System.out.println("Suma Ejemplo 2: " + operacion.sumar(valor1, valor2));

        // Resta
        System.out.println("Resta " + operacion.restar(valor1, valor2));

        // Multiplicar
        operacion.multiplicar(valor1, valor2);
    }

    
}
