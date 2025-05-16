package Practico_V;

public class Main {
    public static void main(String[] args) {
        SistemaSoporte sistema = new SistemaSoporte();

        Usuario u1 = new Usuario("Lucas Domínguez", "lucas@mail.com");
        Usuario u2 = new Usuario("Ana Pérez", "ana@mail.com");

        Tecnico t1 = new Tecnico("Carlos Tech", "PCs");
        Tecnico t2 = new Tecnico("Laura Fix", "Electrodomésticos");

        sistema.crearTicket("No arranca la notebook", u1);
        sistema.crearTicket("Heladera sin enfriar", u2);

        sistema.asignarTecnico(1, t1);
        sistema.asignarTecnico(2, t2);

        sistema.marcarEnProceso(1);
        sistema.cerrarTicket(2);

        sistema.listarTodos();
    }
}
