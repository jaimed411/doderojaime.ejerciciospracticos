/*
Ejercicio Nº 1 - JDBC - Individual

- Crear una aplicación para gestionar una lista de estudiantes en una base de datos.
Los estudiantes tendrán atributos como id, nombre, edad y calificación.

- El sistema debe ser capaz de permitir agregar nuevos estudiantes, recuperar la lista de todos
y mostrar su información.

- Crear una base de datos mediante MySQL llamada universidad y una tabla llamada estudiantes cuyas columnas
coincidan con los atributos de la clase estudiante.

- Utilizar JDBC (Java Database Connectivity) para interactuar con la base de datos.
*/

package com.mycompany.clase7_ejericicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class clase7_ejericicio1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\nBIENVENIDO AL PANEL DE INGRESO DE ESTUDIANTES");
                System.out.println("1. Insertar alumno");
                System.out.println("2. Mostrar todos los alumnos en la DB");
                System.out.println("3. Salir");
                System.out.print("Introduzca una opción: ");

                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            // Lógica para insertar alumno
                            Estudiante nuevoEstudianteObj = new Estudiante(0, "ana", 25, 6.8);
                            String nuevoEstudiante = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES ('" +
                                    nuevoEstudianteObj.getNombre() + "', " +
                                    nuevoEstudianteObj.getEdad() + ", " +
                                    nuevoEstudianteObj.getCalificacion() + ")";

                            int filasAfectadas = statement.executeUpdate(nuevoEstudiante);
                            if (filasAfectadas > 0) {
                                System.out.println("\nSe ha agregado un nuevo estudiante correctamente.");
                            } else {
                                System.out.println("\nNo se ha podido agregar el nuevo estudiante.");
                            }
                            break;

                        case 2:
                            // Lógica para mostrar todos los alumnos
                            ResultSet resultado = statement.executeQuery("SELECT * FROM estudiantes");
                            while (resultado.next()) {
                                int id = resultado.getInt("id");
                                String nombre = resultado.getString("nombre");
                                int edad = resultado.getInt("edad");
                                double calificacion = resultado.getDouble("calificacion");

                                Estudiante estudiante = new Estudiante(id, nombre, edad, calificacion);
                                System.out.println(estudiante.toString());
                            }
                            break;

                        case 3:
                            System.out.println("¡Hasta luego!");
                            break;

                        default:
                            System.out.println("Opción no válida. Por favor, elige una opción válida.");
                            break;
                    }
                } else {
                    System.out.println("Entrada no válida. Por favor, introduce un número.");
                    scanner.next();
                    opcion = 0;
                }

            } while (opcion != 3);

            scanner.close();

            // Cierra la conexión y recursos
            statement.close();
            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
