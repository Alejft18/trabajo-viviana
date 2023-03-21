package com.example.demo.Controlador;

import com.example.demo.Entidades.Mascota;
import com.example.demo.Servicios.servicioMascota;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class ControladorMascota {
    servicioMascota mascota=new servicioMascota();

    @GetMapping("/listarMascotas")
    public ArrayList<Mascota> listar(){
        return mascota.mostrarLista();
    }

    @GetMapping("/cantidadMascotas")
    public String cantidadMAscotas(){
        return  mascota.cantidad();

    }
}
