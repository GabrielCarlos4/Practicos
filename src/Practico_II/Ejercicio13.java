package Practico_II;

public class Ejercicio13 {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPreciosOriginales(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrarPreciosModificados(precios, 0);
    }

    public static void mostrarPreciosOriginales(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosOriginales(precios, indice + 1);
        }
    }

    public static void mostrarPreciosModificados(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosModificados(precios, indice + 1);
        }
    }
}

