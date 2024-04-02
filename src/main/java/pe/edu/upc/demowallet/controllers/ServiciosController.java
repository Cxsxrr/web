package pe.edu.upc.demowallet.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demowallet.dtos.ServiciosDTO;
import pe.edu.upc.demowallet.entities.Servicios;
import pe.edu.upc.demowallet.entities.Usuarios;
import pe.edu.upc.demowallet.servicesinterfaces.iServiciosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicios")
public class ServiciosController {
    @Autowired
    private iServiciosService sS;

    @PostMapping
    public void insertar(@RequestBody ServiciosDTO servicioDTO) {
        ModelMapper d = new ModelMapper();
        Servicios servicio = d.map(servicioDTO, Servicios.class);
        sS.insert(servicio);
    }

    @GetMapping
    public List<ServiciosDTO> listar() {
        return sS.list().stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ServiciosDTO.class);
        }).collect(Collectors.toList());
    }
}