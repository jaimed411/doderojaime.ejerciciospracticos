import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

// Clase que extiende Thread para representar un hilo
public class HiloEjemplo extends Thread {
    @Override
    public void run() {
        try {
            // Generar un número aleatorio entre 2000 y 5000 para simular una tarea variable
            int randomNum = ThreadLocalRandom.current().nextInt(2000, 5000);

            // Mensaje del hilo al inicio
            System.out.println("Hola, soy un hilo " + LocalDateTime.now());

            // Dormir el hilo durante un tiempo aleatorio
            Thread.sleep(randomNum);

            // Mensaje del hilo al final
            System.out.println("Adiós, soy un hilo " + LocalDateTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
