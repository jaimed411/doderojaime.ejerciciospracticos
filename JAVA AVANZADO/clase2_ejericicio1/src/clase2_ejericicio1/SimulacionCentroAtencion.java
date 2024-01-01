package clase2_ejericicio1;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// SimulacionCentroAtencion.java
public class SimulacionCentroAtencion {
    public static void main(String[] args) {
        // Crear una cola de llamadas compartida entre los agentes
        BlockingQueue<Llamada> colaLlamadas = new LinkedBlockingQueue<>();
        

        // Crear varios agentes de soporte (hilos)
        AgenteSoporte agente1 = new AgenteSoporte(colaLlamadas);
        AgenteSoporte agente2 = new AgenteSoporte(colaLlamadas);
        AgenteSoporte agente3 = new AgenteSoporte(colaLlamadas);
        AgenteSoporte agente4 = new AgenteSoporte(colaLlamadas);
        AgenteSoporte agente5 = new AgenteSoporte(colaLlamadas);
        AgenteSoporte agente6 = new AgenteSoporte(colaLlamadas);
        AgenteSoporte agente7 = new AgenteSoporte(colaLlamadas);
        AgenteSoporte agente8 = new AgenteSoporte(colaLlamadas);
        AgenteSoporte agente9 = new AgenteSoporte(colaLlamadas);
        AgenteSoporte agente10 = new AgenteSoporte(colaLlamadas);

        

        // Iniciar los agentes
        agente1.start();
        agente2.start();
        agente3.start();
        agente4.start();
        agente5.start();
        agente6.start();
        agente7.start();
        agente8.start();
        agente9.start();
        agente10.start();

        // Simular la llegada de llamadas con consultas variadas
        colaLlamadas.add(new Llamada("69853212", "Restablecer contraseña"));
        colaLlamadas.add(new Llamada("68742502", "Realizar seguimiento pedido"));
        colaLlamadas.add(new Llamada("63258742", "Problemas con la facturación cuenta"));
        colaLlamadas.add(new Llamada("65278452", "Ayuda general."));
        colaLlamadas.add(new Llamada("60328966", "Devoluciones"));
        colaLlamadas.add(new Llamada("68777122", "Sin acceso a cuenta en línea"));
        colaLlamadas.add(new Llamada("69852011", "Ayuda general"));
        colaLlamadas.add(new Llamada("66658962", "Cancelar mi suscripción"));
        colaLlamadas.add(new Llamada("63255568", "Horarios de atención"));
        colaLlamadas.add(new Llamada("98656333", "Problema técnico en la aplicación"));

        // Detener la atención de llamadas
        agente1.detenerAtencion();
        agente2.detenerAtencion();
        agente3.detenerAtencion();
        agente4.detenerAtencion();
        agente5.detenerAtencion();
        agente6.detenerAtencion();
        agente7.detenerAtencion();
        agente8.detenerAtencion();
        agente9.detenerAtencion();
        agente10.detenerAtencion();

        // Esperar a que los agentes finalicen
        try {
            agente1.join();
            agente2.join();
            agente3.join();
            agente4.join();
            agente5.join();
            agente6.join();
            agente7.join();
            agente8.join();
            agente9.join();
            agente10.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
