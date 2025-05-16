package Practico_VI;

public class Producto {
    private String nombre;
    private CategoriaProducto categoria;
    private double precio;

    public Producto(String nombre, CategoriaProducto categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    @Override
    public String toString() {
        return "%s - %s - $%.2f".formatted(nombre, categoria.name(), precio);
    }
}
