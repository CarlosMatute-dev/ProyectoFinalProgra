package modelo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

import vista.citasVista;

public class SistemaCita {
     private ArrayList<Cita> citas;
    
    public SistemaCita() {
        citas = new ArrayList<>();
    }
    
    public void registrarCita(int idCita,LocalDate fecha, int idCliente, int idDiseno, EstadoCita estado, int precio ) {

        Cita cita = new Cita(idCita, fecha, idCliente, idDiseno, estado, precio);
        citas.add(cita);
        
        
    }
    
}
