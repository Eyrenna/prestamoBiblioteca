package org.lasencinas;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca extends EntidadPublica {
    //Atributos
    public Set<Personal> listaPersonal = new HashSet<>();
    public Set<Miembro> listaMiembros = new HashSet<>();
}
