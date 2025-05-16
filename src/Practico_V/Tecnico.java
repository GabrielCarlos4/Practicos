package Practico_V;

public class Tecnico {
    private String nombre;
    private String especialidad;

    public Tecnico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return nombre + "-" + especialidad;
    }
}
