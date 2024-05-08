package practicas.calculadoras.Maricela_Cruz;

public class calculadora {
    public static void main(String[] args) {
        operaciones operacion = new operaciones();

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
        
        //Dividir
        operacion.dividir(valor1,valor2);

        //Residuo
        operacion.residuo(valor1,valor2);
    }
}
