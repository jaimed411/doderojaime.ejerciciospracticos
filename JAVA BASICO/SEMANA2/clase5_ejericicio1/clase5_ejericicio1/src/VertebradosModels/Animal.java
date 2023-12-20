/*primera parte*/

package VertebradosModels;

public class Animal {
    protected int id;
    protected String nombre;
    protected int edad;
    protected String tipoPiel;
    protected String tipoAlimentacion;

    public Animal(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void saludar() {
        System.out.println("Hola, soy un animal.");
    }
}
