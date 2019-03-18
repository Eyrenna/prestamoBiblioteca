package org.lasencinas;

import java.util.HashSet;
import java.util.Set;

public class Ayuntamiento extends EntidadPublica {
    //Atributos

    public Set<Biblioteca> listaBibliotecas = new HashSet<>();
    public Set<Ejemplar> listaEjemplares = new HashSet<>();
}
