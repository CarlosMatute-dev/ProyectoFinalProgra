package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class citasVista extends BaseFrame{

    public citasVista(String titulo) {
        super(titulo);
    }
    
    @Override
    public void mostrar() {
        //Primer panel
        JPanel base = new JPanel();
        this.add(base,BorderLayout.NORTH);
        
        //Ventana y titulo inicial
        this.setSize(800, 640);
        JLabel titulo = new JLabel("Gestion Citas");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 32));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.WHITE);
        base.setBackground(new Color(30, 30, 30));
        base.add(titulo,BorderLayout.NORTH);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cita");
        modelo.addColumn("Nombre");

        //Random rand = new Random();
        // Crear tabla con el modelo
        JTable tabla = new JTable(modelo);
        tabla.setDefaultEditor(Object.class,null);
        JScrollPane scroll = new JScrollPane(tabla);
        base.add(scroll);
        
        JButton bntAdd = new JButton("Añadir");
        JButton bntDel = new JButton("Borrar");
        Object[] fila = {"01", "Pete"};
        modelo.addRow(fila);
        
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(30, 30, 30));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        
        bntDel.addActionListener(e ->{
            int fila1 = tabla.getSelectedRow();
            if (fila1 == -1) {
                JOptionPane.showMessageDialog(this,
                    "Seleccione un personaje a eliminar");
                return;
            }
            // Confirmar antes de eliminar
            String nombre = (String) modelo.getValueAt(fila1, 0);
            int resp = JOptionPane.showConfirmDialog(this,
                "¿Eliminar a " + nombre + "?", "Confirmar",
                JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                modelo.removeRow(fila1);              // modelo de tabla
            }
        });
        
        panelBotones.add(bntAdd);
        panelBotones.add(bntDel);
        
        this.add(panelBotones);

        this.setVisible(true);
        
        
    }
    
}
