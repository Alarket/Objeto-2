
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Fase extends JPanel  {

	private Image fundo;
    
    private Timer timer;

    
    
    
	public Fase() {
	
		
		 
		ImageIcon referencia = new ImageIcon("res\\Black.png");
		fundo = referencia.getImage();
	  
	 
	
		
	}

	public void paint(Graphics g) {
	
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo,0,0,null);
	
		g.dispose();
	}
	
}
