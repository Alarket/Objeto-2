
import java.util.Random;

public class Carro {

    private float distanciaRandomica;
    private Car car;
    

    //nome do Carro
    private String nome;
    
    public Carro(String nome,Car car){
        this.setNome(nome);
        this.car = car;
    }
    
    public void Andar(){
        this.setDistanciaRandomica(new Random().nextInt(100));
        
        if(car!=null) {
    	
           car.update();
        }
        
        //this.getDistanciaRandomica();
    }
    
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
