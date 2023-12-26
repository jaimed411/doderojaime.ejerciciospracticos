/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Jaime
 */


public class PlatilloJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public PlatilloJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Platillo platillo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(platillo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Platillo platillo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            platillo = em.merge(platillo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = platillo.getId();
                if (findPlatillo(id) == null) {
                    throw new NonexistentEntityException("The platillo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Platillo platillo;
            try {
                platillo = em.getReference(Platillo.class, id);
                platillo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The platillo with id " + id + " no longer exists.", enfe);
            }
            em.remove(platillo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Platillo> findPlatilloEntities() {
        return findPlatilloEntities(true, -1, -1);
    }

    public List<Platillo> findPlatilloEntities(int maxResults, int firstResult) {
        return findPlatilloEntities(false, maxResults, firstResult);
    }

    private List<Platillo> findPlatilloEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Platillo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Platillo findPlatillo(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Platillo.class, id);
        } finally {
            em.close();
        }
    }

    public int getPlatilloCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Platillo> rt = cq.from(Platillo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    

    
    public PlatilloJpaController() {
    emf = Persistence.createEntityManagerFactory("com.mycompany_mavenproject1_jar_1.0-SNAPSHOTPU");
}

}
