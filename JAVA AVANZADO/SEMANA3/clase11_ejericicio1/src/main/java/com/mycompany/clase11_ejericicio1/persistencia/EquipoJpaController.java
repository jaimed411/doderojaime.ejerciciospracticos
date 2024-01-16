package com.mycompany.clase11_ejericicio1.persistencia;


import com.mycompany.clase11_ejericicio1.logica.Equipo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class EquipoJpaController {

    private EntityManagerFactory emf = null;

    public EquipoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<Equipo> findEquipoEntities() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT e FROM Equipo e");
            return q.getResultList();
        } finally {
            em.close();
        }
    }
}

