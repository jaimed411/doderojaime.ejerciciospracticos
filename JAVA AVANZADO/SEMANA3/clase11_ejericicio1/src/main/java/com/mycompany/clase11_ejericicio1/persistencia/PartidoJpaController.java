package com.mycompany.clase11_ejericicio1.persistencia;


import com.mycompany.clase11_ejericicio1.logica.Partido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class PartidoJpaController {

    private EntityManager em;

    public PartidoJpaController(EntityManager em) {
        this.em = em;
    }

    public void create(Partido partido) {
        em.getTransaction().begin();
        em.persist(partido);
        em.getTransaction().commit();
    }

    public List<Partido> findPartidoEntities() {
        Query q = em.createQuery("SELECT p FROM Partido p");
        return q.getResultList();
    }

    public Partido findPartido(Long id) {
        return em.find(Partido.class, id);
    }

    public void updatePartido(Partido partido) {
        em.getTransaction().begin();
        em.merge(partido);
        em.getTransaction().commit();
    }

    public void deletePartido(Long id) {
        em.getTransaction().begin();
        Partido partido = em.find(Partido.class, id);
        em.remove(partido);
        em.getTransaction().commit();
    }

}
