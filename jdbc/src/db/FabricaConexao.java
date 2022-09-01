package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
  private static Connection conexao = null;

  private FabricaConexao() {
  }

  public static Connection getConexao() {
    try {
      String url = "jdbc:mysql://localhost/unoesc_trabalho_CRUD";
      String user = "root";
      String password = "147806";

      conexao = DriverManager.getConnection(url, user, password);
      // System.out.println("Conexão realizada com sucesso!");

      return conexao;
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  public static void fechaConexao() {
    if (conexao != null) {
      try {
        conexao.close();
        // System.out.println("Conexão fechada com sucesso!");
      } catch (SQLException e) {
        throw new RuntimeException(e.getMessage());
      }
    }
  }
}