
public class ThreadCarro extends Thread{
    
    private Carro carro;
    private int linhaChegada;
    private int totalPercorrido = 0;
   
    private static int colocacao = 0;
    

    public ThreadCarro(Carro c, int linhaChegada) {
        this.setCarro(c);
             
    }
    
    
    @Override
    public void run(){
        
      
            
  
            
            this.carro.Andar();
            
            this.totalPercorrido += this.carro.getDistanciaRandomica();
            
            if(this.totalPercorrido >= Chegada){                
                System.out.println("O " + this.carro.getNome() + " andou " + this.carro.getDistanciaRandomica() +
                    "m e cruzou a linha de chegada percorrendo " + this.totalPercorrido + "m");
            }else{
                System.out.println("O " + this.carro.getNome() + " andou " + this.carro.getDistanciaRandomica() +
                    "m e jÃ¡ percorreu " + this.totalPercorrido + "m");
            }
                    
            this.run();
       
            colocacao++;
            System.out.println(this.carro.getNome() + " foi o " + colocacao + "Â° colocado e alcanÃ§ou a linha de chegada com " + aceleracao + " acelerações");
            //rever se necessita do numero de aceleraçõe
        }
        
        
        
    

    public int getTotalPercorrido() {
        return totalPercorrido;
    }

    public void setTotalPercorrido(int totalPercorrido) {
        this.totalPercorrido = totalPercorrido;
    }

    
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

   

 

    
    
    
}

