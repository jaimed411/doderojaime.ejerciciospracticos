package com.mycompany.clase1_ejericicio2;

import java.util.ArrayList;
import java.util.List;

public class Inventario implements Runnable {
    private List<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    // Método para agregar productos al inventario
    public void agregarProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo.");
        }

        if (producto.getNombre() == null || producto.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }

        if (producto.getPrecio() <= 0) {
            throw new IllegalArgumentException("El precio del producto debe ser mayor que cero.");
        }

        if (producto.getCantidadDisponible() < 0) {
            throw new IllegalArgumentException("La cantidad disponible del producto no puede ser negativa.");
        }

        listaProductos.add(producto);
    }

    // Método para imprimir información de todos los productos en el inventario en una línea
    public void imprimirInventario() {
        for (Producto producto : listaProductos) {
            producto.imprimirInformacion();
        }
        System.out.println();  
    }

    @Override
    public void run() {
        System.out.println("Hilo de inventario en ejecución...");
    }
}
