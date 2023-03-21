package com.example.demo.Entidades;

import java.time.LocalDate;

public class Usuario {
    private int id;
    private String nombre;
    private String pais;
    private LocalDate fecha;
    private String correo;

    public Usuario(int id, String nombre, String pais, LocalDate fecha, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.fecha = fecha;
        this.correo = correo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
