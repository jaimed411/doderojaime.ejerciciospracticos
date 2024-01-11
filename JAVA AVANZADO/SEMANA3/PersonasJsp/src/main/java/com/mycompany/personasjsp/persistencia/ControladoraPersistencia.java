package com.mycompany.personasjsp.persistencia;


import com.mycompany.personasjsp.PersonaJpaController;
import com.mycompany.personasjsp.exceptions.NonexistentEntityException;
import com.mycompany.personasjsp.logica.Persona;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    PersonaJpaController persoJPA = new PersonaJpaController();
    //Crea una nueva persona en la base de datos.

    public void crearPersona(Persona perso) {
        persoJPA.create(perso);
    }
    
    //Elimina una persona de la base de datos por su identificador único.
    public void eliminarPersona(Long id) {
        Optional.ofNullable(persoJPA.findPersona(id))
                .ifPresent(persona -> {
                    try {
                        persoJPA.destroy(id);
                    } catch (NonexistentEntityException ex) {
                        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
    }
    
    //Obtiene la lista de todas las personas en la base de datos.
    public List<Persona> traerPersonas() {
        return persoJPA.findPersonaEntities();
    }
    
    //Edita la información de una persona en la base de datos.
    public void editarPersona(Persona perso) {
        try {
            persoJPA.edit(perso);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}