
public class ThreadCarro extends Thread{
    
    private Carro carro;
    private int linhaChegada;
    private float totalPercorrido = 0;
    private int aceleracao = 0;

   private boolean running = true;

    public ThreadCarro(Carro c, int linhaChegada) {
        this.setCarro(c);
        this.setLinhaChegada(linhaChegada);
        
        
    }
    
    
    @Override
    public void run(){ 	
    	    long now;
    	    long updateTime;
    	    long wait;
    	    final int TARGET_FPS = 30;
    	    final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;
    	
    	while(running) {
    		 now = System.nanoTime();
    			if(totalPercorrido < linhaChegada){
                    aceleracao++;
            
                    this.carro.Andar();
            
                    this.totalPercorrido += this.carro.getDistanciaRandomica();
            
                     if(this.totalPercorrido >= this.linhaChegada){                
                            System.out.println("O " + this.carro.getNome() + " andou " + this.carro.getDistanciaRandomica() +
                            "m e cruzou a linha de chegada percorrendo " + this.totalPercorrido+ "m");
                     }else{
                             System.out.println("O " + this.carro.getNome() + " andou " + this.carro.getDistanciaRandomica()  +
                             "m e já percorreu " + this.totalPercorrido + "m");
                      }
         
                 }
         
            updateTime = System.nanoTime() - now;
            wait = (OPTIMAL_TIME - updateTime) / 1000000;

            try {
            Thread.sleep(wait);
           } catch (Exception e) {
            e.printStackTrace();
           }  
       }
        
        
    }

    public float getTotalPercorrido() {
        return totalPercorrido;
    }

    public void setTotalPercorrido(float totalPercorrido) {
        this.totalPercorrido = totalPercorrido;
    }

    
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getLinhaChegada() {
        return linhaChegada;
    }

    public void setLinhaChegada(int linhaChegada) {
        this.linhaChegada = linhaChegada;
    }

    
    
    
}

