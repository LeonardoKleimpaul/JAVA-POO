package exerc2;

public class Elevador {

  private int andarAtual;
  private int andares;
  private int capacidade;
  private int capacidadeAtual;

  public Elevador() {
  }

  public Elevador(int andarAtual, int andares, int capacidade, int capacidadeAtual) {
    this.andarAtual = andarAtual;
    this.andares = andares;
    this.capacidade = capacidade;
    this.capacidadeAtual = capacidadeAtual;
  }

  public void inicializarElevador(int andares, int capacidade) {
    this.andares = andares;
    this.capacidade = capacidade;
    System.out.println("Andares do Prédio: " + andares);
    System.out.println("Capacidade Máxima: " + capacidade);
    System.out.println("Capacidade atual: " + capacidadeAtual);
    System.out.println("Andar atual: " + andarAtual);
  }

  public void entrarElevador() {
    if (capacidadeAtual < capacidade) {
      capacidadeAtual += 1;
      System.out.println("Capacidade atual: " + capacidadeAtual);
      System.out.println("Andar atual: " + andarAtual);
    } else {
      System.out.println("ELEVADOR CHEIO!!!");
    }
  }

  public void sairElevador() {
    if (capacidadeAtual > 0) {
      capacidadeAtual -= 1;
      System.out.println("Capacidade atual: " + capacidadeAtual);
      System.out.println("Andar atual: " + andarAtual);
    } else {
      System.out.println("Elevador vazio.");
    }

  }

  public void subirElevador() {
    if (andarAtual < andares) {
      andarAtual += 1;
      System.out.println("Capacidade atual: " + capacidadeAtual);
      System.out.println("Andar atual: " + andarAtual);
    } else {
      System.out.println("Ultimo andar!");
    }
  }

  public void descerElevador() {
    if (andarAtual > 0) {
      andarAtual -= 1;
      System.out.println("Capacidade atual: " + capacidadeAtual);
      System.out.println("Andar atual: " + andarAtual);
    } else {
      System.out.println("Térreo!");
    }
  }

  public int getAndarAtual() {
    return andarAtual;
  }

  public void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }

  public int getAndares() {
    return andares;
  }

  public void setAndares(int andares) {
    this.andares = andares;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public int getCapacidadeAtual() {
    return capacidadeAtual;
  }

  public void setCapacidadeAtual(int capacidadeAtual) {
    this.capacidadeAtual = capacidadeAtual;
  }

}
