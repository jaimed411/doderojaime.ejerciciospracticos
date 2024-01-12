package com.mycompany.clase10_ejericicio1.persistencia;



import com.mycompany.clase10_ejericicio1.logica.Voto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Persistence;

public class ControladoraPersistencia {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("clase10_ejercicio1PU");

    // Método para obtener una instancia de EntityManager
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Método para crear un nuevo voto en la base de datos
    public void crearVoto(Voto voto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(voto); 
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para obtener la lista de todos los votos almacenados en la base de datos
    public List<Voto> traerVotos() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT v FROM Voto v");
            return q.getResultList(); // Devolver la lista de votos
        } finally {
            em.close();
        }
    }
}