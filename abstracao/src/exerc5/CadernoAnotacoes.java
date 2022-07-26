package exerc5;

import java.util.ArrayList;

public class CadernoAnotacoes {

  ArrayList<String> listaAnotacoes = new ArrayList<>();

  // construtor
  public CadernoAnotacoes() {
  }

  void adicionarAnotacao(String anotar) {
    listaAnotacoes.add(anotar);

  }

  void visualizarAnotacoes() {
    if (listaAnotacoes.isEmpty()) {
      System.out.println("LISTA VAZIA!");
    } else {
      System.out.println("    ---Lista de Anotações---");
      System.out.println("");
      listaAnotacoes.forEach(lista -> {
        System.out.println(lista);
      });
      System.out.println("");
    }
  }

  void apagarAnotacoes() {
    listaAnotacoes.clear();
  }

}
