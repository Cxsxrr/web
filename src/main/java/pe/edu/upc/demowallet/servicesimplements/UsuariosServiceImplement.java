package pe.edu.upc.demowallet.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demowallet.entities.Usuarios;
import pe.edu.upc.demowallet.repositories.iUsuariosRepository;
import pe.edu.upc.demowallet.servicesinterfaces.iUsuariosService;

import java.util.List;

@Service
public class UsuariosServiceImplement implements iUsuariosService {
    @Autowired
    private iUsuariosRepository uR;

    @Override
    public void insert(Usuarios usuarios) {
        uR.save(usuarios);
    }

    @Override
    public List<Usuarios> list() {
        return uR.findAll();
    }
}
