package Practico_IV;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(101, "Laura Pérez", "Gerente", 75000);
        Empleado emp2 = new Empleado("Carlos Gómez", "Analista");
        Empleado emp3 = new Empleado("Ana Ruiz", "Desarrolladora");

        emp2.actualizarSalario(10); // 10% aumento
        emp3.actualizarSalario(5000); // aumento fijo

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
