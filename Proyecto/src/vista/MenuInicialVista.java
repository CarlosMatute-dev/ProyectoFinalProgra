package vista;

import javax.swing.*;
import java.awt.*;
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
        this.add(base,BorderLayout.NORTH);
        
        //Ventana y titulo inicial
        this.setSize(800, 640);

        JLabel titulo = new JLabel("Administracion tienda tatuajes");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 32));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.WHITE);
        base.setBackground(new Color(30, 30, 30));
        base.add(titulo,BorderLayout.NORTH);
        
        
        //Botones del menu inicial
        JPanel panelBotones = new JPanel(new GridLayout(3, 2, 50, 50));
        panelBotones.setBackground(new Color(30, 30, 30));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        
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
        
        //ActionListeners de los botones
        btCita.addActionListener(e ->{
            new citasVista("Administracion de citas").mostrar();
            this.dispose();
        });
        
        //Agregar los botones
        panelBotones.add(btCita);
        panelBotones.add(btDiseño);
        panelBotones.add(btClientes);
        
        this.add(panelBotones,BorderLayout.CENTER);
        this.setVisible(true);
    }
}
