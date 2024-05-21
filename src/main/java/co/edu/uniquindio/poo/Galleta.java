package co.edu.uniquindio.poo;

public class Galleta extends Producto {
    private boolean esGourmet;

    public Galleta(String nombre, double precio, int cantidadDisponible, boolean esGourmet) {
        super(nombre, precio, cantidadDisponible);
        this.esGourmet = esGourmet;
    }

    public boolean isEsGourmet() {
        return esGourmet;
    }

    public void setEsGourmet(boolean esGourmet) {
        this.esGourmet = esGourmet;
    }

    @Override
    public double calcularPrecioTotal() {
        double precioBase = getPrecio();
        if (esGourmet) {
            precioBase *= 1.2;
        }
        return precioBase * getCantidadDisponible();
    }
}
