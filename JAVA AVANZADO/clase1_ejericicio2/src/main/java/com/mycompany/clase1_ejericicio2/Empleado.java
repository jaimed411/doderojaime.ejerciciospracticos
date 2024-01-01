package com.mycompany.clase1_ejericicio2;

public class Empleado implements Runnable {
    private String nombre;
    private Inventario inventario;
    private Producto producto;

    public Empleado(String nombre, Inventario inventario, Producto producto) {
        this.nombre = nombre;
        this.inventario = inventario;
        this.producto = producto;
    }

    @Override
    public void run() {
        try {
            System.out.println(nombre + " se ha conectado.");
            System.out.println(nombre + " está agregando el siguiente producto al inventario: ");
            producto.imprimirInformacion();
            System.out.println();
            if (inventario == null) {
                throw new ConexionException("Error al conectar el hilo. Inventario no inicializado.");
            }
            inventario.agregarProducto(producto);
            System.out.println(nombre + " ha completado la tarea.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println(nombre + " se ha desconectado.");
        }
}




}
