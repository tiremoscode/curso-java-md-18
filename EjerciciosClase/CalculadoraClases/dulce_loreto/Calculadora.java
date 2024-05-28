package EjerciciosClase.CalculadoraClases.dulce_loreto;

public class Calculadora {
    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();

        double valor1 = 35;
        double valor2 = 50;


        //Forma 1 Suma
        double suma = operacion.sumar(valor1, valor2);
        System.out.println("Suma ejemplo 1: " + suma);
        //Forma 2 Suma
        System.out.println("Suma ejemplo 2: " + operacion.sumar(valor1, valor2));

        //Resta
        System.out.println("Resta  " + operacion.restar(valor1, valor2));

        //Multiplicación
        operacion.multiplicar(valor1, valor2);
        System.out.println("Multiplicar " + operacion.multiplicar(valor1, valor2));
      

        //División
        operacion.dividir (valor1,valor2);
        System.out.println("Division" + operacion.dividir(valor1, valor2));
        
    }
    
}
