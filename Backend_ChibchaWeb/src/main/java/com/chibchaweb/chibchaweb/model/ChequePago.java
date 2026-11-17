package com.chibchaweb.chibchaweb.model;
import com.chibchaweb.chibchaweb.config.YearMonthConverter;
import com.chibchaweb.chibchaweb.model.actores.Distribuidor;
import com.chibchaweb.chibchaweb.model.enums.EstadoEnvioCheque;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.UUID;

@Getter
@Entity
@Table(name = "cheque_pago")
public class ChequePago {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_cheque", nullable = false, updatable = false)
    private UUID idCheque;

    @Setter
    @Column(name = "documento_generado")
    private String documentoGenerado;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_envio", nullable = false)
    private EstadoEnvioCheque estadoEnvio;

    @Setter
    @Column(name = "fecha_generacion", nullable = false)
    private LocalDateTime fechaGeneracion;

    @Setter
    @Convert(converter = YearMonthConverter.class)
    @Column(name = "periodo_pago", nullable = false, length = 7)
    private YearMonth periodoPago;

    @Setter
    @Column(name = "valor", nullable = false, precision = 12, scale = 2)
    private BigDecimal valor;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_distribuidor", nullable = false)
    private Distribuidor distribuidor;

    protected ChequePago() {
    }
}
