public class App {
    public static void main(String[] args) throws Exception {
        
        int numCarros = 5;
        
        
      
        Carro[] carros = new Carro[numCarros]; 
     
      
        for(int i = 0; i < numCarros; i++){
            carros[i] = new Carro("Carro" + (i+1));
            System.out.println(carros[i]);
            
        }
        
      
        
    }
    
}
