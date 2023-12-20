package VertebradosModels;

/*a) Crear sus clases hijas que compartan sus atributos y métodos:*/
public class Reptil extends Animal {
    private double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion,
                  double longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    /*b)  Una vez creadas las clases, crear los siguientes métodos:*/
    @Override
    public void saludar() {
        System.out.println("Hola, soy un reptil." + " Mido " + longitud + " metros y habito en " + habitat + "." +
                " Tengo " + tipoEscamas + " y un " + tipoVeneno);
    }
}
