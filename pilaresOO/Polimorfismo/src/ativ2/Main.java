package ativ2;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Animal> listaanimais = new ArrayList<>();

    listaanimais.add(new Homem());
    listaanimais.add(new Homem());
    listaanimais.add(new Homem());
    listaanimais.add(new Homem());
    listaanimais.add(new Cao());
    listaanimais.add(new Cao());
    listaanimais.add(new Cao());
    listaanimais.add(new Cao());
    listaanimais.add(new Gato());
    listaanimais.add(new Gato());
    listaanimais.add(new Gato());
    listaanimais.add(new Gato());

    for (int i = 0; i < listaanimais.size(); i++) {
      System.out.println(listaanimais.get(i).falar());
    }

  }

}
