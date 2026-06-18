package vista;

import javax.swing.JFrame;


public abstract class BaseFrame extends JFrame {
    public BaseFrame(String titulo) {
        super(titulo);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public abstract void mostrar(); 
    
}
