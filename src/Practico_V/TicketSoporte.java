package Practico_V;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TicketSoporte {
    private static int contador = 1;
    private int id;
    private String descripcion;
    private EstadoTicket estado;
    private LocalDate fechaCreacion;
    private Usuario cliente;
    private Tecnico asignado;

    public TicketSoporte(String descripcion, Usuario cliente) {
        this.id = contador++;
        this.descripcion = descripcion;
        this.estado = EstadoTicket.ABIERTO;
        this.fechaCreacion = LocalDate.now();
        this.cliente = cliente;
    }

    public void asignarTecnico(Tecnico tecnico) {
        this.asignado = tecnico;
    }

    public void cerrar() {
        this.estado = EstadoTicket.EN_PROCESO;
    }

    public void marcarEnProceso() {
        this.estado = EstadoTicket.EN_PROCESO;
    }

    public boolean estaCerrado() {
        return estado == EstadoTicket.CERRADO;
    }

    public boolean estaAbierto() {
        return estado == EstadoTicket.ABIERTO;
    }

    public int getId() {
        return id;
    }

    public String resumen() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tecnicoNombre = (asignado != null) ? asignado.toString() : "No asignado";

        return """
                -----------------------------
                Ticket N° %d
                Descripción: %s
                Estado: %s
                Fecha: %s
                Cliente: %s
                Técnico: %s
                -----------------------------
                """.formatted(id, descripcion, estado.name(), fechaCreacion.format(df), cliente, tecnicoNombre);
    }
}
