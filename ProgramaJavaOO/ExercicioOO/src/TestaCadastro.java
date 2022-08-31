public class TestaCadastro {
  public static void main(String[] args) {

    Cliente c = new Cliente("Jeferson", 230);
    Funcionario f = new Funcionario("Maria", 2500);
    Gerente g = new Gerente("Robson", 6000, "Gerente de vendas");
    CadastroPessoas cp = new CadastroPessoas();

    cp.cadastraPessoas(c);
    cp.cadastraPessoas(f);
    cp.cadastraPessoas(g);
    cp.imprimeCadastro();

  }

}
