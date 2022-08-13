package exerc1;

public class Principal {
  public static void main(String[] args) {

    Agenda agenda = new Agenda();
    int retorno;

    agenda.armazenaPessoa("Leonardo", 20, 1.75);
    agenda.armazenaPessoa("Maria", 21, 1.62);
    agenda.armazenaPessoa("Carlos", 23, 1.77);
    agenda.armazenaPessoa("Claudia", 33, 1.71);
    agenda.armazenaPessoa("Joao", 28, 1.79);
    agenda.armazenaPessoa("Pedro", 18, 1.80);
    agenda.armazenaPessoa("Laura", 19, 1.62);
    agenda.armazenaPessoa("Marcos", 60, 1.76);
    agenda.armazenaPessoa("Natalia", 26, 1.68);
    agenda.armazenaPessoa("Claudio", 35, 1.74);

    agenda.imprimeAgenda();

    System.out.println("--------------------------------------------------");

    agenda.removePessoa("Natalia");
    agenda.removePessoa("Roger");

    agenda.imprimeAgenda();

    System.out.println("--------------------------------------------------");

    retorno = agenda.buscarPessoa("Leonardo");

    System.out.println("--------------------------------------------------");

    agenda.imprimePessoa(1);
  }

}
