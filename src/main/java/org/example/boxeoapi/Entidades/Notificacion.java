package org.example.boxeoapi.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Notificacion")
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notificacion")
    private int id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "mensaje")
    private String mensaje;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "leida")
    private Boolean leida;

    @ManyToOne
    @JoinColumn(name = "id_boxeador")
    private Boxeador boxeador;

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getMensaje() { return mensaje; }
    public String getFecha() { return fecha; }
    public Boolean getLeida() { return leida; }
    public Boxeador getBoxeador() { return boxeador; }
}