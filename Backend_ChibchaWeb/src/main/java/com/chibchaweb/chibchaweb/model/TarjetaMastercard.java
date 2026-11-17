package com.chibchaweb.chibchaweb.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarjeta_mastercard")
public class TarjetaMastercard extends Tarjeta {

    protected TarjetaMastercard() {
    }
}

