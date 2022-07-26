package exer4;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      int opcao;

      Imovel i = new Imovel();

      i.setEndereco("R. Goiabinha, Nr 550, Joaçaba - SC");
      i.setPreco(100000);

      i.infoImovel();

      System.out.println("Digite 1 para escolher o imóvel novo ou 2 para usado.");
      opcao = scan.nextInt();

      switch (opcao) {
        case 1:
          Novo n = new Novo();
          n.setEndereco(i.getEndereco());
          n.setPreco(i.getPreco());
          n.setAdicional(10);
          n.aumentar();
          n.infoImovel();
          break;
        case 2:
          Velho v = new Velho();
          v.setEndereco(i.getEndereco());
          v.setPreco(i.getPreco());
          v.setDesconto(10);
          v.descontar();
          v.infoImovel();
          break;
        default:
          break;
      }
    }

  }

}
