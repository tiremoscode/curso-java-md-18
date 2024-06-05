package ejercicios_clase.alumnas;

import java.sql.*;

public class Grupo18 {

    // Paámetros de Conexión
    // JDBC
    // Host, URL del Servidor de Base de datos, Usuario y la Contraseña.

    private static String url = "jdbc:mysql://localhost:3306/grupo18";
    private static String usuario = "root";
    private static String password = "buttons";

    public void obtenerAlumnas() {
        String query = "SELECT * FROM alumnas ORDER BY nombre ASC";

        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            // Visualizar los resultados en consola.
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                System.out.println("* ID: " + id + " Nombre: " + nombre + " Edad: " + edad);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        // Leer todos los alumno disponiles.

        Grupo18 operacionesBD = new Grupo18();
        operacionesBD.obtenerAlumnas();
    }
}