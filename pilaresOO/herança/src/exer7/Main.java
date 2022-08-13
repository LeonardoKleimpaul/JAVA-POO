package exer7;

public class Main {
  public static void main(String[] args) {

    Animal a = new Animal("Camelo", "Amarelo", "Terra", 150, 4, 2);

    System.out.println("--------------------------");
    a.dados();
    System.out.println("--------------------------");

    Peixe p = new Peixe("Tubarao", "Cinzento", "Mar", 300, 0, 1.5f, "Barbatanas e cauda");

    p.dados();
    System.out.println("--------------------------");

    Mamifero m = new Mamifero("Urso-do-canadá", "Vermelho", "Terra", 180, 4, 0.5f, "Mel");

    m.dados();
    System.out.println("--------------------------");

    System.out.println("------------Alterando dados--------------");

    a.alteraNome("Papagaio");
    a.aletraCor("Verde");
    a.alteraAmbiente("Terra e Ar");
    a.alteraComprimento(37);
    a.aletraPatas(2);
    a.aletraVelocidade(5);

    p.alteraNome("Sapo");
    p.aletraCor("Verde");
    p.alteraAmbiente("Terra e Água");
    p.alteraComprimento(15);
    p.aletraPatas(4);
    p.aletraVelocidade(4);
    p.setCaracteristica("Pula");

    m.alteraNome("Gato");
    m.aletraCor("Laranja");
    m.alteraAmbiente("Terra");
    m.alteraComprimento(45);
    m.aletraPatas(4);
    m.aletraVelocidade(5);
    m.setAlimento("Rato");

    a.dados();
    System.out.println("--------------------------");
    p.dados();
    System.out.println("--------------------------");
    m.dados();
    System.out.println("--------------------------");

  }

}
