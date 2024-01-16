package com.mycompany.clase11_ejericicio1.logica;



import com.mycompany.clase11_ejericicio1.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraEquipo {

    private ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void registrarEquipo(String nombre, String ciudad, String entrenador) {
        Equipo equipo = new Equipo(nombre, ciudad, entrenador);
        controlPersis.crearEquipo(equipo);
    }

    public List<Equipo> listarEquipos() {
        return controlPersis.traerEquipos();
    }

    public Equipo obtenerEquipoPorId(Long id) {
        return controlPersis.traerEquipoPorId(id);
    }

    public void actualizarEquipo(Equipo equipo) {
        controlPersis.actualizarEquipo(equipo);
    }

    public void eliminarEquipo(Long id) {
        controlPersis.eliminarEquipo(id);
    }
    

    public List<Equipo> obtenerEquiposPorCiudad(String ciudad) {
        return controlPersis.traerEquiposPorCiudad(ciudad);
    }

    
    public Equipo obtenerEquipoPorNombre(String nombre) {
        List<Equipo> equipos = listarEquipos();

        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombre)) {
                return equipo;
            }
        }

        return null;
    }
}
