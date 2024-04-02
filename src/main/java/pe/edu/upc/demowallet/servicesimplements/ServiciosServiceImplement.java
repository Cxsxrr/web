package pe.edu.upc.demowallet.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demowallet.entities.Servicios;
import pe.edu.upc.demowallet.repositories.iServiciosRepository;
import pe.edu.upc.demowallet.servicesinterfaces.iServiciosService;

import java.util.List;

@Service
public class ServiciosServiceImplement implements iServiciosService {
    @Autowired
    private iServiciosRepository sR;

    @Override
    public void insert(Servicios servicios) {
        sR.save(servicios);

    }

    @Override
    public List<Servicios> list() {
        return sR.findAll();
    }
}
