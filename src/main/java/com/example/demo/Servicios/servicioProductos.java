package com.example.demo.Servicios;

import com.example.demo.Entidades.Productos;

import java.util.ArrayList;
import java.util.Scanner;

public class servicioProductos {
    private ArrayList<Productos>lista= new ArrayList<>();

    public servicioProductos(){
        lista.add(new Productos(1,"Manzana", 5800.0,50,0,"Frutas"));
        lista.add(new Productos(2,"Banano", 3000.0,20,0,"Frutas"));
        lista.add(new Productos(3,"Tomate", 6000.0,5,0,"Vegetales"));
        lista.add(new Productos(4,"Lenteja", 7000.0,10,0,"Grano"));
        lista.add(new Productos(5,"Pera", 4500.0,25,0,"Frutas"));
    }

    public ArrayList<Productos> mostrar() {
        return lista;
    }

    public int cantidad(){
        return lista.size();
    }

    public ArrayList<Productos> actualizar(){

        double total=0;

        for (int i=0; i<lista.size();i++){
            total=lista.get(i).getPrecio() * lista.get(i).getCantidad();
            lista.get(i).setTotal(total);
            lista.set(i,lista.get(i));
        }
        return lista;

    }

    public double total(){
        double total=0;
        double x=0;

        for (int i=0; i<lista.size();i++){
            total=lista.get(i).getPrecio() * lista.get(i).getCantidad();
            lista.get(i).setTotal(total);
            lista.set(i,lista.get(i));
            x += total;
        }
        return x;

    }






}
