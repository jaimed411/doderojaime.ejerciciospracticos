package RopaModels;

//a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
public class Zapato extends Vestimenta {
    private String material;
    private String tipoCierre;

    // Constructor
    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color,
                  String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    /* c) Crear los siguientes métodos (en cada subclase correspondiente):
    Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).*/
    public void mostrarMensaje() {
        System.out.println("Estos zapatos son de marca: " + marca);
    }
}