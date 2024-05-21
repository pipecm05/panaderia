package co.edu.uniquindio.poo;

public class Pastel extends Producto {
    private String sabor;
    private String tamaño;

    public Pastel(String nombre, double precio, int cantidadDisponible, String sabor, String tamaño) {
        super(nombre, precio, cantidadDisponible);
        this.sabor = sabor;
        this.tamaño = tamaño;
    }

    
    @Override
    public double calcularPrecioTotal() {
         double precioBase = getPrecio();
        return precioBase * getCantidadDisponible();
    }


    public String getSabor() {
        return sabor;
    }


    public void setSabor(String sabor) {
        this.sabor = sabor;
    }


    public String getTamaño() {
        return tamaño;
    }


    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }


    @Override
    public String toString() {
        return "Pastel [sabor=" + sabor + ", tamaño=" + tamaño + "]";
    }
    
}
