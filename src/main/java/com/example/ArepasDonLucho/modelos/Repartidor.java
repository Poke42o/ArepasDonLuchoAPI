package com.example.ArepasDonLucho.modelos;

import jakarta.persistence.*;


@Entity
@Table (name = "Repartidor")
public class Repartidor {

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
    private String placaVehiculo;
    @Column(length = 50, nullable = false)
    private String zonaCobertura;
    @Column(length = 50, nullable = false)
    private Boolean activo;

    public Repartidor() {
    }

    public Repartidor(Integer id, String nombreCompleto, Integer numeroDeDocumento, String telefono, String placaVehiculo, String zonaCobertura, Boolean activo) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.numeroDeDocumento = numeroDeDocumento;
        this.telefono = telefono;
        this.placaVehiculo = placaVehiculo;
        this.zonaCobertura = zonaCobertura;
        this.activo = activo;
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

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
