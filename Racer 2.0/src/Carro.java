
import java.util.Random;

public class Carro {

    private float distanciaRandomica;

    

    //nome do Carro
    private String nome;
    
    public Carro(String nome){
        this.setNome(nome);
        
    }
    
    public void Andar(){
        this.setDistanciaRandomica(new Random().nextInt(1,100)*0.01f);
      
        }
        
        //this.getDistanciaRandomica();
  
    
    public float getDistanciaRandomica() {
        return distanciaRandomica;
    }

    public void setDistanciaRandomica(float distanciaRandomica) {
        this.distanciaRandomica = distanciaRandomica;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
