package com.example.demo.Controlador;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Servicios.servicioAutos;
import com.example.demo.Entidades.Autos;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorAutos {
    servicioAutos servicio = new servicioAutos();

    @GetMapping("/listarAutos")
    public ArrayList<Autos> listarAutos(){
        return servicio.listarAutos();
    }

    @PostMapping("/agregarAuto")
    public String agregar(@RequestBody Autos autos){
        return servicio.agregarAutos(autos);
    }

    @GetMapping("/buscarAuto/{placabus}")
    public Autos buscarAuto(@PathVariable("placabus") String placabus) {
        return servicio.buscarAutos(placabus);
    }

    @DeleteMapping("/eliminarAuto/{placa_eli}")
    public String eliminarAuto(@PathVariable("placa_eli") String placa_eli) {
        return servicio.eliminarAutos(placa_eli);
    }

    @GetMapping("/cantidadAuto")
    public int mostrar(){
        return servicio.cantidadAutos();
    };
}
