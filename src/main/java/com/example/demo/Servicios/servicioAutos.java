package com.example.demo.Servicios;
import com.example.demo.Entidades.Autos;
import org.springframework.stereotype.Service;

import java.lang.constant.Constable;
import java.util.ArrayList;

@Service
public class servicioAutos {
    ArrayList<Autos> carros= new ArrayList<>();

    public servicioAutos(){
        carros.add(new Autos("KGX948", "Renault",2005,"Rojo"));
        carros.add(new Autos("BFL896","Toyota",2022,"Blanco"));
        carros.add(new Autos("APJ365", "Chevrolet",2010,"Negro"));
        carros.add(new Autos("QLP012", "Hyundai",2008,"Verde"));
        carros.add(new Autos("LBN279", "Renault",2023,"Gris"));
    }

    public ArrayList<Autos> listarAutos(){
        return carros;
    }

    public String agregarAutos(Autos aut){
        carros.add(aut);
        return "Registro Exitoso";
    }

    public Autos buscarAutos(String placabus){
        Autos car = null;
        for (Autos a: carros){
            if (a.getPlaca().equals(placabus) ) {
                car= a;
            }
        }
        return car;
    }

    public String eliminarAutos(String placa_eli){
        String resp = "El Auto no se encontro";
        for (Autos a: carros){
            if (a.getPlaca().equals(placa_eli) ) {
                carros.remove(a);
                resp = "El auto se elimino";
            }
        }
        return resp;
    }





    public int cantidadAutos(){
        return carros.size();
    }


}
