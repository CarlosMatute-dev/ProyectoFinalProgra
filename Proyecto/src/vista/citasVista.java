package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.EstadoCita;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import modelo.Cita;
import modelo.SistemaCita;

public class citasVista extends BaseFrame{
    private static int contadorCita = 0;
    public citasVista(String titulo) {
        super(titulo);
    }
    
    @Override
    public void mostrar() {
        //Primer panel
        JPanel base = new JPanel();
        this.add(base,BorderLayout.NORTH);
        SistemaCita sistCita = new SistemaCita();
        
        
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
        
        //TABLA
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cita");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cliente");
        modelo.addColumn("Diseño");
        modelo.addColumn("Estado");
        modelo.addColumn("Precio");
            
        //Random rand = new Random();
        // Crear tabla con el modelo
        JTable tabla = new JTable(modelo);
        tabla.setDefaultEditor(Object.class,null);
        JScrollPane scroll = new JScrollPane(tabla);
        this.add(scroll, BorderLayout.CENTER);
        
        //BOTONES
        JButton bntAdd = new JButton("Añadir");
        JButton bntDel = new JButton("Borrar");
        
        //PANEL BOTONES
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(30, 30, 30));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        bntAdd.addActionListener(e -> {
            // Crear los campos de texto
            JSpinner fecha = new JSpinner(new SpinnerDateModel());
            JSpinner.DateEditor editor = new JSpinner.DateEditor(fecha, "dd/MM/yyyy");
            fecha.setEditor(editor);
            SpinnerNumberModel modeloCliente = new SpinnerNumberModel(0, 0, 100, 1);
            SpinnerNumberModel modeloDiseño = new SpinnerNumberModel(0, 0, 100, 1);
            SpinnerNumberModel modeloPrecio = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
            JSpinner spinnerCliente = new JSpinner(modeloCliente);
            JSpinner spinnerDiseno = new JSpinner(modeloDiseño);
            JSpinner spinnerPrecio = new JSpinner(modeloPrecio);
            JComboBox<EstadoCita> comboEstado = new JComboBox<>(EstadoCita.values());

            //Organizar TODOS los componentes en el panel 
            JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));

            panel.add(new JLabel("Fecha:"));
            panel.add(fecha);
            panel.add(new JLabel("ID Cliente:"));
            panel.add(spinnerCliente);
            panel.add(new JLabel("ID Diseño:"));
            panel.add(spinnerDiseno);
            panel.add(new JLabel("Precio:"));
            panel.add(spinnerPrecio);
            panel.add(new JLabel("Estado:"));
            panel.add(comboEstado);


            int result = JOptionPane.showConfirmDialog(null, panel, 
                    "Agregar Nueva cita", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            // 4. Si el usuario presiona OK, añadir fila al modelo
            if (result == JOptionPane.OK_OPTION) {
                java.util.Date fechaRaw = (java.util.Date) fecha.getValue();
                int idCliente = (Integer) spinnerCliente.getValue();
                int idDiseno = (Integer) spinnerDiseno.getValue();
                int precio = (Integer) spinnerPrecio.getValue();
                EstadoCita estado = (EstadoCita) comboEstado.getSelectedItem();
                LocalDate fechaLocalDate = fechaRaw.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
                Cita cita = new Cita(contadorCita + 1 ,fechaLocalDate, idCliente,idDiseno, estado, precio);
                Object[] fila = {
                    cita.getIdCita(),
                    fechaLocalDate,
                    idCliente,
                    idDiseno,
                    estado,
                    precio         
                };
                //Guarda la cita en una fila de la tabla
                modelo.addRow(fila);
                //Guarda la cita en un arraylist de citas
                sistCita.registrarCita(cita);
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
            int nombre = (int) modelo.getValueAt(fila1, 0);
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
