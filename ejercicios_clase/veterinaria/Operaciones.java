package ejercicios_clase.veterinaria;

import java.sql.*;

class Operaciones {
    // Un CRUD
    // Create - Alta nuevas mascotas
    // Read - Lectura de Mascotas
    // Update - Actualizar información de una mascota
    // Delete - Eliminar mascotas

    // JDBC - Java Database Connectivity
    // SQL - Structured Query Language
    private static String url = "jdbc:mysql://localhost:3306/veterinaria";
    private static String usuario = "root";
    private static String password = "buttons";

    public void obtenerMascotas() {
        String query = "SELECT * FROM animales";

        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombreMascota = resultSet.getString("nombreMascota");
                String raza = resultSet.getString("raza");
                String nombrePropietario = resultSet.getString("nombrePropietario");
                String servicio = resultSet.getString("servicio");
                System.out.println("ID: " + id + " Nombre Mascota: " + nombreMascota + " Raza: " + raza
                        + " Nombre Propietario: " + nombrePropietario + " Servicio: " + servicio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void guardarMascota(String nombreMascota, String raza, String nombrePropietario, String servicio) {
        String query = "INSERT INTO animales (nombreMascota, raza, nombrePropietario, servicio) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, nombreMascota);
            preparedStatement.setString(2, raza);
            preparedStatement.setString(3, nombrePropietario);
            preparedStatement.setString(4, servicio);
            int registrosInsertados = preparedStatement.executeUpdate();
            System.out.println("Registros insertados: " + registrosInsertados);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarMascota(int id, String nombreMascota, String raza, String nombrePropietario,
            String servicio) {
        String queryActualizar = "UPDATE animales SET nombreMascota = ?, raza = ?, nombrePropietario = ?, servicio = ? WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryActualizar)) {
            preparedStatement.setString(1, nombreMascota);
            preparedStatement.setString(2, raza);
            preparedStatement.setString(3, nombrePropietario);
            preparedStatement.setString(4, servicio);
            preparedStatement.setInt(5, id);
            int registrosActualizados = preparedStatement.executeUpdate();
            System.out.println("Registros actualizados: " + registrosActualizados);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarMascota(int id) {
        String queryEliminar = "DELETE FROM animales WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryEliminar)) {
            preparedStatement.setInt(1, id);
            int registrosEliminados = preparedStatement.executeUpdate();
            System.out.println("Registros eliminados: " + registrosEliminados);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buscarMascota(int id) {
        String queryBuscar = "SELECT * FROM animales WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(url, usuario, password);
                PreparedStatement preparedStatement = connection.prepareStatement(queryBuscar)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idMascota = resultSet.getInt("id");
                String nombreMascota = resultSet.getString("nombreMascota");
                String raza = resultSet.getString("raza");
                String nombrePropietario = resultSet.getString("nombrePropietario");
                String servicio = resultSet.getString("servicio");
                System.out.println("ID: " + idMascota + " Nombre Mascota: " + nombreMascota + " Raza: " + raza
                        + " Nombre Propietario: " + nombrePropietario + " Servicio: " + servicio);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}