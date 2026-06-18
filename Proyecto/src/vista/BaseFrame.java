package vista;

import javax.swing.JFrame;


public abstract class BaseFrame extends JFrame {
    public BaseFrame(String titulo) {
        super(titulo);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Oculta ventana actual y muestra la que viene(destino)
    public void navegar(BaseFrame destino){
        this.setVisible(false);
        destino.setVisible(true);
    }
    
    public abstract void mostrar(); 
    
}
