package ativ2;

public class Principal {
  public static void main(String[] args) {

    ControleRemoto controle = new ControleRemoto();

    controle.aumentarVol();
    controle.abaixarVol();
    controle.aumentarCanal();
    controle.abaixarCanal();
    controle.selecionarCanal();
    controle.checarInfo();

  }
}
