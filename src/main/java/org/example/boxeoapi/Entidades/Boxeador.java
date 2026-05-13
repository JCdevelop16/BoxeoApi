package org.example.boxeoapi.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Boxeador")
public class Boxeador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_boxeador")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "dni")
    private String dni;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    @Column(name = "peso")
    private String peso;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "foto_url")
    private String fotoUrl;

    @Column(name = "activo")
    private Boolean activo;

    @Column(name = "tipo_box")
    private String tipoBox;

    @Column(name = "genero")
    private String genero;

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getDni() { return dni; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public String getPeso() { return peso; }
    public String getCategoria() { return categoria; }
    public String getTelefono() { return telefono; }
    public String getFotoUrl() { return fotoUrl; }
    public Boolean getActivo() { return activo; }
    public String getTipoBox() { return tipoBox; }
    public String getGenero() { return genero; }

}