package com.chibchaweb.chibchaweb.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarjeta_diners")
public class TarjetaDiners extends Tarjeta {

    protected TarjetaDiners() {
    }
}

