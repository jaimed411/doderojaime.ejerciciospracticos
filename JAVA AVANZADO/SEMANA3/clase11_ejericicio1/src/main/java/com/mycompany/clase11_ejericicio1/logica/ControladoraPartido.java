package com.mycompany.clase11_ejericicio1.logica;


import com.mycompany.clase11_ejericicio1.persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ControladoraPartido {

    private ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void registrarPartido(Date fecha, Equipo equipoLocal, Equipo equipoVisitante, int resultadoEquipoLocal, int resultadoEquipoVisitante) {
        Partido partido = new Partido(fecha, equipoLocal, equipoVisitante, resultadoEquipoLocal, resultadoEquipoVisitante);
        controlPersis.crearPartido(partido);
    }

    public List<Partido> listarPartidos() {
        return controlPersis.traerPartidos();
    }

    public Partido obtenerPartidoPorId(Long id) {
        return controlPersis.traerPartidoPorId(id);
    }

    public void actualizarPartido(Partido partido) {
        controlPersis.actualizarPartido(partido);
    }

    public void eliminarPartido(Long id) {
        controlPersis.eliminarPartido(id);
    }
    
    public List<Equipo> obtenerEquiposPorNombre(String nombreEquipo) {
        EntityManager em = controlPersis.getEntityManager();
        try {
            Query q = em.createQuery("SELECT e FROM Equipo e WHERE e.nombre = :nombre");
            q.setParameter("nombre", nombreEquipo);
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    private EntityManager getEntityManager() {
            return controlPersis.getEntityManager();
        }
}
