package com.example.demo.Controlador;

import com.example.demo.Entidades.Productos;
import com.example.demo.Servicios.servicioProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorProductos {
    servicioProductos servicio = new servicioProductos();

    @GetMapping("/listarProductos")
    public ArrayList<Productos>listar(){

        return servicio.mostrar();
    }

    @GetMapping("/mostrarCantidad")
    public int mostarCantidad(){
        return servicio.cantidad();
    }

    @GetMapping("/mostrarTotal")
    public ArrayList<Productos> actualizar(){
       return servicio.actualizar();
    }




}
