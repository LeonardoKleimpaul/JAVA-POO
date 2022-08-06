package teste;
import java.util.ArrayList;

public class ExemploForEach {

  public static void main(String[] args) {
    
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    int n1 = 10, n2 = 20, n3 = 30;

    numeros.add(n1);
    numeros.add(n2);
    numeros.add(n3);

      for (Integer numero : numeros) {
        System.out.println(numero);
      }
  }
  
}
