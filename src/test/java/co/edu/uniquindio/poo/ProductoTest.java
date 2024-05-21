package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductoTest {

    @Test
    public void testCalcularPrecioTotal() {
      var producto = new Pastel ("Pastel de Chocolate", 10.0, 5, "Chocolate", "Mediano") ;

      double precioTotal = producto.calcularPrecioTotal();
      assertEquals(50.0, precioTotal);

    System.out.println("el precio a pagar por los pasteles es de: " + precioTotal);
    }

    @Test

    public void testCalcularPrecioTotalGalleta() {
        var producto = new Galleta ("galleta de chocolate", 20.0,3, true );

        double precioTotal = producto.calcularPrecioTotal();
        assertEquals(72.0, precioTotal);
        System.out.println("el precio a pagar por las galletas es de: " + precioTotal);

    }

    @Test
    public void testCalcularPrecioTotalPan() {
        var Producto = new Pan("ojaldre",5.0,3,"pastel",3.2);

        double precioTotal = Producto.calcularPrecioTotal();
        assertEquals(48.0,precioTotal);
        System.out.println("el precio a pagar por los panes es de: " + precioTotal);   
    }
    
}
