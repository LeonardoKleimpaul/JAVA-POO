package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.FabricaConexao;
import model.Produto;

public class ProdutoDAO implements IProdutoDAO {
  private Connection conexao;

  @Override
  public List<Produto> listarTodos() {
    conexao = FabricaConexao.getConexao();
    List<Produto> lista = new ArrayList<>();

    try {
      String sql = "SELECT * FROM produto";
      PreparedStatement stmt = this.conexao.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();
      while (rs.next()) {
        Produto p = new Produto();

        p.setIdProd(rs.getInt("id_prod"));
        p.setNomeProduto(rs.getString("nome_prod"));
        p.setDataCadastro(rs.getDate("data_cadastro"));
        p.setQuantidade(rs.getInt("quantidade"));
        p.setPreco(rs.getBigDecimal("preco"));

        lista.add(p);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } finally {
      FabricaConexao.fechaConexao();
    }
    return lista;
  }

  @Override
  public void adicionar(Produto p) {

  }

  @Override
  public void alterar(Produto p) {

  }

  @Override
  public void excluir(Integer id) {

  }

  @Override
  public Produto buscarPorId(Integer id) {

    return null;
  }

}
