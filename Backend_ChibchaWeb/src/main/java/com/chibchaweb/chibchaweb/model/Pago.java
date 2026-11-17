package com.chibchaweb.chibchaweb.model;


import com.chibchaweb.chibchaweb.model.enums.EstadoPago;
import jakarta.persistence.*;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_pago", nullable = false, updatable = false)
    private UUID idPago;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_pago")
    private EstadoPago estadoPago;

    @Setter
    @Column(name = "fecha_intento")
    private LocalDateTime fechaIntento;

    @Setter
    @OneToOne
    @JoinColumn(name = "id_recibo")
    private Recibo recibo;

    @Setter
    @Column(name = "referencia_transaccion")
    private String referenciaTransaccion;

    @Setter
    @Column(name = "valor", precision = 12, scale = 2)
    private BigDecimal valor;

    protected Pago() {
    }

    public UUID getIdPago() {
        return idPago;
    }

    public EstadoPago getEstadoPago() {
        return estadoPago;
    }

    public LocalDateTime getFechaIntento() {
        return fechaIntento;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public String getReferenciaTransaccion() {
        return referenciaTransaccion;
    }

    public BigDecimal getValor() {
        return valor;
    }
}

