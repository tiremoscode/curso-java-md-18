package practicas.calculadoraClases.fabiola_hernandez;

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

        //multilplicacion
        System.out.println("multiplicacion" + operacion.multiplicacion(valor1, valor2));

        //division
        System.out.println("division" + operacion.division(valor1, valor2));
    }
}