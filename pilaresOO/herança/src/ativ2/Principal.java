package ativ2;

public class Principal {
  public static void main(String[] args) {

    Tecnico tec = new Tecnico();
    Docente doc = new Docente();

    tec.setNome("Rogerio");
    tec.setFuncao("Técnico em informática");
    tec.setSal(1800);
    tec.setHoraExtra(350);

    doc.setNome("Leandro");
    doc.setFuncao("Professor de Matemática");
    doc.setSal(2800);
    doc.setNivel(5);

    tec.infoTecnico();
    tec.calcSalario();

    System.out.println("");

    doc.infoDocente();
    doc.calcSalario();

  }

}
