package org.example.boxeoapi.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Competicion")
public class Competicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_competicion")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "lugar")
    private String lugar;

    @Column(name = "fecha_inicio")
    private String fechaInicio;

    @Column(name = "fecha_fin")
    private String fechaFin;

    @Column(name = "tipo")
    private String tipo;

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getLugar() { return lugar; }
    public String getFechaInicio() { return fechaInicio; }
    public String getFechaFin() { return fechaFin; }
    public String getTipo() { return tipo; }
}