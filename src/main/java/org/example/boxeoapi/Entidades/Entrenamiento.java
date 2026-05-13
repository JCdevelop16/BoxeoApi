package org.example.boxeoapi.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Entrenamiento")
public class Entrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrenamiento")
    private int id;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "hora_inicio")
    private String horaInicio;

    @Column(name = "hora_final")
    private String horaFinal;

    @Column(name = "lugar")
    private String lugar;

    @ManyToOne
    @JoinColumn(name = "id_entrenador")
    private Entrenador entrenador;

    public int getId() { return id; }
    public String getFecha() { return fecha; }
    public String getTipo() { return tipo; }
    public String getHoraInicio() { return horaInicio; }
    public String getHoraFinal() { return horaFinal; }
    public String getLugar() { return lugar; }
    public Entrenador getEntrenador() { return entrenador; }
}