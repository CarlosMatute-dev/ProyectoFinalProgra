package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelDiseño extends JPanel {
    private Image imagen;
    private String textoDescriptivo;

    public PanelDiseño(String rutaImagen, String textoDescriptivo) {
        this.textoDescriptivo = textoDescriptivo;
        this.setBackground(new Color(40, 40, 40));
        try {
            this.imagen = ImageIO.read(new File(rutaImagen));
        } catch (Exception e) {
            System.err.println("No se pudo cargar la imagen: " + rutaImagen);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int ancho = getWidth();
        int alto = getHeight();
        
        if (imagen != null) {
            // Escalar imagen proporcionalmente a la ventana
            int imgWidth = ancho / 2 - 40;
            int imgHeight = alto - 80;
            if(imgWidth < 0) imgWidth = 10;
            if(imgHeight < 0) imgHeight = 10;
            
            g.drawImage(imagen, 20, 20, imgWidth, imgHeight, this);
            
            // Dibujar texto al lado de la imagen
            g.setColor(Color.WHITE);
            int fontSize = ancho / 40 + 10;
            g.setFont(new Font("SansSerif", Font.BOLD, fontSize)); 
            
            int textX = 20 + imgWidth + 20;
            int textY = alto / 2;
            g.drawString(textoDescriptivo, textX, textY);
            g.drawString("Precio Base: $50", textX, textY + 40);
        } else {
            g.setColor(Color.WHITE);
            g.drawString("Imagen no encontrada en: " + "imagenes/Cinnamoroll-6-8.jpg", 20, 20);
        }
    }
}
