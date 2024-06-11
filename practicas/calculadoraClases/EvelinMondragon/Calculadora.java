package practicas.calculadoraClases.EvelinMondragon;

public class Calculadora {
    //metodo prcipal es la cual se debe ejecutar
    public static void main(String[] args) {

        //importar la clase  atraves de un objeto
        Operaciones operacion = new Operaciones();
        double valor1=30;
        double valor2=31;

        operacion.sumar(valor1, valor2);

        //FORMA 1 -> CREANDO UNA VARIABLE
        double resultado=valor1+valor2;
        System.out.println("RESULTADO SUMA: "+resultado);

        //FORMA2 -> mediante el metodo (es la mas limpia)
        System.out.println("SUMA: " + operacion.sumar(valor1, valor2) );
        
        //RESTA de la forma 2
        System.out.println("RESTA: " + operacion.resta(valor1, valor2));

        //MULTIPLICACION
        System.out.println("MULTIPLICACION: " + operacion.multiplicacion(valor1, valor2));

        //DIVISON
        System.out.println("DIVISON: " + operacion.division(valor1, valor2));

        //RESIDUO
        System.out.println("RESIDUO: " + operacion.residuo(valor1, valor2));
    }
}