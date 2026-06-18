package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MenuInicialVista extends BaseFrame{

    public MenuInicialVista(String titulo) {
        super(titulo);
    }
    
    @Override
    public void mostrar() {
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
        btDiseño.setBackground(Color.black);
        btClientes.setBackground(Color.black);
        
        
        
        this.setVisible(true);
    }
}
