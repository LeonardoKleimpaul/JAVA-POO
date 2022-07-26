package exerc4;

public class Veiculo {

  // atributos
  String cor;
  double km;

  // construtor
  public Veiculo(String cor, double km) {
    this.cor = cor;
    this.km = km;
  }

  // metodos

  void verificarManutencao() {
    if (km < 25000) {
      System.out.println("Tudo ok!");
    } else if (km >= 25000 && km <= 75000) {
      System.out.println("Realizar revisão parcial.");
    } else if (km > 75000) {
      System.out.println("Realizar revisão completa.");
    } else {
      System.out.println("Quilometragem inválida.");
    }
  }

  void mudarCor(String novaCor) {
    cor = novaCor;
  }

  void exibirCor() {
    System.out.println("A cor do veiculo é " + cor);
  }

}
