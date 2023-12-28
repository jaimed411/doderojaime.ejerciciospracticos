import java.time.LocalDateTime;

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        // Mensaje del hilo principal al inicio
        System.out.println("Hola, soy el hilo principal " + LocalDateTime.now());

        // Crear e iniciar un hilo utilizando la clase que extiende Thread (HiloEjemplo)
        HiloEjemplo hiloEjemplo = new HiloEjemplo();
        hiloEjemplo.start();

        // Crear e iniciar un hilo utilizando la interfaz Runnable (EjecutableEjemplo)
        EjecutableEjemplo ejecutableEjemplo = new EjecutableEjemplo();
        Thread thread = new Thread(ejecutableEjemplo);
        thread.start();

        // Mensaje del hilo principal al final
        System.out.println("Adiós, soy el hilo principal " + LocalDateTime.now());
    }
}
