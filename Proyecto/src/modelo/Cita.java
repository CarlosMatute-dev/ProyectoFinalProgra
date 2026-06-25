package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cita {
    private static int contador;
    private int idCita;
<<<<<<< HEAD
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
=======
    private LocalDate fecha;
    private int idCliente;
    private int idDiseno;
    //private Cliente cliente;
    //private Diseño diseno;
    private EstadoCita estado;
    private double precio;

    public Cita(int idCita, LocalDate fecha, int idCliente, int idDiseno, EstadoCita estado, double precio) {
        this.idCita = contador;
        contador += 1;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idDiseno = idDiseno;
>>>>>>> eb1f5e2ed0f7bc0ecd871b6699c877dfb8ca3e76
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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
