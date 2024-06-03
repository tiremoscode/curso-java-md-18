package linz_melchor;


public class Calculadora {
    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();

        double valor1 = 30;
        double valor2 = 31;
       
         // Suma Forma1
         double suma = operacion.sumar(valor1, valor2);
         System.out.println("Suma Forma 1: " + suma);
 
         // Suma Forma 2
         System.out.println("Suma Forma 2: " + operacion.sumar(valor1, valor2));
 
         // Resta Forma 1
         double resta = operacion.restar(valor1, valor2);
         System.out.println("Resta Forma 1: " + resta);


         //Resta Forma 2
         System.out.println("Resta Forma 2" + operacion.restar(valor1, valor2));

         //Multiplicación Forma 1
         double multiplicacion = operacion.multiplicar(valor1, valor2);
         System.out.println("Multiplicación Forma 1: " + multiplicacion);

         //Multilicación Forma 2
         System.out.println("Multiplicación Forma 2: " + operacion.multiplicar(valor1, valor2));

         //División Forma 1
         double division = operacion.dividir(valor1, valor2);
         System.out.println("División Forma 1: " + division);

         //División Forma 2
         System.out.println("Divisón Forma 2: " + operacion.dividir(valor1, valor2));

         //Residuo Forma 1
         double residuo = operacion.residuo(valor1, valor2);
         System.out.println("Residuo Forma 1: " + residuo);

         //Residuo Forma 2
         System.out.println("Residuo Forma 2: " + operacion.dividir(valor1, valor2));
    }


}
