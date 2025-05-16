package Practico_III;

public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina) {
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("ID Practico_III.Gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println();
    }

    public static void main(String[] args) {
        Gallina gallina1 = new Gallina("G001");
        Gallina gallina2 = new Gallina("G002");

        gallina1.ponerHuevo();
        gallina1.envejecer();

        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}

