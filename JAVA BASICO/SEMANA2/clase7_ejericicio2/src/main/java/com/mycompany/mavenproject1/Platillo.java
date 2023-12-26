package com.mycompany.mavenproject1;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Platillo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String receta;
    private double precio;

    // Constructor por defecto (necesario para JPA)
    public Platillo() {
    }

    // Constructor con parámetros
    public Platillo(String nombre, String receta, double precio) {
        this.nombre = nombre;
        this.receta = receta;
        this.precio = precio;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Otros métodos si es necesario

    @Override
    public String toString() {
        return "Platillo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", receta='" + receta + '\'' +
                ", precio=" + precio +
                '}';
    }
}
