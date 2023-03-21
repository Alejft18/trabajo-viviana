package com.example.demo.Servicios;

import com.example.demo.Entidades.Productos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Scanner;

@Service
public class servicioProductos {
    private ArrayList<Productos> lista = new ArrayList<>();
    public servicioProductos(){
        lista.add(new Productos(1,"Manzana",3000.0,50,0,"Frutas"));
        lista.add(new Productos(1,"Lechuga",3000.0,50,0,"Vegetales"));
        lista.add(new Productos(1,"Maiz",3000.0,50,0,"Granos"));
        lista.add(new Productos(1,"Papa",3000.0,50,0,"Vegetales"));
        lista.add(new Productos(1,"Arroz",3000.0,50,0,"Granos"));
    }

    public ArrayList<Productos> mostrar(){
        return lista;
    }

    public int cantidad(){
        return lista.size();
    }

    public ArrayList<Productos> totalproductos(){
        double total=0;
        for (int i=0;i<lista.size();i++){
            total=lista.get(i).getPrecio() * lista.get(i).getCantidad();
            lista.get(i).setTotal(total);
            lista.set(i,lista.get(i));
        }
        return lista;
    }

    public double valortotal(){
        double total=0;
        double x=0;
        for (int i=0;i<lista.size();i++){
            total=lista.get(i).getPrecio() * lista.get(i).getCantidad();
            lista.get(i).setTotal(total);
            lista.set(i,lista.get(i));
            x += total;
        }
        return x;
    }

}



