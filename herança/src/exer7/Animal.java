package exer7;

public class Animal {

  private String nome;
  private String cor;
  private String ambiente;
  private int comprimento;
  private int patas;
  private float velocidade;

  public Animal() {
  }

  public Animal(String nome, String cor, String ambiente, int comprimento, int patas, float velocidade) {
    this.nome = nome;
    this.cor = cor;
    this.ambiente = ambiente;
    this.comprimento = comprimento;
    this.patas = patas;
    this.velocidade = velocidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }

  public int getComprimento() {
    return comprimento;
  }

  public void setComprimento(int comprimento) {
    this.comprimento = comprimento;
  }

  public int getPatas() {
    return patas;
  }

  public void setPatas(int patas) {
    this.patas = patas;
  }

  public float getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(float velocidade) {
    this.velocidade = velocidade;
  }

  public void alteraNome(String nome) {
    setNome(nome);
  }

  public void alteraComprimento(int comprimento) {
    setComprimento(comprimento);
  }

  public void aletraPatas(int patas) {
    setPatas(patas);
  }

  public void aletraCor(String cor) {
    setCor(cor);
  }

  public void alteraAmbiente(String ambiente) {
    setAmbiente(ambiente);
  }

  public void aletraVelocidade(float velocidade) {
    setVelocidade(velocidade);
  }

  public void dados() {
    System.out.println("Nome: " + getNome());
    System.out.println("Cor: " + getCor());
    System.out.println("Ambiente: " + getAmbiente());
    System.out.println("Comprimento: " + getComprimento() + "cm");
    System.out.println("Patas: " + getPatas());
    System.out.println("Velocidade: " + getVelocidade() + " m/s");
  }

}
