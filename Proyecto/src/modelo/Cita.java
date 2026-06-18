package modelo;

import java.time.LocalDateTime;

public class Cita {
    private int idCita;
    private LocalDateTime fechaHora;
    private Cliente cliente;
    private Diseño diseno;
    private Tatuador tatuador;
    private EstadoCita estado;
    private double precio;

    public Cita(int idCita, LocalDateTime fechaHora, Cliente cliente, Diseño diseno, Tatuador tatuador, EstadoCita estado, double precio) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.cliente = cliente;
        this.diseno = diseno;
        this.tatuador = tatuador;
        this.estado = estado;
        this.precio = precio;
    }

    public Tatuador getTatuador() {
        return tatuador;
    }

    public void setTatuador(Tatuador tatuador) {
        this.tatuador = tatuador;
    }

    

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Diseño getDiseno() {
        return diseno;
    }

    public void setDiseno(Diseño diseno) {
        this.diseno = diseno;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
