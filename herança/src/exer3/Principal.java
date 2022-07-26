package exer3;

public class Principal {
  public static void main(String[] args) {

    Assistente a = new Assistente();
    AssistenteAdministrativo aAd = new AssistenteAdministrativo();
    AssistenteTecnico aTec = new AssistenteTecnico();

    a.setNome("Lucas");
    a.setSalario(2000);
    a.setMatricula(752608);
    a.addAumento(200);

    a.ganhoAnual();
    a.exibeDados();

    System.out.println("-----------------------------------------");

    aTec.setNome("Joana");
    aTec.setSalario(3000);
    aTec.setMatricula(752600);
    aTec.bonusSalarial(500);

    aTec.ganhoAnual();
    aTec.exibeDados();

    System.out.println("-----------------------------------------");

    aAd.setNome("Roger");
    aAd.setSalario(2500);
    aAd.setMatricula(752604);
    aAd.adicionalNoturno(300);

    aAd.ganhoAnual();
    aAd.exibeDados();

  }

}
