package clase2_complementario2;


public class HiloContador extends Thread{
    
    private int id;
    private Counter counter;
    private int n;

    public HiloContador(int id, int n, Counter counter) {
        this.id = id;
        this.counter = counter;
        this.n = n;
    }
    
    public void run(){
        if(this.counter.isSincronizado()){
            this.counter.mostrarNumerosSincronizado(id, n);
        } else{
            this.counter.mostrarNumerosNoSincronizado(id, n);
        }
    }
}
