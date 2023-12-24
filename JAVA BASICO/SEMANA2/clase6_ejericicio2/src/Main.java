/*
Ejercicio Nº 2 - Collections - Individual (Extra/Opcional)

Un administrador de una tienda de electrónica necesita un programa para gestionar los
productos en su inventario. Para ello, necesita la creación de una clase Producto
que cuente con los siguientes datos: código, nombre, marca, tipo, precio costo,
precio venta, cantidad en stock.

A partir de esto, realizar las siguientes acciones en el programa desarrollado:
a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados
(por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).
b) Guardar estos objetos creados en un ArrayList.
c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.
d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.
e) Borrar el producto que se encuentre en la posición 5 del ArrayList.
f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto,
descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.
g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
 */


import models.Producto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados


        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto (1, "Teléfono", "Samsung", "Smartphone", 300, 500, 50));
        listaProductos.add(new Producto (2, "Laptop", "HP", "Portátil", 800, 1200, 20));
        listaProductos.add(new Producto(3, "Auriculares", "Sony", "Inalámbricos", 50, 100, 100));
        listaProductos.add(new Producto(4, "Cargador", "Anker", "USB-C", 10, 20, 200));
        listaProductos.add(new Producto(5, "Tablet", "Apple", "iPad", 400, 600, 30));
        listaProductos.add(new Producto(6, "Smartwatch", "Fitbit", "Deportivo", 80, 150, 40));
        listaProductos.add(new Producto(7, "Altavoces", "Bose", "Bluetooth", 120, 200, 15));
        listaProductos.add(new Producto(8, "Monitor", "Dell", "Curvo", 250, 400, 25));
        listaProductos.add(new Producto(9, "Teclado", "Logitech", "Inalámbrico", 30, 60, 80));
        listaProductos.add(new Producto(10, "Mouse", "Microsoft", "Gaming", 25, 50, 60));

        // b) Guardar estos objetos en un ArrayList
        // g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
        System.out.println("\u001B[4mPRODUCTOS CREADOS Y GUARDADOS EN EL INVENTARIO\u001B[0m");


        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
        System.out.println("___________________");


        // c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.
        Producto productoMayorPrecioVenta = obtenerProductoMayorPrecioVenta(listaProductos);
        System.out.println("- Producto con mayor precio de venta: " + productoMayorPrecioVenta);
        System.out.println("___________________");


        // d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.
        Producto productoMenorPrecioCosto = obtenerProductoMenorPrecioCosto(listaProductos);
        System.out.println("- Producto con menor precio de costo: " + productoMenorPrecioCosto);
        System.out.println("___________________");


        // e) Borrar el producto que se encuentra en la posición 5 del ArrayList
        // g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
        eliminarProductoEnPosicion(listaProductos, 4);
        System.out.println("Producto en la posición 5 eliminado.");

        // Imprimir la lista después de eliminar el producto en la posición 5
        System.out.println("\u001B[4mLista de productos después de eliminar el producto en la posición 5:\u001B[0m");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
        System.out.println("___________________");


        /* f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto,
        descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.*/
        // g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
        Producto productoMayorStock = obtenerProductoMayorStock(listaProductos);
        if (productoMayorStock != null) {
            System.out.println("- Producto con mayor cantidad en stock: " + productoMayorStock);

            // Imprimir el stock actual
            System.out.println("- Stock actual: " + productoMayorStock.getCantidadStock());

            // Descontar 3 unidades al producto con mayor cantidad en stock
            productoMayorStock.setCantidadStock(productoMayorStock.getCantidadStock() - 3);

            // Imprimir el stock después de descontar
            System.out.println("- Stock después de descontar 3 unidades: " + productoMayorStock.getCantidadStock());
        } else {
            System.out.println("No hay productos en el inventario.");
        }
        System.out.println("___________________");
    }

    // Método para obtener el producto con el mayor precio de venta
    private static Producto obtenerProductoMayorPrecioVenta(ArrayList<Producto> productos) {
        Producto productoMayorPrecioVenta = null;
        double maxPrecioVenta = Double.MIN_VALUE;

        for (Producto producto : productos) {
            if (producto.getPrecioVenta() > maxPrecioVenta) {
                maxPrecioVenta = producto.getPrecioVenta();
                productoMayorPrecioVenta = producto;
            }
        }

        return productoMayorPrecioVenta;
    }

    // Método para obtener el producto con el menor precio de costo
    private static Producto obtenerProductoMenorPrecioCosto(ArrayList<Producto> productos) {
        Producto productoMenorPrecioCosto = null;
        double minPrecioCosto = Double.MAX_VALUE;

        for (Producto producto : productos) {
            if (producto.getPrecioCosto() < minPrecioCosto) {
                minPrecioCosto = producto.getPrecioCosto();
                productoMenorPrecioCosto = producto;
            }
        }

        return productoMenorPrecioCosto;
    }

    // Método para eliminar un producto en una posición específica del ArrayList
    private static void eliminarProductoEnPosicion(ArrayList<Producto> productos, int posicion) {
        if (posicion >= 0 && posicion < productos.size()) {
            productos.remove(posicion);
        }
    }

    // Método para obtener el producto con la mayor cantidad en stock
    private static Producto obtenerProductoMayorStock(ArrayList<Producto> productos) {
        Producto productoMayorStock = null;
        int maxStock = Integer.MIN_VALUE;

        for (Producto producto : productos) {
            if (producto.getCantidadStock() > maxStock) {
                maxStock = producto.getCantidadStock();
                productoMayorStock = producto;
            }
        }

        return productoMayorStock;
    }
}

