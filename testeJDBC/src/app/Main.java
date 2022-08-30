package app;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import dao.ProdutoDAO;
import model.Produto;

public class Main {
  public static void main(String[] args) {
    SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
    Locale.setDefault(new Locale("pt", "BR"));
    NumberFormat fm = NumberFormat.getCurrencyInstance();

    ProdutoDAO dao = new ProdutoDAO();

    List<Produto> lista = dao.listarTodos();

    System.out.println("Lista de Produtos");
    System.out.println("-----------------");
    System.out.println("");

    for (Produto produto : lista) {
       System.out.println("Id...........: " + produto.getIdProd());
       System.out.println("Nome Produto.: " + produto.getNomeProduto());
       System.out.println("Data Cadastro: " + fd.format(produto.getDataCadastro()));
       System.out.println("Quantidade...: " + produto.getQuantidade());
       System.out.println("Preço........: " + fm.format(produto.getPreco()));
    }
  }
  
}
