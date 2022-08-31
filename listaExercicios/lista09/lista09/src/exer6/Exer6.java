package exer6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exer6 {
  public static void main(String[] args) {
    Scanner sc = null;
    try {
      // Cria um objeto representando o arquivo em disco
      File arquivo = new File("c:\\temp\\arquivo.txt");

      // Abre o arquivo usando o objeto arquivado
      sc = new Scanner(arquivo);
      // Enquanto houver linhas a serem lidas
      while (sc.hasNextLine()) {
        // Lê a proxima linha e a mostra na tela
        System.out.println(sc.nextLine());
      }

    } catch (FileNotFoundException e) {
      System.out.println("Arquivo nao existe.");
    } finally {
      sc.close();
    }
  }
}
