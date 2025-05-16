package Practico_VI;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        //Kata 1
        inventario.agregarProductos(new Producto("Notebook", CategoriaProducto.TECNOLOGIA, 1200));
        inventario.agregarProductos(new Producto("Detergente", CategoriaProducto.LIMPIEZA, 250));
        inventario.agregarProductos(new Producto("Campera", CategoriaProducto.VESTIMENTA, 990));
        inventario.agregarProductos(new Producto("Arroz", CategoriaProducto.ALIMENTO, 180));
        inventario.agregarProductos(new Producto("Silla", CategoriaProducto.HOGAR, 1500));

        inventario.mostrarReporte();

        //Kata 2
        System.out.println("\nBuscar: Campera");
        Producto encontrado = inventario.buscarPorNombre("Campera");
        System.out.println(encontrado != null ? encontrado : "Producto no encontrado");

        System.out.println("\nFiltrar categoría: LIMPIEAZ");
        List<Producto> limpieza = inventario.filtrarPorCategoria(CategoriaProducto.LIMPIEZA);
        limpieza.forEach(System.out::println);

        //Kata 3
        System.out.println("\nEliminar producto: Arroz");
        boolean eliminado = inventario.eliminarPorNombre("Arroz");
        System.out.println(eliminado ? "Producto eliminado" : "No se encontró el producto");

        System.out.println("\nInventario actualizado:");
        inventario.mostrarReporte();
    }
}
