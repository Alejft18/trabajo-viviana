package com.example.demo.Servicios;

import com.example.demo.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioUsuario {
    ArrayList<Usuario>lista=new ArrayList<>();

    public servicioUsuario(){
        lista.add(new Usuario(10,"Pepe", "Colombia",LocalDate.of(2023,02,28),"pepe@gmail.com"));
        lista.add(new Usuario(20,"Marta", "Colombia",LocalDate.of(2023,10,03),"marta@gmail.com"));
        lista.add(new Usuario(30,"Jhon", "España",LocalDate.of(2023,03,14),"john@gmail.com"));
        lista.add(new Usuario(40,"Alejandro", "Argentina",LocalDate.of(2023,11,30),"alejandro@gmail.com"));
    }

    public ArrayList<Usuario> listar() {
        return lista;
    }

    public Usuario buscarUsuario(int codigo){
        Usuario usu=null;
        for (Usuario us:lista){
            if (us.getId()==codigo){
                usu=us;
            }
        }
        return usu;
    }


    public String agregarUsuario(Usuario usu){
        lista.add(usu);
        return "Registro exitoso";
    }





}
