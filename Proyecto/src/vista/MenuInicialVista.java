package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuInicialVista extends BaseFrame{

    public MenuInicialVista(String titulo) {
        super(titulo);
    }
    
    @Override
    public void mostrar() {
        
        //Primer panel
        JPanel base = new JPanel();
        this.add(base);
        
        //Ventana y titulo inicial
        this.setSize(800, 640);
        JLabel titulo = new JLabel("Administracion tienda tatuajes");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 32));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(titulo,BorderLayout.NORTH);
        
        //Botones del menu inicial
        JButton btCita = new JButton("Ver Citas");
        JButton btDiseño = new JButton("Ver o editar Diseños");
        JButton btClientes = new JButton("Ver clientes");
        
        //Color de fondo y letra de los botones
        btCita.setBackground(Color.black);
        btCita.setForeground(Color.white);
        btDiseño.setBackground(Color.black);
        btDiseño.setForeground(Color.white);
        btClientes.setBackground(Color.black);
        btClientes.setForeground(Color.white);
        
        //Agregar los botones
        base.add(btCita);
        base.add(btDiseño);
        base.add(btClientes);
        

        this.setVisible(true);
    }
}
