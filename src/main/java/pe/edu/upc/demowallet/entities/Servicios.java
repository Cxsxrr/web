package pe.edu.upc.demowallet.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Servicios")

public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;
    @Column(name = "nombreServicio", nullable = false,length = 30)
    private String nombreServicio;
    @Column(name = "estadoServicio", nullable = false,length = 30)
    private String estadoServicio;

    public Servicios() {
    }

    public Servicios(int idServicio, String nombreServicio, String estadoServicio) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.estadoServicio = estadoServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getEstadoServicio() {
        return estadoServicio;
    }

    public void setEstadoServicio(String estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    //    servicio_id SERIAL PRIMARY KEY,
    //    nombre_servicio VARCHAR(100),
    //    estado VARCHAR(20) NOT NULL CHECK (estado IN ('Disponible', 'No Disponible'))


}
