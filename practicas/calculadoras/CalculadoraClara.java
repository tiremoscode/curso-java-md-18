package practicas.calculadoras;

public class CalculadoraClara {
    public static void main(String[] args) {
        //Los valores que haremos calculo
        
        int numero1 = 30;
        int numero2 = 40;

        //suma
        int suma = numero1 + numero2;
        System.out.println("Suma: "+suma);

        //resta
        int resta = numero2 - numero1;
        System.out.println("Resta: "+resta);

        //multiplicacion
        int multiplicacion = numero1 * numero2;
        System.out.println("Multiplicacion: "+multiplicacion);

        //division
        double division = numero2 / numero1;
        System.out.println("Division: "+division);
}

}
