
import java.util.Random;

public class Carro {

    private int distanciaRandomica;

  
    private String nome;
    
    public Carro(String nome){
        this.setNome(nome);
    }
    
    public void Andar(){
        this.setDistanciaRandomica(new Random().nextInt(50));
         }
    
    public int getDistanciaRandomica() {
        return distanciaRandomica;
    }

    public void setDistanciaRandomica(int distanciaRandomica) {
        this.distanciaRandomica = distanciaRandomica;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
