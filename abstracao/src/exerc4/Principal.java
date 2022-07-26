package exerc4;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int ano,km;
    String modelo, cor;

    System.out.println("Digite o modelo do veículo: ");
    modelo = scan.next();
    System.out.println("Digite o ano do veículo: ");
    ano = scan.nextInt();
    System.out.println("Digite a cor do veículo: ");
    cor = scan.next();
    System.out.println("Digite a quilometragem do veículo: ");
    km = scan.nextInt();

    Veiculo veiculo = new Veiculo(cor, km);

    System.out.println("");
    System.out.println(modelo+" "+ano);
    veiculo.verificarManutencao();
    veiculo.exibirCor();
    System.out.println("Digite uma cor para alterá-la: ");
    cor = scan.next();
    veiculo.mudarCor(cor);
    veiculo.exibirCor();
  }

}
