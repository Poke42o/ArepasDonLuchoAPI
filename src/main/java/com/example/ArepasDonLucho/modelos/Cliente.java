package com.example.ArepasDonLucho.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "Cliente")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nombreCompleto;
    @Column(length = 50, nullable = false)
    private Integer numeroDeDocumento;
    @Column(length = 50, nullable = false)
    private String telefono;
    @Column(length = 50, nullable = false)
    private String email;

    public Cliente() {
    }

    public Cliente(Integer id, String nombreCompleto, Integer numeroDeDocumento, String telefono, String email) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.numeroDeDocumento = numeroDeDocumento;
        this.telefono = telefono;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(Integer numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //Comment
}
