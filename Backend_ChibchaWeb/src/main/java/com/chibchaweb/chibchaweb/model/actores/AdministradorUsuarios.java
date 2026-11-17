package com.chibchaweb.chibchaweb.model.actores;


import jakarta.persistence.*;

@Entity
@Table(name = "administrador_usuarios")
public class AdministradorUsuarios extends Usuario {

    protected AdministradorUsuarios() {
    }
}
