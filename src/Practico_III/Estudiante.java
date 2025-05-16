package Practico_III;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Practico_III.Estudiante: " + apellido + ", " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > 10) {
            calificacion = 10;
        }
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0;
        }
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "Programación I", 7.5);

        estudiante.mostrarInfo();

        estudiante.subirCalificacion(2);
        estudiante.bajarCalificacion(1.5);

        System.out.println("\nDespués de modificar la calificación:");
        estudiante.mostrarInfo();
    }
}
