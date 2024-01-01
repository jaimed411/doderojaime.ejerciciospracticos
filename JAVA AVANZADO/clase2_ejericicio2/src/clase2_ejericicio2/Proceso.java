package clase2_ejericicio2;

public class Proceso {
    public static void main(String[] args) {
        System.out.println("PROCESO BICICLETA");
        System.out.println(".................");

        // Instancias trabajadores
        Trabajador lijador = new Trabajador("Lijador", "lijado");
        Trabajador pintor = new Trabajador("Pintor", "pintura");
        Trabajador barnizador = new Trabajador("Barnizador", "barnizado");
        Trabajador montador = new Trabajador("Montador", "montaje");
        Trabajador controlCalidad = new Trabajador("Control de Calidad", "proceso de calidad");
        Trabajador ensamblador = new Trabajador("Ensamblador", "ensamblaje");
        Trabajador trabajadorEnvio = new Trabajador("Logística", "envío");

        // Variables para medir el tiempo total del proceso
        long tiempoInicio = System.currentTimeMillis();

        try {
            // Instancias de hilos
            Thread hiloLijador = new Thread(lijador);
            Thread hiloPintor = new Thread(pintor);
            Thread hiloBarnizador = new Thread(barnizador);
            Thread hiloMontador = new Thread(montador);
            Thread hiloControlCalidad = new Thread(controlCalidad);
            Thread hiloEnsamblador = new Thread(ensamblador);
            Thread hiloTrabajadorEnvio = new Thread(trabajadorEnvio);

            // Iniciar hilos en orden
            medirTiempo(hiloLijador, lijador);
            System.out.println("___");
            medirTiempo(hiloPintor, pintor);
            System.out.println("___");
            medirTiempo(hiloBarnizador, barnizador);
            System.out.println("___");
            medirTiempo(hiloMontador, montador);
            System.out.println("___");
            medirTiempo(hiloControlCalidad, controlCalidad);
            System.out.println("___");
            medirTiempo(hiloEnsamblador, ensamblador);
            System.out.println("___");
            medirTiempo(hiloTrabajadorEnvio, trabajadorEnvio);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Calcular tiempo total del proceso
        long tiempoTotal = System.currentTimeMillis() - tiempoInicio;

        // Mensaje después de que todos los procesos han terminado
        System.out.println("  ______________________  ");
        System.out.println("BICICLETA CREADA Y ENVIADA A SU DESTINO");
        System.out.println("Tiempo total del proceso: " + tiempoTotal + " milisegundos");
    }

    // Método para medir el tiempo de ejecución de un hilo
    private static void medirTiempo(Thread hilo, Trabajador trabajador) throws InterruptedException {
    long tiempoInicio = System.currentTimeMillis();
    hilo.start();
    hilo.join();
    long tiempoFin = System.currentTimeMillis();
    long tiempoEjecucion = tiempoFin - tiempoInicio;
    System.out.println(trabajador.getNombre() + " tardó " + tiempoEjecucion + " milisegundos en " + trabajador.getTarea());
    }

}