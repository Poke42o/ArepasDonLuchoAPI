package com.example.ArepasDonLucho.modelos;


import jakarta.persistence.*;

@Entity
@Table(name="DireccionesEntregas")
public class DireccionEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (length = 200, nullable = false)
    private String ciudad;

    @Column (length = 200, nullable = false)
    private String barrio;

    @Column (length = 200, nullable = false)
    private String direccionTexto;

    @Column (length = 100, nullable = false)
    private String referencia;

    @OneToOne 
    @JoinColumn(name = "fk_cliente", referencedColumnName = "id")
    private Cliente cliente;

    public DireccionEntrega() {
    }

    public DireccionEntrega(Integer id, String ciudad, String barrio, String direccionTexto, String referencia) {
        this.id = id;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.direccionTexto = direccionTexto;
        this.referencia = referencia;
    }
}
