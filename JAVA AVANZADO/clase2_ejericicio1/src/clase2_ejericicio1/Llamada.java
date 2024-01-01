package clase2_ejericicio1;


public class Llamada {
    private String cliente;
    private String consulta;

    public Llamada(String cliente, String consulta) {
        this.cliente = cliente;
        this.consulta = consulta;
    }

    public String getCliente() {
        return cliente;
    }

    public String getConsulta() {
        return consulta;
    }

    // Getters adicionales
    public String getInfoLlamada() {
        return "Cliente: " + cliente + ", Consulta: " + consulta;
    }

    // Puedes agregar más getters y setters según sea necesario
}
