## 🚀 Pasos para ejecutar Veterinaria

1.- Ingresar a la consola de base de datos para crear nuestra tabla.

```bash
mysql -u root -p
```

2.- Crear nuestra base de datos

```sql
CREATE DATABASE veterinaria;
```

3.- Utilizar nuestra base de datos

```sql
use veterinaria;
```

4.- Crear una tabla Animales con los siguientes datos:

```sql
CREATE TABLE animales (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombreMascota VARCHAR(60),
    raza VARCHAR(60),
    servicio VARCHAR(60),
    nombrePropietario VARCHAR(60)
);
```

5.- Insertar algunos registros

```sql
INSERT INTO animales (nombreMascota, raza, servicio, nombrePropietario) VALUES
('Cobija', 'Electrico', 'Vacunas','Andrea Hernández');
```

6.- Compilar nuestra clase haciendo uso de la librería mysql-connnector.

## Windows

```bash
javac -cp "ejercicios_clase/veterinaria/lib/*;." ejercicios_clase/veterinaria/Veterinaria.java ejercicios_clase/veterinaria/Operaciones.java
```

## MacOS / Linux

```bash
javac -cp "ejercicios_clase/veterinaria/lib/*" ejercicios_clase/veterinaria/Veterinaria.java ejercicios_clase/veterinaria/Operaciones.java
```

7.- Ejecutar nuestro proyecto

## Windows

```bash
java -cp "ejercicios_clase/veterinaria/lib/*;." ejercicios_clase.veterinaria.Veterinaria
```

## MacOS / Linux

```bash
java -cp "ejercicios_clase/veterinaria/lib/*:." ejercicios_clase.veterinaria.Veterinaria
```
