package com.chibchaweb.chibchaweb.model;


import com.chibchaweb.chibchaweb.model.enums.EstadoPago;
import com.chibchaweb.chibchaweb.model.enums.PeriodicidadPago;
import jakarta.persistence.*;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "recibo")
public class Recibo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_recibo", nullable = false, updatable = false)
    private UUID idRecibo;

    @Setter
    @Column(name = "concepto")
    private String concepto;

    @Setter
    @ManyToOne
    @JoinColumn(name = "id_dominio", nullable = false)
    private Dominio dominio;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_pago")
    private EstadoPago estadoPago;

    @Setter
    @Column(name = "fecha_emision")
    private LocalDateTime fechaEmision;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "periodicidad")
    private PeriodicidadPago periodicidad;

    @Setter
    @Column(name = "valor", precision = 12, scale = 2)
    private BigDecimal valor;

    protected Recibo() {
    }

    public UUID getIdRecibo() {
        return idRecibo;
    }

    public String getConcepto() {
        return concepto;
    }

    public Dominio getDominio() {
        return dominio;
    }

    public EstadoPago getEstadoPago() {
        return estadoPago;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public PeriodicidadPago getPeriodicidad() {
        return periodicidad;
    }

    public BigDecimal getValor() {
        return valor;
    }
}

