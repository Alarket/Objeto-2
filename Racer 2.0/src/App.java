public class App {
	
    
	public static int Lc ;
	private static janela janel;
    public static void main(String[] args) throws Exception {
      
    	
    	//numero de carros
        int numCarros = 5;
        
        //tamanho da corrida
        int metros  = 4000;
        int linhaChegada = metros;
        Lc = linhaChegada;
        
        //instanciando carros
        Carro[] carros = new Carro[numCarros]; 
        
        //criando a corrida
        Corrida corrida;
       
        //iniciando janela de interface
      
       janel = new janela();
       
       //inicializando carros
    
       for(int i = 0; i < numCarros; i++){
           carros[i] = new Carro("Carro" + (i+1),janel.fase.car[i]);
           janel.fase.car[i].carro = carros[i];
           
       }
  
      //inicializando corrida
       corrida = new Corrida(carros, linhaChegada);
       
     
    }
    public static int getLc() {
  		return Lc;
  	}
    
    
}
