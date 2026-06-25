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
    
    public void registrarCita(Cita cita ) {
        citas.add(cita);  
    }
    
}
