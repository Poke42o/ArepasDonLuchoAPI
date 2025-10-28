package com.example.ArepasDonLucho.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (length = 200, nullable = false)
    private String nombres;

    @Column (length = 200, nullable = false)
    private String tipoDeDocumento;

    @Column (length = 200, nullable = false)
    private String numeroDocumento;

    @Column (length = 100, nullable = true)
    private String telefono;

    @Column (length = 200, nullable = false, unique = true)
    private String email;

    @OneToOne (mappedBy = "cliente")
    private DetalleEntrega detalleEntrega;
    public Cliente() {
    }

    public Cliente(Integer id, String nombres, String tipoDeDocumento, String numeroDocumento, String telefono, String email) {
        this.id = id;
        this.nombres = nombres;
        this.tipoDeDocumento = tipoDeDocumento;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.email = email;
    }
}
