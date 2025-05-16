package Practico_VI;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProductos(Producto p) {
        productos.add(p);
    }

    public Producto buscarPorNombre(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
    public List<Producto> filtrarPorCategoria (CategoriaProducto categoria) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public boolean eliminarPorNombre(String nombre) {
        return productos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    public void mostrarReporte() {
        if (productos.isEmpty()) {
            System.out.println("Inventario vacío");
        } else {
            System.out.println("REPORTE DE PRODUCTOS:");
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }
}

