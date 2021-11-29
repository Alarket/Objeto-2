import javax.swing.JFrame;


public class janela extends JFrame{

  public Fase fase;	
	
	public janela() {
		add(fase = new Fase());
		
		setTitle("Racer 2");
		setSize(350,550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
	
	
}
