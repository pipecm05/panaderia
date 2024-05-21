package co.edu.uniquindio.poo;

public class Pan extends Producto {
    private String tipo;
    private double peso;

    public Pan(String nombre, double precio, int cantidadDisponible, String tipo, double peso) {
        super(nombre, precio, cantidadDisponible);
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularPrecioTotal() {
        return getPrecio() * peso * getCantidadDisponible();
    }

}
