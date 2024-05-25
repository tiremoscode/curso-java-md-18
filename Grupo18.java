public class Grupo18 {
    public static void main(String args[]) {
        // IKmplementar la clase Estudiante
        // a través de un objeto.

        Estudiante alumna = new Estudiante("Ana", 20, 105.20);

        // Obtener y mostrar los valores de edad y nomre usando los métodos get.
        System.out.println("Nombre: " + alumna.getNombre());
        System.out.println("Edad: " + alumna.getEdad());
        System.out.println("Peso "+alumna.getPeso());

        // Utilizaremos método set
        // Para cambiar el valor de nombre y la edad
        alumna.setNombre("Gloria");
        alumna.setEdad(25);

        // Mostrar los valores de la
        // alumnna actualizada
        System.out.println("Nombre actualizada: " + alumna.getNombre());
        System.out.println("Edad actualizada: " + alumna.getEdad());
    }
}