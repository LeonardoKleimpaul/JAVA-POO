package model;

import interfaces.ICozinheira;

public class Cozinheira extends Pessoa implements ICozinheira{

  @Override
  public void cozinhar() {
    System.out.println("Cozinhando...");
  }

  @Override
  public void limparCozinha() {
    System.out.println("Limpando a bagunça");
    
  }
  
}
