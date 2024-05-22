package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Panaderia {
    private String nombre;
    private Collection<Producto> productos;

    public Panaderia(String nombre, Collection<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }
    private List<Producto> inventario = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public void eliminarProducto(String nombre) {
        inventario.removeIf(producto -> producto.getNombre().equalsIgnoreCase(nombre));
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public double calcularIngresosTotales() {
        double ingresosTotales = 0;
        for (Producto producto : inventario) {
            ingresosTotales += producto.calcularPrecioTotal();
        }
        return ingresosTotales;
    }

    public double calcularIngresosPorCategoria(Class<?> categoria) {
        double ingresosPorCategoria = 0;
        for (Producto producto : inventario) {
            if (categoria.isInstance(producto)) {
                ingresosPorCategoria += producto.calcularPrecioTotal();
            }
        }
        return ingresosPorCategoria;
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
