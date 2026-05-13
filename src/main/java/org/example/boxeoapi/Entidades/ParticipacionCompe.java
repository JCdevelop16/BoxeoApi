package org.example.boxeoapi.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Participacion_Compe")
public class ParticipacionCompe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_participacion")
    private int id;

    @Column(name = "resultado")
    private String resultado;

    @Column(name = "confirmado")
    private Boolean confirmado;

    @ManyToOne
    @JoinColumn(name = "id_boxeador")
    private Boxeador boxeador;

    @ManyToOne
    @JoinColumn(name = "id_competicion")
    private Competicion competicion;

    public int getId() { return id; }
    public String getResultado() { return resultado; }
    public Boolean getConfirmado() { return confirmado; }
    public Boxeador getBoxeador() { return boxeador; }
    public Competicion getCompeticion() { return competicion; }

    public void setConfirmado(Boolean confirmado) { this.confirmado = confirmado; }
}