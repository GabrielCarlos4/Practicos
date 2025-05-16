package Practico_V;

import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets;

    public SistemaSoporte() {
        this.tickets = new ArrayList<>();
    }

    public void crearTicket(String descripcion, Usuario cliente) {
        tickets.add(new TicketSoporte(descripcion, cliente));
    }

    public void asignarTecnico(int id, Tecnico tecnico) {
        TicketSoporte ticket = buscarPorId(id);
        if (ticket != null) {
            ticket.asignarTecnico(tecnico);
        }
    }
    public void cerrarTicket(int id) {
        TicketSoporte ticket = buscarPorId(id);
        if (ticket != null) {
            ticket.cerrar();
        }
    }

    public void marcarEnProceso(int id) {
        TicketSoporte ticket = buscarPorId(id);
        if (ticket != null) {
            ticket.marcarEnProceso();
        }
    }

    public void listarTodos() {
        for (TicketSoporte t : tickets) {
            System.out.println(t.resumen());
        }
    }

    public void listarAbiertos() {
        for (TicketSoporte t : tickets) {
            if (t.estaAbierto()) {
                System.out.println(t.resumen());
            }
        }
    }

    public void listarCerrados() {
        for (TicketSoporte t : tickets) {
            if (t.estaCerrado()) {
                System.out.println(t.resumen());
            }
        }
    }

    private TicketSoporte buscarPorId(int id) {
        for (TicketSoporte t : tickets) {
            if (t.getId() == id) return t;
        }
        return null;
    }
}
