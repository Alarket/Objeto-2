
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

public class Fase extends JPanel implements ActionListener {

	private Image fundo;
    public Car[] car;
    private Timer timer;
    private Image linha;
    public App app;
    public float pos;
    
	public Fase() {
	
		setFocusable(true);
		setDoubleBuffered(true);
		app = new App();
		 
		ImageIcon referencia = new ImageIcon("res\\Black.png");
		fundo = referencia.getImage();
		
		ImageIcon ref = new ImageIcon("res\\chegada.png");
		linha = ref.getImage(); 
		
	   car = new Car[5];
		car[0]= new Car(0);
		car[1]= new Car(50);
		car[2]= new Car(100);
		car[3]= new Car(150);
		car[4]= new Car(200);
		 
	    car[0].load();
	    car[1].load();
	    car[2].load();
	    car[3].load();
	    car[4].load();
	//addKeyListener(new TecladoAdapter());
	
	timer = new Timer(5, this);
	timer.start();
		
	}

	public void paint(Graphics g) {
		pos= app.getLc()*0.1f;
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo,0,0,null);
		
		graficos.drawImage(linha,0,(int)pos,this);
		
		for(int i=0;i<5;i++) { //System.out.println((int)car[i].getY());
		graficos.drawImage(car[i].getImagem(),(int)car[i].getX(),(int)car[i].getY(),this);
		}
		g.dispose();
	}
	@Override
	public void actionPerformed(ActionEvent e) {	
			repaint();
	}
	
	
	/*
	private class TecladoAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			car.keypressed(e);
		}//keyPressed
		
		@Override
		public void keyReleased(KeyEvent e) {
			car.keyRelease(e);
		}//keyRelease
		
	}//class TecladoAdapter
	*/
}
