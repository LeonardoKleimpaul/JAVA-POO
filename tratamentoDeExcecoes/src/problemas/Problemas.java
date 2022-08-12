package problemas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Problemas {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try {
      int[] arranjo = { 10, 20, 30 };

      System.out.println("Array");
      System.out.println(arranjo[0]);
      // System.out.println(arranjo[3]);

      List<Integer> numeros = new ArrayList<>();
      numeros.add(10);
      numeros.add(20);
      numeros.add(30);
      System.out.println("\nLista:");
      System.out.println(numeros.get(0));
      // System.out.println(numeros.get(10));

      Locale.setDefault(Locale.US);

      // System.out.print("Digite um numero com parte decimal (use ponto): ");
      // double numero = scan.nextDouble();
      // System.out.println(numero);

      // numero = Double.parseDouble("10,25");

      // System.out.println(10 / 0);

      String frase = null;
      System.out.println(frase.toUpperCase());

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Erro de acesso ao array");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Posição invalida");
      System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println("Entrada Invalida");
      System.out.println(e.getMessage());
    } catch (NumberFormatException e) {
      System.out.println("Formatação incorreta");
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println("Divisao nao pode ser feita");
      System.out.println(e.getMessage());
    } catch (NullPointerException e) {
      System.out.println("Variavel string vazia");
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Ocorreu um erro não identificado");
    } finally {
      scan.close();
    }

  }
}
