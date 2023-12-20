package RopaModels;
/*PRIMERA PARTE*/

// Clase
public class Vestimenta {
    protected int codigo;
    protected String nombre;
    protected double precio;
    protected String marca;
    protected String talla;
    protected String color;

    // Constructor
    public Vestimenta(int codigo, String nombre, double precio, String marca, String talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    // Método
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Marca: " + marca);
        System.out.println("Talla: " + talla);
        System.out.println("Color: " + color);
    }
}
