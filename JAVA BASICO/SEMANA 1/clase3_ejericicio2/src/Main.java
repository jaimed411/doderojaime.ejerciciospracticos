public class Main {
    public static void main(String[] args) {
        // a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        Persona[] personas = new Persona[5];

        personas[0] = new Persona(1, "Joel", 25, "Paseo de Gracia", "123456789");
        personas[1] = new Persona(2, "Bea", 35, "Gran Vía", "987654321");
        personas[2] = new Persona(3, "Pedro", 28, "Carrera de San Jerónimo", "567890123");
        personas[3] = new Persona(4, "Sara", 40, "Calle Alcalá", "456789012");
        personas[4] = new Persona(5, "Meritxel", 22, "Paseo del Prado", "789012345");


        // b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            /*System.out.println("Tel: "  + persona.getNumeroTelefono());*/

        }

        // c) Cambiar el nombre de dos personas. Mostrar por pantalla antes y después del cambio.
        System.out.println("\u001B[4m\nAntes del cambio:\u001B[0m");
        System.out.println("Nombre persona 1: " + personas[0].getNombre());
        System.out.println("Nombre persona 2: " + personas[1].getNombre());

        personas[0].setNombre("Javier");
        personas[1].setNombre("Silvia");

        System.out.println("\u001B[4m\nDespués del cambio:\u001B[0m");
        System.out.println("Nombre persona 1: " + personas[0].getNombre());
        System.out.println("Nombre persona 2: " + personas[1].getNombre());


    }
}
