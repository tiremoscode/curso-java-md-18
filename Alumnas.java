public class Alumnas {
    private String nombre;
    private String apellido;

    // Constructor
    public Alumnas(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }
}
