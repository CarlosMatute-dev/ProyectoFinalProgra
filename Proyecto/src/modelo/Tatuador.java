package modelo;
public class Tatuador extends Persona{
    private String especialidad;
    private int aniosExp;

    public Tatuador(String especialidad, int aniosExp, String nombreCompleto, String rut) {
        super(nombreCompleto, rut);
        this.especialidad = especialidad;
        this.aniosExp = aniosExp;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    

    
}
