package com.example.ArepasDonLucho.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String codigo;
    @Column(length = 50, nullable = false)
    private LocalDate fechaCreacion;
    @Column(length = 50, nullable = false)
    private String estado;
    @Column(length = 50, nullable = false)
    private Integer totalItems;
    @Column(length = 50, nullable = false)
    private Integer valorTotal;

    public Pedido() {
    }

    public Pedido(Integer id, String codigo, LocalDate fechaCreacion, String estado, Integer totalItems, Integer valorTotal) {
        this.id = id;
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.totalItems = totalItems;
        this.valorTotal = valorTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }
}
