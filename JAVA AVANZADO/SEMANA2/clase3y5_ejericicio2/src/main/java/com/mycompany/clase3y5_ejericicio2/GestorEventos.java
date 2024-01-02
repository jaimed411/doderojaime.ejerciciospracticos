package com.mycompany.clase3y5_ejericicio2;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;



public class GestorEventos {
    private List<Evento> eventos;

    // Constructor y métodos 

    public GestorEventos() {
        this.eventos = new ArrayList<>();
    }
    
    public List<Evento> filtrarEventosPorFecha(LocalDate fecha) {
        return eventos.stream()
                .filter(evento -> evento.getFecha().equals(fecha))
                .collect(Collectors.toList());
    }

    public Map<String, Long> contarEventosPorCategoria() {
        return eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
    }

    public Optional<Evento> encontrarEventoMasProximo() {
        return eventos.stream()
                .min((evento1, evento2) -> evento1.getFecha().compareTo(evento2.getFecha()));
    }

    public void agregarEventos(List<Evento> nuevosEventos) {
        eventos.addAll(nuevosEventos);
    }
    
    public List<Evento> filtrarEventosPorCategoria(String categoria) {
        return eventos.stream()
                .filter(evento -> evento.getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }
}
