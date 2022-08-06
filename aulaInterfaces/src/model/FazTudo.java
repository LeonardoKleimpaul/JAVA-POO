package model;

import interfaces.IAuxiliarGeral;
import interfaces.ICamareira;
import interfaces.ICozinheira;
import interfaces.IRecepcionista;

public class FazTudo extends Pessoa implements IAuxiliarGeral, ICozinheira, ICamareira, IRecepcionista {

  @Override
  public void cozinhar() {
    System.out.println("Mais um para ajudar na cozinha...");
  }

  @Override
  public void limparCozinha() {
    System.out.println("A limpeza é comigo mesmo...");
  }

  @Override
  public void servirComida() {
    System.out.println("Mais um para servir as refeições...");
  }

  @Override
  public void servirBebida() {
    System.out.println("Barman e Garçom...");
  }

  @Override
  public void atender() {
    System.out.println("Vamos atender todos!");
  }

  @Override
  public void falarIngles() {
    System.out.println("Do you need something?");
  }

  @Override
  public void arrumarCama() {
    System.out.println("Pronta para um belo sono...");
  }

  @Override
  public void limparQuarto() {
    System.out.println("Mais um quarto limpinho...");
  }

}
