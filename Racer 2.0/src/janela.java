import javax.swing.JFrame;


public class janela extends JFrame{

  public Fase fase;	
	
	public janela() {
		add(fase = new Fase());
		
		setTitle("Racer 2");
		setSize(1024,728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
	
	
}
