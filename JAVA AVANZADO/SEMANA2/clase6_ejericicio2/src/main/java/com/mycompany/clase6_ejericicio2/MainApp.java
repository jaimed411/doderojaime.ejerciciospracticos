/*
Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, 
para ello, se solicita la definición de una clase genérica Mascota<T> con atributos como nombre, 
edad, y especie (no olvides el código o id de mascota para identificar a cada una). Crea una clase 
utilitaria propia llamada RegistroMascotas que cuente con métodos genéricos para:
1. Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos 
para manipular colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al 
registro de la veterinaria (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).
2. Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections 
o Arrays junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del 
registro de mascotas.
3. Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el 
tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.
4. Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos 
aleatorios, como nombres, edades o especies, para agregar mascotas al registro.
 */

package com.mycompany.clase6_ejericicio2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroMascotas<String> registro = new RegistroMascotas<>();
        

        int opcion;
        do {
            System.out.println("........................................");
            System.out.println(".               DODEVET                .");
            System.out.println("........................................");
            System.out.println(".  1. Introducir mascota               .");
            System.out.println(".  2. Buscar mascota por nombre        .");
            System.out.println(".  3. Buscar mascota por especie       .");
            System.out.println(".  4. Cantidad de mascotas ingresadas  .");
            System.out.println(".  5. Lista de mascotas registradas    .");
            System.out.println(".  6. Salir                            .");
            System.out.println("........................................");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); 
                switch (opcion) {
                    case 1:
                        ingresarMascota(scanner, registro);
                        break;
                    case 2:
                        buscarPorNombre(scanner, registro);
                        break;
                    case 3:
                        buscarPorEspecie(scanner, registro);
                        break;
                    case 4:
                        System.out.println("Cantidad de mascotas registradas: " + registro.contarMascotasRegistradas());
                        break;
                    case 5:
                        System.out.println("Lista de mascotas registradas:");
                        System.out.println(registro);
                        break;
                    case 6:
                        System.out.println("Saliendo...Gracias!");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine(); 
                opcion = 0;
            }
        } while (opcion != 6);
        
        scanner.close();
    }

    private static void ingresarMascota(Scanner scanner, RegistroMascotas<String> registro) {
        boolean ingresarOtra;
        do {
            ingresarOtra = true;
            try {
                System.out.print("Introduzca el nombre de la mascota: ");
                String nombre = scanner.nextLine();

                // Verificar si el nombre contiene solo letras
                if (!nombre.matches("[a-zA-Z]+")) {
                    throw new InputInvalidoException("El nombre debe contener solo letras.");
                }

                System.out.print("Introduzca la especie de la mascota: ");
                String especie = scanner.nextLine();

                // Verificar si la especie contiene solo letras
                if (!especie.matches("[a-zA-Z]+")) {
                    throw new InputInvalidoException("La especie debe contener solo letras.");
                }

                System.out.print("Introduzca la edad de la mascota: ");

                // Verificar si la edad es un valor numérico
                if (!scanner.hasNextInt()) {
                    throw new InputInvalidoException("La edad debe ser un valor numérico.");
                }

                int edad = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea pendiente después de la edad

                registro.agregarMascota(new Mascota<>(0, nombre, edad, especie));
                System.out.print("Mascota guardada. ¿Ingresar otra mascota? (Si / No): ");
                ingresarOtra = scanner.nextLine().equalsIgnoreCase("Si");
            } catch (InputInvalidoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (ingresarOtra);
    }




    private static void buscarPorNombre(Scanner scanner, RegistroMascotas<String> registro) {
        do {
            try {
                System.out.print("Introduzca el nombre de la mascota a buscar: ");
                String nombreBuscar = scanner.nextLine();

                // Verificar si el nombre contiene solo letras
                if (!nombreBuscar.matches("[a-zA-Z]+")) {
                    throw new InputInvalidoException("El nombre debe contener solo letras.");
                }

                System.out.println("Mascotas encontradas por nombre: " + registro.buscarPorNombre(nombreBuscar));
                System.out.print("¿Buscar de nuevo? (Si / No): ");
                if (!scanner.nextLine().equalsIgnoreCase("Si")) {
                    break;
                }
            } catch (InputInvalidoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }


    private static void buscarPorEspecie(Scanner scanner, RegistroMascotas<String> registro) {
        do {
            try {
                System.out.print("Introduzca la especie de la mascota a buscar: ");
                String especieBuscar = scanner.nextLine();

                // Verificar si la especie contiene solo letras
                if (!especieBuscar.matches("[a-zA-Z]+")) {
                    throw new InputInvalidoException("La especie debe contener solo letras.");
                }

                System.out.println("Mascotas encontradas por especie: " + registro.buscarPorEspecie(especieBuscar));
                System.out.print("¿Buscar de nuevo? (Si / No): ");
                if (!scanner.nextLine().equalsIgnoreCase("Si")) {
                    break;
                }
            } catch (InputInvalidoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }

}
