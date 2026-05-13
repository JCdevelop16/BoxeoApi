package org.example.boxeoapi.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Asistencia_entreno")
public class AsistenciaEntreno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asistencia")
    private int id;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_boxeador")
    private Boxeador boxeador;

    @ManyToOne
    @JoinColumn(name = "id_entrenamiento")
    private Entrenamiento entrenamiento;

    public int getId() { return id; }
    public Boolean getEstado() { return estado; }
    public Boxeador getBoxeador() { return boxeador; }
    public Entrenamiento getEntrenamiento() { return entrenamiento; }

    public void setEstado(Boolean estado) { this.estado = estado; }
}