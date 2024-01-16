package com.mycompany.clase11_ejericicio1.logica;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Partido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name = "equipoLocal_id")
    private Equipo equipoLocal;
    
    @ManyToOne
    @JoinColumn(name = "equipoVisitante_id")
    private Equipo equipoVisitante;
    private int resultadoEquipoLocal;
    private int resultadoEquipoVisitante;


    
    public Partido() {
    }

    public Partido(Date fecha, Equipo equipoLocal, Equipo equipoVisitante, int resultadoEquipoLocal, int resultadoEquipoVisitante) {
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultadoEquipoLocal = resultadoEquipoLocal;
        this.resultadoEquipoVisitante = resultadoEquipoVisitante;
    }


    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getResultadoEquipoLocal() {
        return resultadoEquipoLocal;
    }

    public void setResultadoEquipoLocal(int resultadoEquipoLocal) {
        this.resultadoEquipoLocal = resultadoEquipoLocal;
    }

    public int getResultadoEquipoVisitante() {
        return resultadoEquipoVisitante;
    }

    public void setResultadoEquipoVisitante(int resultadoEquipoVisitante) {
        this.resultadoEquipoVisitante = resultadoEquipoVisitante;
    }

}
