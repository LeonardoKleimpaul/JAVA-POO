public class Pagamento {

  private int tipoPagamento;

  public Pagamento() {
  }

  public int getTipoPagamento() {
    return tipoPagamento;
  }

  public void setTipoPagamento(int tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  public void selecionarTipoPagamento(int tpag) {
    setTipoPagamento(tpag);
  }

  public String realizarPagamento(Pagamento pag) {
    String pagamento = "Pagamento realizado!\nForma de pagamento: " + getTipoPagamento();
    if (pag.getTipoPagamento() == 1) {
      pagamento += " - Dinheiro";
    } else if (pag.getTipoPagamento() == 2) {
      pagamento += " - Cheque";
    } else if (pag.getTipoPagamento() == 3) {
      pagamento += " - Cartão";
    }
    return pagamento;
  }

}
