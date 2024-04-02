package pe.edu.upc.demowallet.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demowallet.dtos.UsuariosDTO;
import pe.edu.upc.demowallet.entities.Usuarios;
import pe.edu.upc.demowallet.servicesinterfaces.iUsuariosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    private iUsuariosService uS;

    @PostMapping
    public void insertar(@RequestBody UsuariosDTO usuarioDTO){
        ModelMapper d = new ModelMapper();
        Usuarios usuario = d.map(usuarioDTO, Usuarios.class);
        uS.insert(usuario);
    }

    @GetMapping
    public List<UsuariosDTO> listar(){
        return uS.list().stream().map(y->{
            ModelMapper u = new ModelMapper();
            return u.map(y,UsuariosDTO.class);
        }).collect(Collectors.toList());
    }





}
