package modelo;

public class Diseño {
    private int idDiseno;
    private String nombre;
    private String estilo;
    private double tamanoCentimetros;
    private boolean esAColor;

    public Diseño(int idDiseno, String nombre, String estilo, double tamanoCentimetros, boolean esAColor) {
        this.idDiseno = idDiseno;
        this.nombre = nombre;
        this.estilo = estilo;
        this.tamanoCentimetros = tamanoCentimetros;
        this.esAColor = esAColor;
    }

    public int getIdDiseno() {
        return idDiseno;
    }

    public void setIdDiseno(int idDiseno) {
        this.idDiseno = idDiseno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getTamanoCentimetros() {
        return tamanoCentimetros;
    }

    public void setTamanoCentimetros(double tamanoCentimetros) {
        this.tamanoCentimetros = tamanoCentimetros;
    }

    public boolean isEsAColor() {
        return esAColor;
    }

    public void setEsAColor(boolean esAColor) {
        this.esAColor = esAColor;
    }
    
    
}
