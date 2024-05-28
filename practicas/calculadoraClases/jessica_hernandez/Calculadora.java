package practicas.calculadoraClases.jessica_hernandez;

public class Calculadora {
    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();

        double valor1 = 30;
        double valor2 = 31;

        // Forma 1 suma y 2 suma
        double suma = operacion.sumar(valor1, valor2);
        System.out.println("Suma Ejemplo 1: " + suma);

        
        System.out.println("Suma Ejemplo 2: " + operacion.sumar(valor1, valor2));

        //Forma1 resta y 2 resta
        double resta=operacion.restar(valor1,valor2);
        System.out.println("Resta 1:"+resta);

        
        System.out.println("Resta 2: " + operacion.restar(valor1, valor2));

        // Forma 1 multiplicacion y 2 multiplicacion
        double multiplicacion=operacion.multiplicar(valor1,valor2);
        System.out.println("Multiplicacion 1:"+multiplicacion);
        
        System.out.println("Multiplicacion 2:"+operacion.multiplicar(valor1,valor2));

        //Forma 1 division y 2 division
        double division=operacion.dividir(valor1,valor2);
        System.out.println("Division1:"+division);
        
        System.out.println("Division 2:"+operacion.dividir(valor1,valor2));

        //Forma 1 residuo y 2 residuo
        double residuo=operacion.residuo(valor1,valor2);
        System.out.println("Residuo 1:"+residuo);
        
        System.out.println("Residuo 2:"+operacion.residuo(valor1,valor2));
    }
}
