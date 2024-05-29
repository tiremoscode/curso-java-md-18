class Persona {


    // Notas para el uso de Constructores.
    // Definir un constructor es recomendable cuando:
    // - Necesitas Inicializar propiedades obligatorias
    // - Queremos evitar estados inválidos.

    // No usar un constructor cuando.
    // Mi clase tiene solo métodos estáticos
    // Tu clase es una entidad sumple con propiedades o valores predeterminados

    // Propiedades de esta clase
    public String nombre;
    public int edad;

    // Método constructor
    // public Persona(String nombre, int edad) {
    // this.nombre = nombre;
    // this.edad = edad;
    // }

    // Un primer método de la clase
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}

public class Constructores {
    public static void main(String args[]) {
        // Crear un objeto de la clase Persona.
        Persona andrea = new Persona();

        // Establecemos propiedades del objeto.
        andrea.nombre = "Andrea";
        andrea.edad = 30;

        // Llamo al método saludar del objeto andrea
        andrea.saludar();
    }
}
