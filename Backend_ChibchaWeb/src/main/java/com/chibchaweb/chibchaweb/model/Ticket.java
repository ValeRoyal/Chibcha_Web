package com.chibchaweb.chibchaweb.model;

import com.chibchaweb.chibchaweb.model.actores.Cliente;
import com.chibchaweb.chibchaweb.model.enums.EstadoTicket;
import com.chibchaweb.chibchaweb.model.enums.NivelSoporte;
import com.chibchaweb.chibchaweb.model.enums.PrioridadTicket;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_ticket", nullable = false, updatable = false)
    private UUID idTicket;

    @Setter
    @Column(name = "asunto", nullable = false, length = 150)
    private String asunto;

    @Setter
    @Column(name = "descripcion", nullable = false, columnDefinition = "TEXT")
    private String descripcion;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoTicket estado;

    @Setter
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Setter
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "nivel_soporte_actual")
    private NivelSoporte nivelSoporteActual;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "prioridad", nullable = false)
    private PrioridadTicket prioridad;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @Setter
    @OneToMany(
            mappedBy = "ticket",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @OrderBy("fechaCreacion ASC")
    private List<EntradaHistorialTicket> historial = new ArrayList<>();

    protected Ticket() {
    }
}