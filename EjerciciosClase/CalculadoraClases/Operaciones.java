
package EjerciciosClase.CalculadoraClases;

public class Operaciones {
    double valor1;
    double valor2;

    public double sumar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double restar(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public void multiplicar(double valor1, double valor2) {
        System.out.println("Multiplicacion: " + (valor1 * valor2));
    }
}