package SIMULADOR;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Lienzo extends JPanel {
    Graphics2D g2; // Creamos 2 objetos para graficar en el Lienzo
    Graphics gp;
    Simulacion puntero;
    public Lienzo(Simulacion p) {
        this.puntero = p;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
       super.paintComponent(g); 
       g2 =(Graphics2D) g;
       
       g2.setColor(Color.BLUE);
       g2.fillRect(0, 0, getWidth(), getHeight()); 
       g2.setColor(new Color(101,207,134));
       g2.setFont(new Font("Arial", Font.PLAIN, 35));
       g2.drawString("Prueba canvas",450,80);
      
    }
    
}
