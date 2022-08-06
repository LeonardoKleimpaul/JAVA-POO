package model;

import interfaces.ICamareira;
import interfaces.IRecepcionista;

public class AuxiliarGeral extends Pessoa implements ICamareira, IRecepcionista {

  @Override
  public void atender() {
    System.out.println("Ajudando a atender...");
  }

  @Override
  public void falarIngles() {
    System.out.println("Ajudando na conversa em inglês...");
  }

  @Override
  public void arrumarCama() {
    System.out.println("Ajudando a arrumar a cama...");
  }

  @Override
  public void limparQuarto() {
    System.out.println("Ajudando a limpar o quarto...");
  }
  
}
