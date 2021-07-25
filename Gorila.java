package Animal;

import Animal.Animal;

import Animal.Alimento;

public class Gorila extends Animal{

  public Gorila(double peso, double altura){
    super.setPeso(peso);
    super.setAltura(altura);
  }

  public Alimento[] getPesoAlims(){
    return super.getAlimsIngeridos();
  }


  public double getIMC(){
    Alimento[] Alims = super.getAlimsIngeridos();
    double[] pesoAlims = new double[Alims.length];
    double sumaPeso = 0;

    for(i=0;i<Alims.length;i++){
	pesoAlims[i] = Alims[i].getGramos()*1000; 
    }
    for(j=0;j<pesoAlims.length;j++){
	sumaPeso += pesoAlims[0];
    }

    return (sumaPeso + super.getPeso()  )/ (super.getAltura*super.getAltura() );
  } 

}
