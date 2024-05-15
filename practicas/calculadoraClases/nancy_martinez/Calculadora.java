package practicas.calculadoraClases.nancy_martinez;

public class Calculadora {
    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();

        double valor1 = 30;
        double valor2 = 31;

        // Forma1 suma
        double suma = operacion.sumar(valor1, valor2);
        System.out.println("Suma Ejemplo 1: " + suma);

        // Forma 2 suma
        System.out.println("Suma Ejemplo 2: " + operacion.sumar(valor1, valor2));

        //Forma1 resta
        double resta=operacion.restar(valor1,valor2);
        System.out.println("Resta 1:"+resta);

        // Forma 2 resta
        System.out.println("Resta 2: " + operacion.restar(valor1, valor2));

        // Forma 1 multiplicacion
        double multiplicacion=operacion.multiplicar(valor1,valor2);
        System.out.println("Multiplicacion 1:"+multiplicacion);
        //Forma 2 multiplicacion
        System.out.println("Multiplicacion 2:"+operacion.multiplicar(valor1,valor2));

        //Forma 1 division
        double division=operacion.dividir(valor1,valor2);
        System.out.println("Division1:"+division);
        //Forma 2 division
        System.out.println("Division 2:"+operacion.dividir(valor1,valor2));

        //Forma 1 residuo
        double residuo=operacion.residuo(valor1,valor2);
        System.out.println("Residuo 1:"+residuo);
        //Forma 2 residuo
        System.out.println("Residuo 2:"+operacion.residuo(valor1,valor2));
    }
}
