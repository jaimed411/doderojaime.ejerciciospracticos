public class Persona {
    // Atributos
    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private String numeroTelefono;

    // Constructor con parámetros
    public Persona(int id, String nombre, int edad, String direccion, String numeroTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
