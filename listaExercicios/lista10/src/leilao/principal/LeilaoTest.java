package leilao.principal;

import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import leilao.dominio.Avaliador;
import leilao.dominio.Lance;
import leilao.dominio.Leilao;
import leilao.dominio.Usuario;

public class LeilaoTest {
  @Test
  public void testarLancesOrdemCrescente() {
    // Parte 1: Cenário
    Usuario joao = new Usuario("João");
    Usuario jose = new Usuario("José");
    Usuario maria = new Usuario("Maria");

    System.out.println("Inicio do leilão");
    System.out.println("================");

    Leilao leilao = new Leilao("PlayStation 5");

    leilao.propoe(new Lance(maria, 2500.0));
    leilao.propoe(new Lance(joao, 3000.0));
    leilao.propoe(new Lance(jose, 4000.0));

    // Parte 2: Ação
    Avaliador avaliador = new Avaliador();
    avaliador.avalia(leilao);

    // Parte 3: Verificação
    double maiorLanceEsperado = 4000;
    double menorLanceEsperado = 2500;

    Assertions.assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
    Assertions.assertEquals(menorLanceEsperado, avaliador.getMenorLance());
  }

  @Test
  public void testarLancesOrdemDecrescente() {
    // Parte 1: Cenário
    Usuario joao = new Usuario("João");
    Usuario jose = new Usuario("José");
    Usuario maria = new Usuario("Maria");

    System.out.println("Inicio do leilão");
    System.out.println("================");

    Leilao leilao = new Leilao("PlayStation 5");

    leilao.propoe(new Lance(maria, 2500.0));
    leilao.propoe(new Lance(joao, 3000.0));
    leilao.propoe(new Lance(jose, 4000.0));

    // Parte 2: Ação
    Avaliador avaliador = new Avaliador();
    avaliador.avalia(leilao);

    // Parte 3: Verificação
    Collections.reverse(leilao.getLances());

  }

  @Test
  public void testarTodosOsLancesComMesmoValor() {
    // Parte 1: Cenário
    Usuario joao = new Usuario("João");
    Usuario jose = new Usuario("José");
    Usuario maria = new Usuario("Maria");

    System.out.println("Inicio do leilão");
    System.out.println("================");

    Leilao leilao = new Leilao("PlayStation 5");

    leilao.propoe(new Lance(maria, 2500.0));
    leilao.propoe(new Lance(joao, 3000.0));
    leilao.propoe(new Lance(jose, 4000.0));

    // Parte 2: Ação
    Avaliador avaliador = new Avaliador();
    avaliador.avalia(leilao);

  }
}
