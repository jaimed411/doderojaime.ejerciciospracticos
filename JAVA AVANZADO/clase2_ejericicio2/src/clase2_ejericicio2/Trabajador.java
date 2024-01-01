package clase2_ejericicio2;


import java.util.concurrent.ThreadLocalRandom;

// Clase trabajador-hilo
class Trabajador implements Runnable {
    private String nombre;
    private String tarea;

    // Constructor trabajador 
    public Trabajador(String nombre, String tarea) {
        this.nombre = nombre;
        this.tarea = tarea;
    }

    // Método nombre del trabajador
    public String getNombre() {
        return nombre;
    }

    // Método principal 
    @Override
    public void run() {
        System.out.println(nombre + " inició la tarea de " + tarea);

        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));
        } catch (InterruptedException e) {
            e.printStackTrace(); // Imprimir detalles de la interrupción en caso de error
        }

        System.out.println(nombre + " completó la tarea de " + tarea);
    }
    
    // Nuevo método para obtener la tarea del trabajador
    public String getTarea() {
        return tarea;
    }

}
