## Instalación y Uso de Docker

Fuentes:

- Instalación de Docker: https://www.youtube.com/watch?v=_et7H0EQ8fY
- Instalación de WSL2: https://learn.microsoft.com/en-us/windows/wsl/install-manual

## Instrucciones

1. Construir la imagen de Docker con el siguiente comando:

```bash
docker build -t miserver-mysql-18 .
```

2.- Ejecutar un contenedor con la imagen recién construida:

```bash
docker run -d -p 3306:3306 --name mysql-server-18 miserver-mysql-18
```

3.- Validar que el contenedor haya iniciado correctamente

```bash
docker ps
```

4.- Ingresar a la consola del contenedor de MySQL.

```bash
docker exec -it mysql-server-18 bash
```

5.- Ingresar a la consola de base de datos para crear nuestra tabla.

```bash
mysql -u root -p
```

6.- Crear nuestra base de datos

```sql
CREATE DATABASE grupo18;
```

7.- Utilizar nuestra base de datos

```sql
use grupo18;
```

8.- Crear una tabla Alumnas con los siguientes datos:

```sql
CREATE TABLE alumnas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(60),
    edad int(2)
);
```

9.- Insertar algunos registros

```sql
INSERT INTO alumnas (nombre, edad) VALUES
('Ana angon', 24),
('Maricela Cruz', 26);
```

10.- Descargar previamente el MySQL-Connector desde esta [url](https://dev.mysql.com/downloads/connector/j/).

11.- Compilar nuestra clase haciendo uso de la librería.

## Windows

```bash
javac -cp "ejercicios_clase/alumnas/lib/*;." ejercicios_clase/alumnas/Grupo18.java
```

## MacOS / Linux

```bash
javac -cp "ejercicios_clase/alumnas/lib/*" ejercicios_clase/alumnas/Grupo18.java
```

12.- Ejecutar nuestro proyecto

## Windows

```bash
java -cp "ejercicios_clase/alumnas/lib/*;." ejercicios_clase.alumnas.Grupo18
```

## MacOS / Linux

```bash
java -cp "ejercicios_clase/alumnas/lib/*:." ejercicios_clase.alumnas.Grupo18
```
