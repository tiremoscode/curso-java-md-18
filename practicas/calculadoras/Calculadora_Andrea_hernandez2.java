import java.util.Scanner;
public class Calculadora_Andrea_hernandez2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float numero1, numero2, suma, resta, mult, div, resto;
        System.out.print("Digite el primero número: ");
        numero1 = entrada.nextFloat();
        System.err.println("Digite el segundo número: ");
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("La suma es:" + suma);
        System.out.println("La resta es:" + resta);
        System.out.println("La multiplicacion es:"+mult);
        System.out.println("La division es:"+ div);
        System.out.println("El resto es:"+ resto);
    }
    
}
