package co.edu.uniquindio.poo;

import java.util.Collection;

public class Panaderia {
    private String nombre;
    private Collection<Producto> productos;

    public Panaderia(String nombre, Collection<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }


    @Override
    public String toString() {
        return "Panaderia [nombre=" + nombre + ", productos=" + productos + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Collection<Producto> productos) {
        this.productos = productos;
    }
    

}
