import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.KeyEvent;
public class Car {
 
	private float x,y;
	private float dx,dy;
	private Image imagem;
	private int altura ,largura;
	public Carro carro;

	
	public Car(int x) {
	
		
		
		this.x = x;
		this.y = 0;
	
	
	}
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\car.png");
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);	
		largura = imagem.getWidth(null);
		}
	
	public void update() {
		
		y += carro.getDistanciaRandomica()*0.1f;
		
			
	}
	public void keypressed(KeyEvent tecla) {
		int codigo  = tecla.getKeyCode();
		if(codigo== KeyEvent.VK_UP) {
			dy = -3;
		}//if
		if(codigo== KeyEvent.VK_DOWN) {
			dy = 3;
		}//if		
		if(codigo== KeyEvent.VK_LEFT) {
			dx = -3;
		}//if
		if(codigo== KeyEvent.VK_RIGHT) {
			dx = 3;
		}//if
	}
	public void keyRelease(KeyEvent tecla) {
		int codigo  = tecla.getKeyCode();
		if(codigo== KeyEvent.VK_UP) {
			dy = 0;
		}//if
		if(codigo== KeyEvent.VK_DOWN) {
			dy = 0;
		}//if		
		if(codigo== KeyEvent.VK_LEFT) {
			dx = 0;
		}//if
		if(codigo== KeyEvent.VK_RIGHT) {
			dx = 0;
		}//if
		
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public Image getImagem() {
		return imagem;
	}
	
	
	
	}
	
	
	