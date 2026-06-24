package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
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
        this.setLayout(new BorderLayout());
        JPanel panelTitulo = new JPanel();
        panelTitulo.setBackground(new Color(30, 30, 30));
        JLabel titulo = new JLabel("Gestion Citas");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 32));
        titulo.setForeground(Color.WHITE);
        panelTitulo.add(titulo);
        this.add(panelTitulo, BorderLayout.NORTH);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cita");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");

        //Random rand = new Random();
        // Crear tabla con el modelo
        JTable tabla = new JTable(modelo);
        tabla.setDefaultEditor(Object.class,null);
        JScrollPane scroll = new JScrollPane(tabla);
        this.add(scroll, BorderLayout.CENTER);
        
        JButton bntAdd = new JButton("Añadir");
        JButton bntDel = new JButton("Borrar");
        
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(30, 30, 30));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        bntAdd.addActionListener(e -> {
            // Crear los campos de texto
            JTextField txtNombre = new JTextField(10);
            JTextField txtCita = new JTextField(10);
            String[] opcionesEstado = {"Pendiente", "Completada", "Cancelada"};
            JComboBox<String> comboEstado = new JComboBox<>(opcionesEstado);


            // 2. Organizar en un panel (usamos GridLayout para una lista vertical)
            JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));
            panel.add(new JLabel("Cita:")); 
            panel.add(txtCita);
            panel.add(new JLabel("Nombre:"));  
            panel.add(txtNombre);
            panel.add(comboEstado);


            // 3. Mostrar el diálogo
            int result = JOptionPane.showConfirmDialog(null, panel, 
                    "Agregar Nueva cita", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            // 4. Si el usuario presiona OK, añadir fila al modelo
            if (result == JOptionPane.OK_OPTION) {
                Object[] fila = {
                    txtCita.getText(),
                    txtNombre.getText(),
                    comboEstado.getSelectedItem().toString()
                };
                modelo.addRow(fila);
            }
        });
        
        bntDel.addActionListener(e ->{
            int fila1 = tabla.getSelectedRow();
            if (fila1 == -1) {
                JOptionPane.showMessageDialog(this,
                    "Seleccione una cita a eliminar");
                return;
            }
            // Confirmar antes de eliminar
            String nombre = (String) modelo.getValueAt(fila1, 0);
            int resp = JOptionPane.showConfirmDialog(this,
                "¿Eliminar la cita de " + nombre + "?", "Confirmar",
                JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                modelo.removeRow(fila1);              // modelo de tabla
            }
        });
        
        panelBotones.add(bntAdd);
        panelBotones.add(bntDel);
        
        this.add(panelBotones, BorderLayout.SOUTH);
        this.setVisible(true);
        
        
    }
    
}
