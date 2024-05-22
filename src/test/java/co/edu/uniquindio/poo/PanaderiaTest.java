package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PanaderiaTest {
    private Panaderia panaderia;

    @BeforeEach
    public void setUp() {
        panaderia = new Panaderia("felipe el mejor", null);
    }

    @Test
    public void testAgregarProducto() {
        Pastel pastel = new Pastel("Pastel de Vainilla", 25.0, 5, "Vainilla", "Mediano");
        panaderia.agregarProducto(pastel);
        assertEquals(125.0, panaderia.calcularIngresosTotales());
    }

    @Test
    public void testEliminarProducto() {
        Pan pan = new Pan("Pan Blanco", 2.0, 30, "Blanco", 0.4);
        panaderia.agregarProducto(pan);
        panaderia.eliminarProducto("Pan Blanco");
        assertNull(panaderia.buscarProducto("Pan Blanco"));
    }

    @Test
    public void testBuscarProducto() {
        Galleta galleta = new Galleta("Galleta de Chispas", 1.0, 20, true);
        panaderia.agregarProducto(galleta);
        Producto encontrado = panaderia.buscarProducto("Galleta de Chispas");
        assertNotNull(encontrado);
    }

    @Test
    public void testCalcularIngresosTotales() {
        Pastel pastel = new Pastel("Pastel de Frutas", 30.0, 3, "Frutas", "Grande");
        Galleta galleta = new Galleta("Galleta de Chispas", 1.0, 20, true);
        panaderia.agregarProducto(pastel);
        panaderia.agregarProducto(galleta);
        double ingresos = panaderia.calcularIngresosTotales();
        assertEquals(114.0, ingresos, 0.001);
        System.out.println("los ingresos totales son de:  "+ ingresos + panaderia);
    }

    @Test
    public void testCalcularIngresosPorCategoria() {
        Pan pan = new Pan("Pan Multigrano", 1.5, 40, "Multigrano", 0.6);
        Pan pan2 = new Pan("Pan Multigrano", 1.5, 40, "Multigrano", 0.6);
        Pan pan3 = new Pan("Pan Multigrano", 1.5, 40, "Multigrano", 0.6);
        Galleta galleta = new Galleta("Galleta de Chispas", 1.0, 20, true);
        panaderia.agregarProducto(pan);
        panaderia.agregarProducto(pan2);
        panaderia.agregarProducto(pan3);
        panaderia.agregarProducto(galleta);

        double ingresos = panaderia.calcularIngresosPorCategoria(Pan.class);
        assertEquals(108.0, ingresos, 0.001);
    }
}
