package Practico_II;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaPares = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            }

            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
        scanner.close();
    }
}

