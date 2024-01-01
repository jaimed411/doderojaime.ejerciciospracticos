package com.mycompany.clase1_ejericicio2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Crear instancia de Inventario
        Inventario inventario = new Inventario();

        // Crear productos para agregar al inventario
        Producto producto1 = new Producto("Pelota", 8.50, 50);
        Producto producto2 = new Producto("Juguete para gato", 5.99, 30);
        Producto producto3 = new Producto("Comida para perros", 15.50, 20);
        Producto producto4 = new Producto("Rascador para gatos", 19.99, 15);
        Producto producto5 = new Producto("Acuario pequeño", 29.99, 10);

        // Crear instancias de empleados (hilos) y asignarles productos para agregar al inventario
        Runnable empleadoJaime = new Empleado("Jaime", inventario, producto1);
        Runnable empleadoDiego = new Empleado("Diego", inventario, producto2);
        Runnable empleadoBea = new Empleado("Bea", inventario, producto3);
        Runnable empleadoMarta = new Empleado("Marta", inventario, producto4);
        Runnable empleadoAngel = new Empleado("Ángel", inventario, producto5);

        // Crear hilos para cada empleado y ejecutarlos
        Thread hiloJaime = new Thread(empleadoJaime);
        Thread hiloDiego = new Thread(empleadoDiego);
        Thread hiloBea = new Thread(empleadoBea);
        Thread hiloMarta = new Thread(empleadoMarta);
        Thread hiloAngel = new Thread(empleadoAngel);

        hiloJaime.start();
        hiloDiego.start();
        hiloBea.start();
        hiloMarta.start();
        hiloAngel.start();

        // Esperar a que todos los hilos terminen
        hiloJaime.join();
        hiloDiego.join();
        hiloBea.join();
        hiloMarta.join();
        hiloAngel.join();

        // Imprimir información del inventario en el hilo principal
        System.out.println("-------------------------");
        System.out.println("STOCK INVENTARIO");
        System.out.println("-------------------------");
        inventario.imprimirInventario();

    }
}
