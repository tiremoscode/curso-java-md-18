import java.util.Scanner;
public class Calculadora_Andrea_hernandez {
    public static void main(String[] args) {
        int numero1;
            int numero2;
            int suma;
            int resta;
            int mult;
            int div;
            int modulo;
            Scanner teclado = new Scanner( System.in);
        System.out.println("Ingresa el primer número: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingresa el segundo número: ");
        numero2 = teclado.nextInt();
        /*
        System.out.println("El primer número es: " + numero1);
        System.out.println("El segundo número es: " + numero2);
*/

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        modulo = numero1 % numero2;

        System.out.println("El resultado de la  suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la  multiplicación es: " + mult);
        System.out.println("El resultado de la  división es: " + div);
        System.out.println("El residúo es: " + modulo);
        

    }
    
}
