package pe.edu.upc.demowallet.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Usuarios")

public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombreUsuario", nullable = false, length = 30)
    private String nombreUsuario;
    @Column(name = "correoUsuario", nullable = false, length = 30)
    private String correoUsuario;
    @Column(name = "ping", nullable = false)
    private int ping;
    @Column(name = "creadoEn", nullable = false)
    private LocalDateTime creadoEn;
    @Column(name = "editadoEn", nullable = false)
    private LocalDateTime editadoEn;

    public Usuarios() {
    }

    public Usuarios(int idUsuario, String nombreUsuario, String correoUsuario, int ping, LocalDateTime creadoEn, LocalDateTime editadoEn) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.ping = ping;
        this.creadoEn = creadoEn;
        this.editadoEn = editadoEn;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public int getPing() {
        return ping;
    }

    public void setPing(int ping) {
        this.ping = ping;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }

    public LocalDateTime getEditadoEn() {
        return editadoEn;
    }

    public void setEditadoEn(LocalDateTime editadoEn) {
        this.editadoEn = editadoEn;
    }


    //usuario_id SERIAL PRIMARY KEY,
    //    tipo_usuario VARCHAR(10) NOT NULL CHECK (tipo_usuario IN ('Padre', 'Hijo')),
    //    nombre VARCHAR(100),
    //    correo_electronico VARCHAR(100),
    //    pin VARCHAR(6),
    //    creadoEn TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    //    editadoEn TIMESTAMP DEFAULT CURRENT_TIMESTAMP

}
