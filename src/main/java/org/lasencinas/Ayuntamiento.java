package org.lasencinas;

import java.util.HashSet;
import java.util.Set;

public class Ayuntamiento extends EntidadPublica {

    //Atributos

    private Persona alcalde = null;
    private EntidadPublica entidadPublica = null;

    public Set<Biblioteca> listaBibliotecas = new HashSet<>();
    public Set<Ejemplar> listaEjemplares = new HashSet<>(); /*?*/

    //Constructor

    public Ayuntamiento(EntidadPublica entidadPublica, Persona alcalde) {
        this.entidadPublica = entidadPublica;
        this.alcalde = alcalde;
    }

    //Seters

    public void setListaBibliotecas(Set<Biblioteca> listaBibliotecas) {
        this.listaBibliotecas = listaBibliotecas;
    }

    public void setListaEjemplares(Set<Ejemplar> listaEjemplares) {
        this.listaEjemplares = listaEjemplares;
    }

    //Geters

    public Persona getAlcalde() {
        return alcalde;
    }

    public EntidadPublica getEntidadPublica() {
        return entidadPublica;
    }

    public Set<Biblioteca> getListaBibliotecas() {
        return listaBibliotecas;
    }

    public Set<Ejemplar> getListaEjemplares() {
        return listaEjemplares;
    }

    //Métodos

    public void crearBiblioteca() {
        new Biblioteca(this, entidadPublica);
    }


}
