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

    public String agregarMascota(Mascota mascota){
        lista.add(mascota);
        return "Registro Exitoso";
    }

    public Mascota buscarMascota(int codigo){
        Mascota masc=null;
        for (Mascota masco:lista){
            if (masco.getId()==codigo){
                masc=masco;
            }
        }
        return masc;
    }

    public ArrayList<Mascota>buscarTipo(String tipoMascota){
        ArrayList<Mascota>buscar=new ArrayList<>();
        for (Mascota masco:lista){
            if (masco.getTipoMascota().equals(tipoMascota)){
                buscar.add(masco);
            }
        }
        return buscar;
    }

    public String eliminarMascota(int id){
        String valor="No se encontró esta mascota";

        for (Mascota mas:lista){
            if (mas.getId()==id){
                lista.remove(mas);
                valor="Mascota eliminada con exito";
            }
        }
        return valor;
    }


    public String actualizarMascota(Mascota m){
        for (Mascota mas: lista){
            if (mas.getId()==m.getId()){
                mas.setNombreMascota(m.getNombreMascota());
                mas.setEdad(m.getEdad());
                mas.setTipoMascota(m.getTipoMascota());
                mas.setNombreDueno(m.getNombreDueno());
            }
        }
        return "Datos modificados exitosamente";
    }




}
