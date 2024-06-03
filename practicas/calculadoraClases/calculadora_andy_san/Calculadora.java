package practicas.calculadoraClases.calculadora_andy_san;

public class Calculadora {

    public static void main(String[] args) {
        Operacionn operacion = new Operacionn();

        double valor1 = 30;
        double valor2 = 31;

        
        double suma = operacion.sumar(valor1, valor2);
        System.out.println("El resultado de la suma es: " + suma);
        double resta = operacion.restar(valor1, valor2);
        System.out.println("El resultado de la resta" + resta);
        double multiplicacion = operacion.multiplicar(valor1, valor2);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        double division = operacion.dividir(valor1, valor2);
        System.out.println("El resultado de la division es:" + division);
        double resir = operacion.residuo(valor1, valor2);
        System.out.println("El resultado del residuo es: " + resir);
}
}