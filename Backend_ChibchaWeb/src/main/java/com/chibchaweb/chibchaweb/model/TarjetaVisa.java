package com.chibchaweb.chibchaweb.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarjeta_visa")
public class TarjetaVisa extends Tarjeta {

    protected TarjetaVisa() {
    }
}
