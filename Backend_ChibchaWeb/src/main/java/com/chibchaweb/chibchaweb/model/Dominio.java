package com.chibchaweb.chibchaweb.model;


import com.chibchaweb.chibchaweb.model.enums.PeriodicidadPago;
import com.chibchaweb.chibchaweb.model.enums.PlataformaServidor;
import com.chibchaweb.chibchaweb.model.enums.TipoPlanHosting;
import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "dominio")
public class Dominio {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_dominio", nullable = false, updatable = false)
    private UUID idDominio;

    @Setter
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Setter
    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "periodicidad_pago")
    private PeriodicidadPago periodicidadPago;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "plan_hosting")
    private TipoPlanHosting planHosting;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "plataforma")
    private PlataformaServidor plataforma;

    @Setter
    @Column(name = "proxima_fecha_pago")
    private LocalDate proximaFechaPago;

    @Setter
    @OneToOne
    @JoinColumn(name = "id_tarjeta")
    private Tarjeta tarjetaAsociada;

    protected Dominio() {
    }

    public UUID getIdDominio() {
        return idDominio;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public PeriodicidadPago getPeriodicidadPago() {
        return periodicidadPago;
    }

    public TipoPlanHosting getPlanHosting() {
        return planHosting;
    }

    public PlataformaServidor getPlataforma() {
        return plataforma;
    }

    public LocalDate getProximaFechaPago() {
        return proximaFechaPago;
    }

    public Tarjeta getTarjetaAsociada() {
        return tarjetaAsociada;
    }
}

