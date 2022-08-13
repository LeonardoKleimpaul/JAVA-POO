package exerc2;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      Elevador elevador = new Elevador();
      int opcao;

      do {
        System.out.println("");
        System.out.println("1 - Inicializar Elevador.");
        System.out.println("2 - Entrar no Elevador.");
        System.out.println("3 - Sair do Elevador.");
        System.out.println("4 - Subir um andar.");
        System.out.println("5 - Descer um andar.");
        System.out.println("6 - Encerrar.");
        opcao = scan.nextInt();

        switch (opcao) {
          case 1:
            elevador.inicializarElevador(10, 6);
            break;

          case 2:
            elevador.entrarElevador();
            break;

          case 3:
            elevador.sairElevador();
            break;

          case 4:
            elevador.subirElevador();
            break;

          case 5:
            elevador.descerElevador();
            break;

          default:
            break;
        }
      } while (opcao != 6);
    }
  }

}
