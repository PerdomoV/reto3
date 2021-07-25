package Animal;

import Animal.Alimento;
public class Animal{
  protected double peso;
  protected double altura;
  protected Alimento alimsIngeridos[];
  protected double IMC;

  public void setPeso(double peso){
    this.peso = peso;
  }

  public void setAltura(double altura){
    this.altura = altura;
  }

  public void setAlimsIngeridos(Alimento[] alimsIngeridos){
    this.alimsIngeridos = alimsIngeridos;
  }

  public double getPeso(){
    return this.peso;
  }

  public double getAltura(){
    return this.altura;
  }

  public Alimento[] getAlimsIngeridos(){
    return this.alimsIngeridos;
  }

  public double getIMC(){
    return this.IMC;
  }

  public void setIMC(double IMC){
    this.IMC = IMC;
  }
}
