package com.example.demo.Controlador;

import com.example.demo.Entidades.Usuario;
import com.example.demo.Servicios.servicioUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorUsuario {
    servicioUsuario servicio= new servicioUsuario();

    @GetMapping("/listarUsuarios")
    public ArrayList<Usuario> listarUsuarios(){
        return servicio.listar();
    }

    @PostMapping("/agregarUsuario")
    public String agregar(@RequestBody Usuario usuario){
        return servicio.agregarUsuario(usuario);
    }

    @GetMapping("/buscarUsuario/{cod}")
    public Usuario buscarUsuario(@PathVariable("cod") int codigo) {
        return servicio.buscarUsuario(codigo);
    }
}
