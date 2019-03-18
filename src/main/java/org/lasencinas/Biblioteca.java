package org.lasencinas;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca extends EntidadPublica {
    //Atributos
    private String director = null;
    private String codeAyunt = null;

    public Set<Empleado> listaEmpleado = new HashSet<>();
    public Set<Miembro> listaMiembros = new HashSet<>();
}
