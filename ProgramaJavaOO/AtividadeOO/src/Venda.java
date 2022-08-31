import java.util.ArrayList;

public class Venda {

  private double vlrTotal;
  private ArrayList<Produto> produtos = new ArrayList<>();

  public Venda() {
  }

  public double getVlrTotal() {
    return vlrTotal;
  }

  public void setVlrTotal(double vlrTotal) {
    this.vlrTotal = vlrTotal;
  }

  public ArrayList<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(ArrayList<Produto> produtos) {
    this.produtos = produtos;
  }

  public void adicionarItemVenda(Produto p) {
    if (p.verificarEstoque(p)) {
      produtos.add(p);
      setVlrTotal(getVlrTotal() + p.getPreco());
      p.setQuantEstoque(p.getQuantEstoque() - 1);
    } else {
      System.out.println("Produto sem estoque.");
    }
  }

  public String visualizarVenda() {
    String lista = "";
    for (int i = 0; i < produtos.size(); i++) {
      lista += "Produto: " + this.produtos.get(i).getNome() + " | Preço: R$" + this.produtos.get(i).getPreco() + "\n";
    }
    return "Total da Compra: R$" + getVlrTotal() + "\n" + lista;
  }

  public String concluirVenda(Pagamento pag) {
    return "Total da Compra: R$" + getVlrTotal() + "\n";
  }

  public void limparVenda() {
    this.produtos.clear();
    setVlrTotal(0);
  }
}