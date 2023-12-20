package RopaModels;

//a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
public class Pantalon extends Vestimenta {
    private String estilo;
    private String tipoTejido;

    // Constructor
    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color,
                  String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    /* c) Crear los siguientes métodos (en cada subclase correspondiente):
    Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).*/
    public void mostrarMensaje() {
        System.out.println("Estos pantalones son de estilo: " + estilo);
    }
}