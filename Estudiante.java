public class Estudiante {
    // Atributo va a ser considerado de tipo privado.
    private String nombre;
    private int edad;
    private double peso;

    public Estudiante(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.setEdad(edad);
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    // Método get para obtener el atributio nombre.
    public String getNombre() {
        return nombre;
    }

    // Método set para asignar el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Método get para edad
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }
}
