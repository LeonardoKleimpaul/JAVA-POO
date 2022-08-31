public class Cliente extends Pessoa {

  private int codigo;

  public Cliente() {
  }

  public Cliente(String nome, int codigo) {
    super(nome);
    this.codigo = codigo;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  @Override
  public String imprimeDados() {
    return "\nNome: " + getNome() +
        "\nCodigo: " + getCodigo();

  }
}
