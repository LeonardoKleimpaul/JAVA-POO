package exemplos;

public class Principal {
  public static void main(String[] args) {

    JogoTabuleiro tabuleiro = new JogoTabuleiro();

    tabuleiro.setNome("Catan");
    tabuleiro.setDistribuidora("Devir");
    tabuleiro.setNrJogadores(4);
    tabuleiro.setFaixaEtaria(10);
    tabuleiro.setTamanhoTabuleiro("40x40");
    tabuleiro.setQuantPecas(60);

    // metodos superclasse
    tabuleiro.infoJogoTabuleiro();
    tabuleiro.jogar();

    // metodos subclasse
    tabuleiro.setupTabuleiro();
    tabuleiro.moverPeca();

    JogoCartas cartas = new JogoCartas();

    cartas.setNome("Taco Gato");
    cartas.setDistribuidora("Papper Games");
    cartas.setNrJogadores(8);
    cartas.setFaixaEtaria(6);
    cartas.setTamanhoCartas("Tamanho padrão.");
    cartas.setQuantCartas(60);
    cartas.infoJogoCartas();

    cartas.comprarCarta();
    cartas.descartarCarta();
    cartas.jogarCarta();

    JogoDados dados = new JogoDados();

    dados.setNome("Bang Dice Game");
    dados.setDistribuidora("Galápagos Jogos");
    dados.setNrJogadores(8);
    dados.setFaixaEtaria(12);
    dados.setTipoDado("Quadrado");
    dados.setQuantDados(80);

    dados.infoJogoDados();
    dados.arremessarDado();
  }

}
