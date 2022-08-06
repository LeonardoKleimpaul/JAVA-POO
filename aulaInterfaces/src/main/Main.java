package main;

import model.Camareira;
import model.Cliente;
import model.Gerente;
import model.Recepcionista;

public class Main {
  public static void main(String[] args) {

    Recepcionista ana = new Recepcionista("Ana", "blz","blz");

    ana.atender();
    ana.falarIngles();

    Gerente gerente = new Gerente("Marcia","asd","asd");

    System.out.println("------------------");

    gerente.atender();
    gerente.falarIngles();
    gerente.arrumarCama();
    gerente.limparQuarto();

    System.out.println("------------------");

    Camareira camareira = new Camareira("Claudia","46","56");

    camareira.arrumarCama();
    camareira.limparQuarto();

  }
}
