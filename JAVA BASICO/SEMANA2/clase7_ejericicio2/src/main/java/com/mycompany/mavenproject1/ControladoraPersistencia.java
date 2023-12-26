/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.List;
import javax.persistence.EntityManager;

public class ControladoraPersistencia {

    private PlatilloJpaController platilloController;

    public ControladoraPersistencia() {
        this.platilloController = new PlatilloJpaController();
    }

    public void crearPlato(Platillo plato) {
        EntityManager em = platilloController.getEntityManager();
        try {
            em.getTransaction().begin();
            platilloController.create(plato);
            em.getTransaction().commit();
            System.out.println("Platillo creado exitosamente: " + plato);
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void borrarPlato(Long id) {
        EntityManager em = platilloController.getEntityManager();
        try {
            em.getTransaction().begin();
            platilloController.destroy(id);
            em.getTransaction().commit();
            System.out.println("Platillo borrado exitosamente con ID: " + id);
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public List<Platillo> traerPlatos() {
        return platilloController.findPlatilloEntities();
    }
}


