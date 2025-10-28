package com.example.ArepasDonLucho.modelos;


import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name="DetallesEntregas")
public class DetalleEntrega {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private LocalDate horaSalidaCocina;

    @Column (nullable = false)
    private LocalDate horaEntregaCliente;

    @Column (nullable = false)
    private Boolean estadoActivo;

    @Column (length = 100, nullable = false)
    private String fotoPrueba;

    @Column (nullable = false)
    private Boolean intentoFallido;

    public DetalleEntrega() {
    }

    public DetalleEntrega(Integer id, LocalDate horaSalidaCocina, LocalDate horaEntregaCliente, Boolean estadoActivo, String fotoPrueba, Boolean intentoFallido) {
        this.id = id;
        this.horaSalidaCocina = horaSalidaCocina;
        this.horaEntregaCliente = horaEntregaCliente;
        this.estadoActivo = estadoActivo;
        this.fotoPrueba = fotoPrueba;
        this.intentoFallido = intentoFallido;
    }
}
