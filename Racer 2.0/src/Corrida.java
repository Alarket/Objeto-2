
public class Corrida {
    
    //variavel responsavel por armazenar o valor da linha d chegada
    private int linhaChegada;
    public Carro[] carro; 
    //instanciando threads
    ThreadCarro[] threads;
    
    public Corrida(Carro[] carros, int linhaChegada){
        carro = carros;
        //this.linhaChegada = linhaChegada;
        this.setLinhaChegada(linhaChegada);
        
        threads = new ThreadCarro[carros.length];
        
        //iniciando as threads
        for(int i = 0; i < carros.length; i++){
            threads[i] = new ThreadCarro(carros[i], this.getLinhaChegada());
            threads[i].start();   
            //System.out.println("Thread " + i + " iniciada");
        }

    }

    public int getLinhaChegada() {
        return this.linhaChegada;
    }

    public void setLinhaChegada(int linhaChegada) {
        this.linhaChegada = linhaChegada;
    }
    
}