package com.chibchaweb.chibchaweb.model.actores;


import com.chibchaweb.chibchaweb.model.enums.CategoriaDistribuidor;
import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Table(name = "distribuidor")
public class Distribuidor extends Usuario {

    @Setter
    @Column(name = "cantidad_dominios_administrados")
    private Integer cantidadDominiosAdministrados;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "categoria", nullable = false)
    private CategoriaDistribuidor categoria;

    protected Distribuidor() {
    }

    public Integer getCantidadDominiosAdministrados() {
        return cantidadDominiosAdministrados;
    }

    public CategoriaDistribuidor getCategoria() {
        return categoria;
    }
}

