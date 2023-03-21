package com.example.demo.Servicios;

import com.example.demo.Entidades.Mascota;

import java.util.ArrayList;

public class servicioMascota {

    private ArrayList<Mascota> lista= new ArrayList<>();

    public servicioMascota(){
        lista.add(new Mascota(1,"Simba",3,"Gato","Lucia"));
        lista.add(new Mascota(2,"Luna",5,"Perro","Nicolas"));
        lista.add(new Mascota(3,"Dante",4,"Gato","Yaneth"));
        lista.add(new Mascota(4,"London",2,"Gato","Cristian"));
        lista.add(new Mascota(5,"Mara",3,"Perro","Jessica"));
    }

    public ArrayList<Mascota> mostrarLista() {
        return lista;
    }

    public String cantidad(){
        String texto="La cantidad de mascotas registradas es: ";
        return texto+lista.size();
    }
}
