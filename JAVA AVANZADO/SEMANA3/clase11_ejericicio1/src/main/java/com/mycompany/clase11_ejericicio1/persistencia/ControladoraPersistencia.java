package com.mycompany.clase11_ejericicio1.persistencia;


import com.mycompany.clase11_ejericicio1.logica.Equipo;
import com.mycompany.clase11_ejericicio1.logica.Partido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Persistence;

public class ControladoraPersistencia {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("torneoPU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void crearEquipo(Equipo equipo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(equipo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Equipo consultarEquipo(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Equipo.class, id);
        } finally {
            em.close();
        }
    }

    public List<Equipo> traerEquipos() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT e FROM Equipo e");
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Equipo> traerEquiposPorCiudad(String ciudad) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT e FROM Equipo e WHERE e.ciudad = :ciudad");
            q.setParameter("ciudad", ciudad);
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public void eliminarEquipo(Long id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Equipo equipo = em.find(Equipo.class, id);
            if (equipo != null) {
                em.remove(equipo);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void actualizarEquipo(Equipo equipo) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(equipo);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Equipo traerEquipoPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Equipo.class, id);
        } finally {
            em.close();
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    
    public void crearPartido(Partido partido) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(partido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Partido> traerPartidos() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT p FROM Partido p");
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Partido traerPartidoPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Partido.class, id);
        } finally {
            em.close();
        }
    }

    public void actualizarPartido(Partido partido) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(partido);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void eliminarPartido(Long id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Partido partido = em.find(Partido.class, id);
            if (partido != null) {
                em.remove(partido);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
