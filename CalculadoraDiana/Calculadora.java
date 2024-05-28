package CalculadoraDiana;

public class Calculadora {
   public static void main(String[] args) {
    Operaciones oper = new Operaciones();
    double valor1 = 45; 
    double valor2 = 26;

    oper.sumar(valor1, valor2);
    System.out.println("La suma es:" + oper.sumar(valor1, valor2));
    System.out.println("Resta: " + oper.restar(valor1, valor2));
    System.out.println("Multiplicación: " + oper.multiplicar(valor1, valor2));
    System.out.println("Divición: " + oper.divicion(valor1, valor2));
   } 

   
}
