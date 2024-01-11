package com.mycompany.personasjsp.logica;

/**
 *
 * @author Jaime
 */

import com.mycompany.personasjsp.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //Crea una nueva persona en la base de datos.

    public void crearPersona(Persona perso) {
        controlPersis.crearPersona(perso);
    }
    
    //Elimina una persona de la base de datos por su identificador único.
    public void eliminarPersona(Long id) {
        controlPersis.eliminarPersona(id);
    }
    
    //Obtiene la lista de todas las personas en la base de datos.
    public List<Persona> traerPersonas() {
        return controlPersis.traerPersonas();
    }
    
    //Edita la información de una persona en la base de datos.
    public void editarPersona(Persona perso) {
        controlPersis.editarPersona(perso);
    }
    
    //Filtra la lista de personas por apellido.
    public List<Persona> filtrarPersonasPorApellido(String apellido) {
        List<Persona> personas = traerPersonas(); // Obtener la lista completa de personas
        List<Persona> personasFiltradas = new ArrayList<>();

        for (Persona persona : personas) {
            if (persona.getApellido().equalsIgnoreCase(apellido)) {
                personasFiltradas.add(persona);
            }
        }

        return personasFiltradas;
    }
}