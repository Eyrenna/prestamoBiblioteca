package org.lasencinas;

public class EntidadPublica {
    //Atributos

    private String code = null;
    private String nombre = null;
    private String direccion = null;

    //Constructor

    public EntidadPublica(String code) {
        this.code = code;
    }

    //Seters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Geters

    public String getCode() {
        return this.code;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
