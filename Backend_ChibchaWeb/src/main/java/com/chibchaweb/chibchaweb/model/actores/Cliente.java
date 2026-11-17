package com.chibchaweb.chibchaweb.model.actores;


import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente extends Usuario {

    protected Cliente() {
    }
}
