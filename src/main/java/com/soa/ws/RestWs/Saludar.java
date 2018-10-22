package com.soa.ws.RestWs;

public class Saludar{

    private final long id;
    private final String nombre;

    public Saludar(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
