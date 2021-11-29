
public class ThreadCarro extends Thread{
    
    private Carro carro;
    private int linhaChegada;
    private float totalPercorrido = 0;
    private int aceleracao = 0;
    private static int colocacao = 0;
    

    public ThreadCarro(Carro c, int linhaChegada) {
        this.setCarro(c);
        this.setLinhaChegada(linhaChegada);
        
        
    }
    
    
    @Override
    public void run(){
        
        if(totalPercorrido < linhaChegada){
            
            aceleracao++;
            
            this.carro.Andar();
            
            this.totalPercorrido += this.carro.getDistanciaRandomica();
            
            if(this.totalPercorrido >= this.linhaChegada){                
                System.out.println("O " + this.carro.getNome() + " andou " + this.carro.getDistanciaRandomica() +
                    "m e cruzou a linha de chegada percorrendo " + this.totalPercorrido + "m");
            }else{
                System.out.println("O " + this.carro.getNome() + " andou " + this.carro.getDistanciaRandomica() +
                    "m e jÃ¡ percorreu " + this.totalPercorrido + "m");
            }
                    
            this.run();
        }else{
            colocacao++;
            System.out.println(this.carro.getNome() + " foi o " + colocacao + "Â° colocado e alcanÃ§ou a linha de chegada com " + aceleracao + " acelerações");
            //rever se necessita do numero de aceleraçõe
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

