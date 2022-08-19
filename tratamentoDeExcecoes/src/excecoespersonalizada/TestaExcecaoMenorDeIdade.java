package excecoespersonalizada;

public class TestaExcecaoMenorDeIdade {
  private static void verficaIdadeEmpregado(int idade) throws MenorDeIdadeException {
    if (idade < 18) {
      throw new MenorDeIdadeException("Empregado não pode ser menor de idade", idade);
    }

    System.out.println("Idade ok!");
  }

  private static void testaIdadeEmpregado(int idade) {
    try {
      verficaIdadeEmpregado(idade);
    } catch (MenorDeIdadeException e) {
      System.out.println(e.getMessage() + " - " + e.getIdade());
    }
  }

  public static void main(String[] args) {
    testaIdadeEmpregado(42);
    testaIdadeEmpregado(17);
    testaIdadeEmpregado(18);
  }
}
