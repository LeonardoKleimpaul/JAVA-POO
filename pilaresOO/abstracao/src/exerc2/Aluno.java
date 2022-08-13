package exerc2;

public class Aluno {

  // atributos
  String nome;
  int idade;
  double media, n1, n2, n3, result;

  // construtor
  public Aluno(String nome, int idade, double n1, double n2, double n3) {
    this.nome = nome;
    this.idade = idade;
    this.media = media;
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
  }

  // metodos
  void calcularMedia() {
    media = (n1 + n2 + n3) / 3;
    System.out.println("A media de " + nome + " é de :" + media);
  }

  void infoAluno() {
    System.out.println("Aluno " + nome + " de " + idade + " anos.");
    System.out.println("");
  }

  void verificarAprovacao() {
    if (media >= 7 && media <= 10) {
      System.out.println("O aluno " + nome + " está aprovado!");
    } else if (media <= 7 && media >= 5) {
      System.out.println("O aluno " + nome + " está em exame!");
    } else if (media < 5) {
      System.out.println("O aluno " + nome + " está REPROVADO!");
    } else {
      System.out.println("Média inválida. Digite corretamente as notas do aluno.");
    }
  }

}
