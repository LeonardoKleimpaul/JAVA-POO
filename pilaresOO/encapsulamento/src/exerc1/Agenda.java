package exerc1;

import java.util.ArrayList;

public class Agenda {

  private ArrayList<Pessoa> listap = new ArrayList<>();

  public void armazenaPessoa(String nome, int idade, double altura) {
    listap.add(new Pessoa(nome, idade, altura));
  }

  public void removePessoa(String nome) {
    for (int cont = 0; cont < listap.size(); cont++) {
      if (listap.get(cont).getNome().equals(nome)) {
        System.out.println(listap.get(cont).getNome() + " Removido da lista");
        System.out.println("--------------------------------------------------");
        listap.remove(cont);
      }
    }
  }

  public int buscarPessoa(String nome) {
    for (int cont = 0; cont < listap.size(); cont++) {
      if (listap.get(cont).getNome().equals(nome)) {
        System.out.println("Nome: " + listap.get(cont).getNome() + ", Posição: " + cont + 1);
        return (cont + 1);
      }
    }
    return 0;
  }

  public void imprimeAgenda() {
    for (int cont = 0; cont < listap.size(); cont++) {
      System.out.println("Nome: " + listap.get(cont).getNome() + " | " +
          " Idade: " + listap.get(cont).getIdade() + " | " +
          " Altura: " + listap.get(cont).getAltura());
    }
  }

  public void imprimePessoa(int index) {
    System.out.println("Pessoa " + index +
        "\nNome: " + listap.get(index - 1).getNome() +
        "\nIdade: " + listap.get(index - 1).getIdade() +
        "\nAltura: " + listap.get(index - 1).getAltura());
  }

  // get set
  public ArrayList<Pessoa> getListap() {
    return listap;
  }

  public void setListap(ArrayList<Pessoa> listap) {
    this.listap = listap;
  }

}
