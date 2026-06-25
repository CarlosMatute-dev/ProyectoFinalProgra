/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DiseñoVista extends BaseFrame {

    public DiseñoVista(String titulo) {
        super(titulo);
    }
    
    @Override
    public void mostrar() {
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
        this.setVisible(true);
    }
}
