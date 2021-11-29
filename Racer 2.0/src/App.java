public class App {
	

	private static janela janel;
    public static void main(String[] args) throws Exception {
      
    	
    	//numero de carros
        int numCarros = 5;
        
        //tamanho da corrida
        int linhaChegada = 500;
        
        //instanciando carros
        Carro[] carros = new Carro[numCarros]; 
        
        //criando a corrida
        Corrida corrida;
       
        //iniciando a corrida
        corrida = new Corrida(carros, linhaChegada);
      
        
        janel = new janela();
     
   
   
    }
    
}
