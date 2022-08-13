package exemplos;

public class JogoTabuleiro extends Jogo {

  private String tamanhoTabuleiro;
  private int quantPecas;

  public void setupTabuleiro() {
    System.out.println("Tabuleiro montado.");
  }

  public void moverPeca() {
    System.out.println("Peça movimentada.");
  }

  public void infoJogoTabuleiro() {
    super.infoJogo();
    System.out.println("Tamanho tabuleiro: " + this.getTamanhoTabuleiro());
    System.out.println("Quantidade de peças: " + this.getQuantPecas());
  }

  // get set
  public String getTamanhoTabuleiro() {
    return tamanhoTabuleiro;
  }

  public void setTamanhoTabuleiro(String tamanhoTabuleiro) {
    this.tamanhoTabuleiro = tamanhoTabuleiro;
  }

  public int getQuantPecas() {
    return quantPecas;
  }

  public void setQuantPecas(int quantPecas) {
    this.quantPecas = quantPecas;
  }

}
