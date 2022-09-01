package app;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

import dao.PessoaDAO;
import model.Pessoa;

public class Principal {
  public static void main(String[] args) {
    SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
    Locale.setDefault(new Locale("pt", "BR"));
    NumberFormat fm = NumberFormat.getCurrencyInstance();

    PessoaDAO dao = new PessoaDAO();

    // Pessoa pessoa = new Pessoa(null, "Marcio",
    // java.sql.Date.valueOf("2002-03-20"), new BigDecimal("2500.00"));
    // dao.adicionar(pessoa);

    // Pessoa p = new Pessoa(3, "Bruna", java.sql.Date.valueOf("2000-04-22"), new
    // BigDecimal("20000.00"));
    // dao.alterar(p);

    dao.excluir(3);

    List<Pessoa> lista = dao.listarTodos();

    System.out.println("+-----------------+");
    System.out.println("|Lista de Pessoas|");
    System.out.println("+-----------------+");
    System.out.println("");

    for (Pessoa pessoas : lista) {
      System.out.println("Id.............: " + pessoas.getIdPessoa());
      System.out.println("Nome...........: " + pessoas.getNomePessoa());
      System.out.println("Data Nascimento: " + fd.format(pessoas.getDataNascimento()));
      System.out.println("Salário........: " + fm.format(pessoas.getSalario()));
      System.out.println("");
    }

    Pessoa pessoas = dao.buscarPorId(6);
    if (pessoas != null) {
      System.out.println("Id.............: " + pessoas.getIdPessoa());
      System.out.println("Nome...........: " + pessoas.getNomePessoa());
      System.out.println("Data Nascimento: " + fd.format(pessoas.getDataNascimento()));
      System.out.println("Salário........: " + fm.format(pessoas.getSalario()));
      System.out.println("");
    } else {
      System.out.println("Pessoa não encontrada!");
    }
  }
}
