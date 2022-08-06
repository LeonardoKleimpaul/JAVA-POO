package main;

import model.AuxiliarGeral;
import model.Camareira;
import model.Cliente;
import model.Cozinheira;
import model.FazTudo;
import model.Gerente;
import model.Recepcionista;

public class Main {
  public static void main(String[] args) {

    Recepcionista ana = new Recepcionista("Ana", "blz", "blz");

    ana.atender();
    ana.falarIngles();

    System.out.println("------------------");
    Gerente gerente = new Gerente("Marcia", "asd", "asd");

    gerente.atender();
    gerente.falarIngles();
    gerente.arrumarCama();
    gerente.limparQuarto();

    System.out.println("------------------");
    Camareira camareira = new Camareira("Claudia", "46", "56");

    camareira.arrumarCama();
    camareira.limparQuarto();

    System.out.println("------------------");
    Cozinheira cozinheira = new Cozinheira();

    cozinheira.cozinhar();
    cozinheira.limparCozinha();

    System.out.println("------------------");
    AuxiliarGeral auxGeral = new AuxiliarGeral();

    auxGeral.atender();
    auxGeral.falarIngles();
    auxGeral.arrumarCama();
    auxGeral.limparQuarto();

    System.out.println("------------------");
    FazTudo FazTudo = new FazTudo();

    FazTudo.cozinhar();
    FazTudo.limparCozinha();
    FazTudo.servirComida();
    FazTudo.servirBebida();
    FazTudo.atender();
    FazTudo.falarIngles();
    FazTudo.arrumarCama();
    FazTudo.limparQuarto();

  }
}
