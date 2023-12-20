package VertebradosModels;

/*a) Crear sus clases hijas que compartan sus atributos y métodos:*/
public class Ave extends Animal {
    private int envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion,
               int envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    /*b)  Una vez creadas las clases, crear los siguientes métodos:*/
    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave.");
    }
}
