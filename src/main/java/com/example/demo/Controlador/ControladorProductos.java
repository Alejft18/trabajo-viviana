package com.example.demo.Controlador;

import com.example.demo.Entidades.Productos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Servicios.servicioProductos;

import java.util.ArrayList;


@RestController
public class ControladorProductos {
    servicioProductos servicio = new servicioProductos();

    @GetMapping("/listarProductos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/cantidades")
    public int mostrar(){
        return servicio.cantidad();
    };

}