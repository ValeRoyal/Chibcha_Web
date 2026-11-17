package com.chibchaweb.chibchaweb.model;

import com.chibchaweb.chibchaweb.model.actores.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
@Table(name = "token_recuperacion")
public class TokenRecuperacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_token", nullable = false, updatable = false)
    private UUID idToken;

    @Setter
    @Column(name = "token", nullable = false, unique = true, length = 255)
    private String token;

    @Setter
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Setter
    @Column(name = "fecha_expiracion", nullable = false)
    private LocalDateTime fechaExpiracion;

    @Setter
    @Column(name = "usado", nullable = false)
    private Boolean usado;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    protected TokenRecuperacion() {
    }
}
