package com.mycompany.clase10_ejericicio1.logica;


import com.mycompany.clase10_ejericicio1.logica.Voto;
import com.mycompany.clase10_ejericicio1.persistencia.ControladoraPersistencia;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Controladora {

    private ControladoraPersistencia controlPersis = new ControladoraPersistencia();


    // Registra un voto para el partido especificado.
    public void registrarVoto(String partidoVotado) {
        // Crear un objeto Voto con el nombre del partido y registrarlo a través de ControladoraPersistencia
        Voto voto = new Voto(partidoVotado);
        controlPersis.crearVoto(voto);
    }

    // Cuenta y agrupa los votos por partido, devolviendo un mapa con los resultados.
    public Map<String, Long> contarVotos() {
        // Obtener la lista de votos desde ControladoraPersistencia
        List<Voto> votos = controlPersis.traerVotos();

        // Realizar el conteo y agrupación de votos por nombre de partido (ignorando mayúsculas)
        return votos.stream()
                .collect(Collectors.groupingBy(voto -> voto.getNombrePartido().toUpperCase(), Collectors.counting()));
    }

}
