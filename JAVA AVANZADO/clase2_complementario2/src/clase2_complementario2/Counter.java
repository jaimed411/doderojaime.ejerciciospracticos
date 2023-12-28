package clase2_complementario2;


public class Counter {
    
    private boolean sincronizado;
    
    public Counter (boolean sincronizado) {
        this.sincronizado = sincronizado;
    }
    
    public boolean isSincronizado() {
        return sincronizado;
    }
    
    public synchronized void mostrarNumerosSincronizado ( int id, int n) {
        System.out.println("INICIO HILO " + id);
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("FIN HILO " + id);
    }
    
    
    public void mostrarNumerosNoSincronizado ( int id, int n) {
        System.out.println("INICIO HILO " + id);
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("FIN HILO " + id);
    }
    
}
