package practicas.calculadoras;

public class CalculadoraYaretzy {
    public static void main(String args[]){
            // Los Valores que haremos calculo.

            double numero1 = 30;
            double numero2 = 40;

            // Suma
            double suma = numero1 + numero2;
            System.out.println("El resultado de la suma es: "+ suma);

            // Resta
            double resta = numero1 - numero2;
            System.out.println("El resultado de la resta es: "+ resta);
 
            // Multiplicación
            double multi = numero1 * numero2;
            System.out.println("El resultado de la multiplicación es: "+ multi);

            // División
            double div = numero1 / numero2;
            System.out.println("El resultado de la división es: "+ div);

            // Módulo
            double modulo = numero1 % numero2;
            System.out.println("El resultado del módulo es: "+ modulo);
    }
}