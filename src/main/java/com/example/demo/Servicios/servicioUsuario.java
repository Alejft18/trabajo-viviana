package com.example.demo.Servicios;

import com.example.demo.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioUsuario {
    ArrayList<Usuario> lista=new ArrayList<>();


    public servicioUsuario() {
        lista.add(new Usuario(10,"Luisa","Alemania", LocalDate.of(2023,02,28), "luisa@gmail.com"));
        lista.add(new Usuario(11,"Mateo","Mexico", LocalDate.of(2022,05,18), "mateo@gmail.com"));
        lista.add(new Usuario(12,"Valentina","Rusia", LocalDate.of(2020,03,25), "valen@gmail.com"));
    }

    public ArrayList<Usuario> listar(){
        return lista;
    }

    public String agregarUsuario(Usuario usu){
        lista.add(usu);
        return "Registro Exitoso";
    }

    public Usuario buscarUsuario(int codigo){
        Usuario usu = null;
        for (Usuario u: lista){
            if (u.getId()==codigo){
                usu=u;
            }
        }
        return usu;
    }
}
