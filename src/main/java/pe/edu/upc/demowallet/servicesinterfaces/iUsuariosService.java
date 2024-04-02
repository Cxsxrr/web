package pe.edu.upc.demowallet.servicesinterfaces;

import pe.edu.upc.demowallet.entities.Usuarios;

import java.util.List;

public interface iUsuariosService {

    public void insert(Usuarios usuarios);
    public List<Usuarios> list();
}
