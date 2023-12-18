public class Vectores {
    // Método para recorrer y cargar datos en el vector
    public static String[] cargarNombres() {
        String vector[] = new String[4];

        vector[0] = "Alejandra";
        vector[1] = "Ludmila";
        vector[2] = "Gabriel";
        vector[3] = "Rosa";

        return vector;
    }

    // Método para recorrer y mostrar los datos del vector
    public static void mostrarNombres(String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("En la posición " + i + " está el nombre de " + vector[i]);
        }
    }
}

