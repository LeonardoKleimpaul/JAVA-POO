package model;

import java.math.BigDecimal;
import java.sql.Date;

public class Produto {
  private Integer idProd;
  private String nomeProduto;
  private Date dataCadastro;
  private Integer quantidade;
  private BigDecimal preco;

  public Produto() {
  }

  public Produto(Integer idProd, String nomeProduto, Date dataCadastro, Integer quantidade, BigDecimal preco) {
    this.idProd = idProd;
    this.nomeProduto = nomeProduto;
    this.dataCadastro = dataCadastro;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  public Integer getIdProd() {
    return idProd;
  }

  public void setIdProd(Integer idProd) {
    this.idProd = idProd;
  }

  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public Date getDataCadastro() {
    return dataCadastro;
  }

  public void setDataCadastro(Date dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public BigDecimal getPreco() {
    return preco;
  }

  public void setPreco(BigDecimal preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Produto [dataCadastro=" + dataCadastro + ", idProd=" + idProd + ", nomeProduto=" + nomeProduto + ", preco="
        + preco + ", quantidade=" + quantidade + "]";
  }
  
  

}
