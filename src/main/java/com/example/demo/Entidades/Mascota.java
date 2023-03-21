package com.example.demo.Entidades;

public class Mascota {
    private int id;
    private String nombreMascota;
    private int edad;
    private String tipoMascota;
    private String nombreDueno;


    public Mascota(int id, String nombreMascota, int edad, String tipoMascota, String nombreDueno) {
        this.id = id;
        this.nombreMascota = nombreMascota;
        this.edad = edad;
        this.tipoMascota = tipoMascota;
        this.nombreDueno = nombreDueno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }
}
