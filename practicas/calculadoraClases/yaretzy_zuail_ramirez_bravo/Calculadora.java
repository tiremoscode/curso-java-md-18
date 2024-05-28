public class Calculadora{
    public static void main(String[] args) {
        Operaciones operacion = new Operaciones();
        
        double valor1 = 30;
        double valor2 = 31;
    
        //Suma
        System.out.println("Suma:"+ operacion.sumar(valor1, valor2));
    
        //Resta
        System.out.println("Resta:"+ operacion.restar(valor1, valor2));

        //Multiplicación
        System.out.println("Multiplicación: "+ operacion.multiplicar(valor1, valor2));
        
        //División
        System.out.println("División: "+ operacion.dividir(valor1, valor2));

    }
}