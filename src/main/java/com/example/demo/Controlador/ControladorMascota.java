package com.example.demo.Controlador;

import com.example.demo.Entidades.Mascota;
import com.example.demo.Servicios.servicioMascota;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorMascota {
    servicioMascota mascota=new servicioMascota();

    @GetMapping("/listarMascotas")
    public ArrayList<Mascota> listar(){
        return mascota.mostrarLista();
    }

    @GetMapping("/cantidadMascotas")
    public String cantidadMascotas(){
        return  mascota.cantidad();
    }

    @PostMapping("/agregarMascota")
    public String agregar(@RequestBody Mascota mas){
        return mascota.agregarMascota(mas);
    }


    @GetMapping("/buscarMascota/{cod}")
    public Mascota buscarMascota(@PathVariable("cod") int codigo){
        return mascota.buscarMascota(codigo);
    }

    @GetMapping("/buscarTipo/{tipo}")
    public ArrayList<Mascota>buscarTipo(@PathVariable("tipo") String tipoMascota){return mascota.buscarTipo(tipoMascota);}

    @DeleteMapping("/eliminarMascota/{cod}")
    public String eliminarMAscota(@PathVariable("cod") int id){
        return mascota.eliminarMascota(id);
    }

    @PostMapping("/modificarMascota")
    public String actualizarMascota(@RequestBody Mascota masco){
        return mascota.actualizarMascota(masco);
    }
}
