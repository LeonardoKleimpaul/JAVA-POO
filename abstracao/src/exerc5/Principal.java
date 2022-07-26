package exerc5;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int opcao;
    String anotar;

    CadernoAnotacoes anotacoes = new CadernoAnotacoes();

    do {
      System.out.println("1 – Adicionar Anotação");
      System.out.println("2 – Visualizar Caderno de Anotações");
      System.out.println("3 – Apagar Anotações.");
      System.out.println("4 – Sair");
      opcao = scan.nextInt();
      if (scan.hasNextLine()) {
        scan.nextLine();
      }

      switch (opcao) {
        case 1:
          System.out.println("Digite o que deseja anotar: ");
          anotar = scan.nextLine();
          anotacoes.adicionarAnotacao(anotar);
          break;

        case 2:
          anotacoes.visualizarAnotacoes();
          break;

        case 3:
          anotacoes.apagarAnotacoes();
          break;

        default:
          System.out.println("Encerrando sistema.");
          break;
      }

    } while (opcao != 4);

  }

}
