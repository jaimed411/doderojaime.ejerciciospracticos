package com.mycompany.personasjsp.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String nombre; 
    private String apellido; 
    private String telefono; 

    //Constructor predeterminado sin argumentos requerido por JPA.
    public Persona() {
    }

    //Constructor que inicializa los atributos de la persona.
    public Persona(Long id, String nombre, String apellido, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    //Obtiene el identificador único de la persona.
    public Long getId() {
        return id;
    }

    //Establece el identificador único de la persona.
    public void setId(Long id) {
        this.id = id;
    }

    //Obtiene el nombre de la persona.
    public String getNombre() {
        return nombre;
    }

    //Establece el nombre de la persona.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Obtiene el apellido de la persona.
    public String getApellido() {
        return apellido;
    }

    //Establece el apellido de la persona.
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Obtiene el número de teléfono de la persona.
    public String getTelefono() {
        return telefono;
    }

    //Establece el número de teléfono de la persona.
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
