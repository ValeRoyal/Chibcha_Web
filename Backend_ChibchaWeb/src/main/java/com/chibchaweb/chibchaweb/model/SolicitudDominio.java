package com.chibchaweb.chibchaweb.model;


import com.chibchaweb.chibchaweb.model.actores.Cliente;
import com.chibchaweb.chibchaweb.model.enums.EstadoSolicitudDominio;
import com.chibchaweb.chibchaweb.model.enums.TipoSolicitudDominio;
import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "solicitud_dominio")
public class SolicitudDominio {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_solicitud_dominio", nullable = false, updatable = false)
    private UUID idSolicitudDominio;

    @Setter
    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente clienteSolicitante;

    @Setter
    @ManyToOne
    @JoinColumn(name = "id_dominio", nullable = false)
    private Dominio dominioSolicitado;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoSolicitudDominio estado;

    @Setter
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoSolicitudDominio tipo;

    protected SolicitudDominio() {
    }

    public UUID getIdSolicitudDominio() {
        return idSolicitudDominio;
    }

    public Cliente getClienteSolicitante() {
        return clienteSolicitante;
    }

    public Dominio getDominioSolicitado() {
        return dominioSolicitado;
    }

    public EstadoSolicitudDominio getEstado() {
        return estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public TipoSolicitudDominio getTipo() {
        return tipo;
    }
}
