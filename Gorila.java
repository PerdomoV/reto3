package Animal;

import Animal.Animal;

import Animal.Alimento;

public class Gorila extends Animal{

  public Gorila(double peso, double altura){
    this.setPeso(peso);
    this.setAltura(altura);
  }

  public double getPesoAlims(){
    
    double sumaPeso = 0;
    for(int i = 0; i < this.getAlimsIngeridos().length; i++){
	sumaPeso += this.getAlimsIngeridos()[i].getGramos();
    }
    
    return sumaPeso;
  }


  public double getIMC(){
   
   return (this.getPesoAlims()/1000 + this.getPeso()  )/ (this.getAltura()*this.getAltura() ); 
  } 

}
