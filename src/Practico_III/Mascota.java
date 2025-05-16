package Practico_III;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad += 1;
    }

    public static void main(String[] args) {
        Mascota mascota = new Mascota("Luna", "Perro", 3);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        System.out.println("\nDespués de cumplir años:");
        mascota.mostrarInfo();
    }
}
