package ativ1;

public class Principal {
  public static void main(String[] args) {

    Pessoa p = new Pessoa();

    p.setNome("Leonardo Kleimpaul");
    p.setAnoNasc(2002);
    p.setAltura(1.75);


    p.exibirPessoa();
    p.calcIdade();
  }

}
