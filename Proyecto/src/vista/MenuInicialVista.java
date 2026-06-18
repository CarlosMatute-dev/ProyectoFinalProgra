package vista;

import javax.swing.JLabel;

public class MenuInicialVista extends BaseFrame{

    public MenuInicialVista(String titulo) {
        super(titulo);
    }
    
    @Override
    public void mostrar() {
        this.setSize(800, 640);
        JLabel titulo = new JLabel("Administracion tienda tatuajes");
        this.setVisible(true);
    }
}
