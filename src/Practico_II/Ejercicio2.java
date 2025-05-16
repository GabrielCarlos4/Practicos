package Practico_II;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;

        if (num2 > mayor ) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor es: "+ mayor);

        scanner.close();
    }
}
