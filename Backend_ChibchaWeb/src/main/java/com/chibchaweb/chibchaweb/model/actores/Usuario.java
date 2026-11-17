package com.chibchaweb.chibchaweb.model.actores;

import com.chibchaweb.chibchaweb.model.enums.EstadoUsuario;
import com.chibchaweb.chibchaweb.model.enums.RolUsuario;
import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_usuario", nullable = false, updatable = false)
    private UUID idUsuario;

    @Setter
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Setter
    @Column(name = "apellidos", nullable = false, length = 150)
    private String apellidos;

    @Setter
    @Column(name = "correo", nullable = false, unique = true, length = 150)
    private String correo;

    @Setter
    @Column(name = "contrasenia", nullable = false)
    private String contrasenia;

    @Setter
    @Column(name = "pais", nullable = false)
    private Integer pais;

    @Setter
    @Column(name = "ciudad", nullable = false, length = 100)
    private String ciudad;

    @Setter
    @Column(name = "direccion_residencia", length = 200)
    private String direccionResidencia;

    @Setter
    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol", nullable = false, length = 40)
    private RolUsuario rol;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_usuario", nullable = false, length = 30)
    private EstadoUsuario estadoUsuario;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;

    // Constructor requerido por JPA
    protected Usuario() {
    }

    // Constructor para inicializar los datos comunes
    protected Usuario(
            String nombre,
            String apellidos,
            String correo,
            String contrasenia,
            Integer pais,
            String ciudad,
            String direccionResidencia,
            String telefono,
            RolUsuario rol,
            EstadoUsuario estadoUsuario
    ) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccionResidencia = direccionResidencia;
        this.telefono = telefono;
        this.rol = rol;
        this.estadoUsuario = estadoUsuario;
        this.fechaRegistro = LocalDateTime.now();
    }

    // Getters

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Integer getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public RolUsuario getRol() {
        return rol;
    }

    public EstadoUsuario getEstadoUsuario() {
        return estadoUsuario;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

}

