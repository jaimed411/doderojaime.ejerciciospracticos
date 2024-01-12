package com.mycompany.clase10_ejericicio1.logica;




import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voto implements Serializable {
    // Identificador único para cada voto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre del partido al que se emitió el voto
    @Column(name = "NOMBRE_PARTIDO")
    private String nombrePartido;

    // Cantidad de votos emitidos para el partido
    @Column(name = "CANTIDAD_VOTOS")
    private int cantidadVotos;

    // Constructor vacío necesario para JPA
    public Voto() {
    }

    // Constructor que toma el nombre del partido al que se emitió el voto
    public Voto(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    // Métodos getter y setter para acceder a los atributos privados

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
}