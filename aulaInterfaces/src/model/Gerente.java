package model;

import interfaces.ICamareira;
import interfaces.IRecepcionista;

public class Gerente extends Pessoa implements IRecepcionista, ICamareira {

  public Gerente() {
  }

  public Gerente(String nome, String telefone, String cpf) {
    super(nome, telefone, cpf);
  }

  @Override
  public String toString() {
    return "Gerente " + super.toString();
  }

  @Override
  public void atender() {
    System.out.println("Atendo os clientes mais ou menos...");
  }

  @Override
  public void falarIngles() {
    System.out.println("Falo inglês perfeitamente!");
  }

  @Override
  public void arrumarCama() {
    System.out.println("Ajudo a arrumar a cama");
    
  }

  @Override
  public void limparQuarto() {
    System.out.println("Ajudo a limpar quartos");
  }

}
