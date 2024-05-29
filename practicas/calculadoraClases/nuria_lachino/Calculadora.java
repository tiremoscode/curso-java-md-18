package practicas.calculadoraClases.nuria_lachino;

public class Calculadora {

    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();

        double valor1 = 30;
        double valor2 = 31;

        // Forma1
        double suma = operacion.sumar(valor1, valor2);
        System.out.println("Suma Ejemplo 1 :" + suma);

        // Forma 2
        System.out.println("Suma Ejemplo 2 :" + operacion.sumar(valor1, valor2));

        // Resta
        System.out.println("Resta Ejemplo 2 :" + operacion.restar(valor2, valor1));

        double restar = operacion.restar(valor2, valor1);
        System.out.println("Resta Ejemplo 1: " + restar);

        //Multiplicar
        System.out.println("Multiplicacion Ejemplo 2:" + operacion.multiplicar(valor1, valor2));
        
        double multiplicar = operacion.multiplicar(valor1, valor2);
        System.out.println("Multiplicar Ejemplo 1: " + multiplicar);

        //Division
        System.out.println("Division Ejemplo 2: " + operacion.dividir(valor2, valor1));

        double dividir = operacion.dividir(valor2, valor1);
        System.out.println("Division Ejemplo 1: " + dividir);

        //Residuo
        System.out.println("Residuo Ejemplo 2: " + operacion.residuo(valor1, valor2));

        double residuo = operacion.residuo(valor1, valor2);
        System.out.println("Residuo Ejemplo 1: " + residuo);

    }
}