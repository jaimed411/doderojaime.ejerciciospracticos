import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

// Clase que implementa Runnable para representar un ejecutable (hilo)
public class EjecutableEjemplo implements Runnable {
    @Override
    public void run() {
        try {
            // Generar un número aleatorio entre 2000 y 5000 para simular una tarea variable
            int randomNum = ThreadLocalRandom.current().nextInt(2000, 5000);

            // Mensaje del ejecutable (hilo) al inicio
            System.out.println("Hola, soy un ejecutable " + LocalDateTime.now());

            // Dormir el ejecutable (hilo) durante un tiempo aleatorio
            Thread.sleep(randomNum);

            // Mensaje del ejecutable (hilo) al final
            System.out.println("Adiós, soy un ejecutable " + LocalDateTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
