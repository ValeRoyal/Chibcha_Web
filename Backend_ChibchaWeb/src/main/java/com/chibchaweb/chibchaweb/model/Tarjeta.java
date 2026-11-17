package com.chibchaweb.chibchaweb.model;


import jakarta.persistence.*;
import lombok.Setter;

import java.time.YearMonth;
import java.util.UUID;

@Entity
@Table(name = "tarjeta")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_tarjeta", nullable = false, updatable = false)
    private UUID idTarjeta;

    @Setter
    @Column(name = "numero", nullable = false)
    private String numero;

    @Setter
    @Column(name = "fecha_vencimiento")
    private YearMonth fechaVencimiento;

    protected Tarjeta() {
    }

    public UUID getIdTarjeta() {
        return idTarjeta;
    }

    public String getNumero() {
        return numero;
    }

    public YearMonth getFechaVencimiento() {
        return fechaVencimiento;
    }
}

