package RopaModels;

//a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
public class Camiseta extends Vestimenta {
    private String manga;
    private String cuello;

    // Constructor
    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color,
                    String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    /* c) Crear los siguientes métodos (en cada subclase correspondiente):
    Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).*/
    public void mostrarMensaje() {
        System.out.println("Esta camiseta es de manga: " + manga + " y un precio de: " + precio);

    }
}