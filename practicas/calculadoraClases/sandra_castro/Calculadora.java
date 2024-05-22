package practicas.calculadoraClases.sandra_castro;

public class Calculadora {

    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();

        double valor1 = 30;
        double valor2 = 31;

        // Suma forma1
        double suma = operacion.sumar(valor1, valor2);
        System.out.println("Suma Ejemplo 1: " + suma);

        // Suma forma 2
        System.out.println("Suma Ejemplo 2: " + operacion.sumar(valor1, valor2));

        // Resta
        System.out.println("Resta" + operacion.restar(valor1, valor2));

        // Division
        System.out.println("Division" + operacion.dividir(valor1, valor2));

        // Multipliacion
        System.out.println("Multiplicar" + operacion.multiplicar(valor1, valor2));

        // Residuo
        System.out.println("Porcentaje" + operacion.porcentaje(valor1, valor2));
    }
}