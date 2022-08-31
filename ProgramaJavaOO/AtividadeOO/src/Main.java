import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      ArrayList<Produto> estoque = new ArrayList<>();
      Venda venda = new Venda();

      estoque.add(new Produto("Arroz", 15.90, 2));
      estoque.add(new Produto("Feijão", 12.90, 90));
      estoque.add(new Produto("Coca-Cola", 8, 100));
      estoque.add(new Produto("Cachaça-da-Boa", 10, 30));

      int opcao, pagamento;
      do {
        System.out.println("+-----------------       Mercadinho do seu Zé       -----------------+\n");
        for (int i = 0; i < estoque.size(); i++) {
          System.out.println(
              "Código " + i + " - Produto: " + estoque.get(i).getNome() + " | Preço: R$" + estoque.get(i).getPreco());
        }
        System.out.println("\n+--------------------------------------------------------------------+\n");
        System.out.println("Digite a opção que deseja realizar: ");
        System.out.println("1 - Vender");
        System.out.println("2 - Visualizar Venda");
        System.out.println("3 - Finalizar Venda");
        System.out.println("4 - Limpar Venda");
        System.out.println("5 - Sair");
        opcao = scan.nextInt();
        switch (opcao) {
          case 1:
            System.out.println("Digite o código do produto: ");
            venda.adicionarItemVenda(estoque.get(scan.nextInt()));
            break;
          case 2:
            System.out.println(venda.visualizarVenda());
            break;
          case 3:
            System.out.println("Selecione a forma de pagamento: ");
            System.out.println("1 - Dinheiro");
            System.out.println("2 - Cheque");
            System.out.println("3 - Cartão");
            pagamento = scan.nextInt();
            switch (pagamento) {
              case 1:
                Pagamento dinheiro = new Pagamento();
                dinheiro.selecionarTipoPagamento(1);
                venda.concluirVenda(dinheiro);
                System.out.println(venda.visualizarVenda() + "\n" + (dinheiro.realizarPagamento(dinheiro)));
                venda.limparVenda();
                break;
              case 2:
                Pagamento cheque = new Pagamento();
                cheque.selecionarTipoPagamento(2);
                venda.concluirVenda(cheque);
                System.out.println(venda.visualizarVenda() + "\n" + (cheque.realizarPagamento(cheque)));
                venda.limparVenda();
                break;
              case 3:
                Pagamento cartao = new Pagamento();
                cartao.selecionarTipoPagamento(3);
                venda.concluirVenda(cartao);
                System.out.println(venda.visualizarVenda() + "\n" + (cartao.realizarPagamento(cartao)));
                venda.limparVenda();
                break;
              default:
                break;
            }
            break;
          case 4:
            venda.limparVenda();
            break;
          default:
            break;
        }
      } while (opcao != 5);
    }
  }
}
