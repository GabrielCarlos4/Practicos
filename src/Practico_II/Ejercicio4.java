package Practico_II;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int descuento = 0;
        double preciofinal = 0.0;

        System.out.println("Ingrese el precio del producto:");
        int precio = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = scanner.nextLine().toUpperCase();

        if (categoria.equals("A")) {
            descuento = 10;
        } else if (categoria.equals("B")) {
            descuento = 15;
        } else if (categoria.equals("C")) {
            descuento = 20;
        }

        preciofinal = precio - ((double) (descuento * precio) / 100);
        System.out.println("Descuento aplicado: "+ descuento + "%");
        System.out.println("Precio final: "+ preciofinal);
    }
}
