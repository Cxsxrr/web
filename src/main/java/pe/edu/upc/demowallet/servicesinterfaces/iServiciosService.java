package pe.edu.upc.demowallet.servicesinterfaces;

import pe.edu.upc.demowallet.entities.Servicios;

import java.util.List;

public interface iServiciosService {
    public void insert (Servicios servicios);
    public List<Servicios> list();
    
}
