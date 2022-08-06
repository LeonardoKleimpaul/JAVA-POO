package model;

import interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

  public Camareira() {
  }

  public Camareira(String nome, String telefone, String cpf) {
    super(nome, telefone, cpf);
  }

  @Override
  public String toString() {
    return "Camareira " + super.toString();
  }

  @Override
  public void arrumarCama() {
    System.out.println("Arrumei");
  }

  @Override
  public void limparQuarto() {
    System.out.println("limpei");
  }

}
