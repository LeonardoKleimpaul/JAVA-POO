package exer3;

public class Main {
  public static void main(String[] args) {

    Assalariado a = new Assalariado("Claudia", "Souza", "089.699.584-89", 1600);
    Comissionado c = new Comissionado("João", "Moura", "082.422.949-82", 100000, 3);
    Horista h = new Horista("Cleber", "Silva", "222.565.333-89", 15, 200);

    a.infoFuncionarios();
    System.out.println("Salario: " + a.vencimento());

    c.infoFuncionarios();
    System.out.println("Salario: " + c.vencimento());

    h.infoFuncionarios();
    System.out.println("Salario: " + h.vencimento());
  }

}
