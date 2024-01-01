package clase2_ejericicio1;


import java.util.concurrent.BlockingQueue;
import java.util.ArrayList;
import java.util.List;

public class AgenteSoporte extends Thread {
    private BlockingQueue<Llamada> colaLlamadas;
    private List<String> informeLlamadasAtendidas;
    private volatile boolean continuarAtendiendo;  // Variable para indicar si debe continuar atendiendo llamadas

    public AgenteSoporte(BlockingQueue<Llamada> colaLlamadas) {
        this.colaLlamadas = colaLlamadas;
        this.informeLlamadasAtendidas = new ArrayList<>();
        this.continuarAtendiendo = true;  // Inicializar como true
    }

    @Override
    public void run() {
        while (continuarAtendiendo) {  // Verificar si debe continuar atendiendo
            try {
                // Esperar y obtener una llamada de la cola
                Llamada llamada = colaLlamadas.take();
                atenderLlamada(llamada);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void atenderLlamada(Llamada llamada) {
        // Simular el proceso de atención a la llamada
        System.out.println("Atendiendo llamada de " + llamada.getCliente() + ": " + llamada.getConsulta());

        // Simular el tiempo de procesamiento
        try {
            Thread.sleep(3000); // 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Registro de la llamada
        System.out.println("Llamada de " + llamada.getCliente() + " atendida. Consulta resuelta.");

        // Agregar información al informe
        informeLlamadasAtendidas.add(llamada.getInfoLlamada() + " - Consulta resuelta");

        // Registrar información adicional
        registrarInformacion(llamada);
        
        // Devolver la llamada a la cola para ser atendida por otro agente
        devolverLlamada(llamada);
    }

    private void registrarInformacion(Llamada llamada) {
        // Simular el proceso de registro de información
        System.out.println("Registrando información de la llamada de " + llamada.getCliente());

        // Simular el tiempo de procesamiento para el registro de información
        try {
            Thread.sleep(2000); // 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Informar que la información ha sido registrada
        System.out.println("Información de la llamada de " + llamada.getCliente() + " registrada.");
    }
    
    private void devolverLlamada(Llamada llamada) {
        try {
            // Devolver la llamada a la cola para ser atendida por otro agente
            colaLlamadas.put(llamada);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void detenerAtencion() {
        continuarAtendiendo = false;  // Detener la atención de llamadas

        // Esperar a que se procesen todas las llamadas pendientes
        try {
            join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void generarInforme() {
        // Mostrar el informe con la información de las llamadas atendidas
        System.out.println("Informe de llamadas atendidas:");
        for (String infoLlamada : informeLlamadasAtendidas) {
            System.out.println(infoLlamada);
        }
    }
}
