package exer1;

public class Principal {
  public static void main(String[] args) {

    Empregado e = new Empregado("Caue", 2000);
    Gerente g = new Gerente("Maria", 3500, "Contabilidade");
    Vendedor v = new Vendedor("João", 1500, 10);

    System.out.println(e.toString());
    System.out.println("");
    System.out.println(g.toString());
    System.out.println("");
    v.calcSal();
    System.out.println(v.toString());

  }

}
