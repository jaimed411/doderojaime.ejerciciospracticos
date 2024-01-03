package com.mycompany.clase6_ejericicio1;



import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> extends ArrayList<T> {

    // Método para agregar autos al inventario
    public void agregarAuto(T auto) {
        this.add(auto);
    }

    // Método para buscar autos por marca
    public List<T> buscarPorMarca(String marca) {
        List<T> autosEncontrados = new ArrayList<>();
        for (T auto : this) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    // Método para buscar autos por año
    public List<T> buscarPorAño(int año) {
        List<T> autosEncontrados = new ArrayList<>();
        for (T auto : this) {
            if (auto.getAño() == año) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    // Método para calcular el valor total del inventario
    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (T auto : this) {
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }
}