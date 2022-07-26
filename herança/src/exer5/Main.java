package exer5;

public class Main {
  public static void main(String[] args) {

    Fornecedor f = new Fornecedor();

    f.setNome("Caue");
    f.setEndereco("R. Bastião, N.510");
    f.setTelefone("(49) 9.9988-96532");
    f.setValorCredito(50000);
    f.setValorDivida(20000);

    f.infoFornecedor();

    System.out.println("_____________________________________________________________");

    Empregado e = new Empregado();

    e.setNome("Natalia");
    e.setEndereco("R. Bastião, N.515");
    e.setTelefone("(49) 9.99814 5632");
    e.setCodSetor(101);
    e.setSalBase(2500);
    e.setImposto(7);

    e.infoEmpregado();

    System.out.println("_____________________________________________________________");

    Administrador a = new Administrador();

    a.setNome("Marcos");
    a.setEndereco("R. Bastião, N.520");
    a.setTelefone("(49) 9.9940 3372");
    a.setCodSetor(102);
    a.setSalBase(2500);
    a.setImposto(7);
    a.setAjudaDeCusto(2000);

    a.infoAdministrador();

    System.out.println("_____________________________________________________________");

    Operario o = new Operario();

    o.setNome("Pedro");
    o.setEndereco("R. Bastião, N.525");
    o.setTelefone("(49) 9.9805 6589");
    o.setCodSetor(103);
    o.setSalBase(2500);
    o.setImposto(7);
    o.setComissao(2);
    o.setValorProducao(25000);

    o.infoOperario();

    System.out.println("_____________________________________________________________");

    Vendedor v = new Vendedor();

    v.setNome("Carlos");
    v.setEndereco("R. Bastião, N.530");
    v.setTelefone("(49) 9.9822 6388");
    v.setCodSetor(104);
    v.setSalBase(2500);
    v.setImposto(7);
    v.setComissaoVendedor(2);
    v.setValorVendas(35000);

    v.infoVendedor();
  }

}
