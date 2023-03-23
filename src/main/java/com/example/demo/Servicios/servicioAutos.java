package com.example.demo.Servicios;
import com.example.demo.Entidades.Autos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioAutos {
    ArrayList<Autos> auto= new ArrayList<>();

    public servicioAutos(){
        auto.add(new Autos("KGX948", "Renault",2005,"Rojo"));
        auto.add(new Autos("BFL896","Toyota",2022,"Blanco"));
        auto.add(new Autos("APJ365", "Chevrolet",2010,"Negro"));
        auto.add(new Autos("QLP012", "Hyundai",2008,"Verde"));
        auto.add(new Autos("LBN279", "Renault",2023,"Gris"));
    }
}
