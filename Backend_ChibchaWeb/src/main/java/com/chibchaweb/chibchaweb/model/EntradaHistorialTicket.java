package com.chibchaweb.chibchaweb.model;

import com.chibchaweb.chibchaweb.model.actores.Usuario;
import com.chibchaweb.chibchaweb.model.enums.TipoEntradaTicket;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
@Table(name = "entrada_historial_ticket")
public class EntradaHistorialTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_entrada_ticket", nullable = false, updatable = false)
    private UUID idEntradaTicket;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_autor", nullable = false)
    private Usuario autor;

    @Setter
    @Column(name = "contenido", nullable = false, columnDefinition = "TEXT")
    private String contenido;

    @Setter
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_entrada_ticket", nullable = false)
    private TipoEntradaTicket tipoEntradaTicket;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ticket", nullable = false)
    private Ticket ticket;

    protected EntradaHistorialTicket() {
    }
}