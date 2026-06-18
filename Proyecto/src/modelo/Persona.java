package modelo;
abstract public class Persona {
    protected String nombreCompleto;
    protected String rut;

    public Persona(String nombreCompleto, String rut) {
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
    }
    
}
