package clase2_complementario2;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        try {
            boolean sincronizado = true;

            Counter c = new Counter(sincronizado);

            HiloContador h1 = new HiloContador(1, 500, c);
            HiloContador h2 = new HiloContador(2, 100, c);

            h1.start();
            h2.start();

            try {
                h1.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

            h2.join();
            System.out.println("FIN PROGRAMA");

            // Agregar la fecha y hora actual al finalizar el programa
            LocalDateTime fechaYHoraActual = LocalDateTime.now();
            System.out.println("Fecha y hora de finalización del programa: " + fechaYHoraActual);

        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
