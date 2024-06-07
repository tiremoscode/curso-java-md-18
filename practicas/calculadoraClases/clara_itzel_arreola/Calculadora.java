package practicas.calculadoraClases.clara_itzel_arreola;

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
        System.out.println("Resta: " + operacion.restar(valor1, valor2));

        // multiplicacion forma 2 
        System.out.println("multiplicacion: " + operacion.multiplicar(valor1, valor2));

        // divicion forma 2
        System.out.println("division: " + operacion.dividir(valor1, valor2));

        //residuo forma 2
        System.out.println("residuo: " + operacion.residuo(valor1, valor2));

    }
}
