package main;

import model.Gatos;
import model.Guepardos;
import model.Jaguatiricas;
import model.Leoes;
import model.Leopardos;
import model.Oncas;
import model.Panteras;
import model.Pumas;
import model.Tigres;

public class Main {
  public static void main(String[] args) {

    Gatos gatos = new Gatos("Gatos");

    System.out.println(gatos.getTipoFelino());
    System.out.println("----------");
    System.out.println(gatos.pelos());
    System.out.println(gatos.garras());
    System.out.println(gatos.ficoEmCasa());

    System.out.println("");

    Guepardos guepardos = new Guepardos("Guepardos");

    System.out.println("");
    System.out.println(guepardos.getTipoFelino());
    System.out.println("----------");
    System.out.println(guepardos.pelos());
    System.out.println(guepardos.garras());
    System.out.println(guepardos.garrasSemirretrateis());

    Jaguatiricas jaguatiricas = new Jaguatiricas("Jaguatiricas");

    System.out.println("");
    System.out.println(jaguatiricas.getTipoFelino());
    System.out.println("----------");
    System.out.println(jaguatiricas.pelos());
    System.out.println(jaguatiricas.garras());

    Leoes leoes = new Leoes("Leões");

    System.out.println("");
    System.out.println(leoes.getTipoFelino());
    System.out.println("----------");
    System.out.println(leoes.pelos());
    System.out.println(leoes.garras());
    System.out.println(leoes.rugir());
    System.out.println(leoes.vivoEmGrupo());

    Leopardos leopardos = new Leopardos("Leopardos");

    System.out.println("");
    System.out.println(leopardos.getTipoFelino());
    System.out.println("----------");
    System.out.println(leopardos.pelos());
    System.out.println(leopardos.garras());
    System.out.println(leopardos.rugir());
    System.out.println(leopardos.consegueViverEmArvores());

    Oncas oncas = new Oncas("Onças");

    System.out.println("");
    System.out.println(oncas.getTipoFelino());
    System.out.println("----------");
    System.out.println(oncas.pelos());
    System.out.println(oncas.garras());
    System.out.println(oncas.rugir());

    Panteras panteras = new Panteras("Panteras");

    System.out.println("");
    System.out.println(panteras.getTipoFelino());
    System.out.println("----------");
    System.out.println(panteras.pelos());
    System.out.println(panteras.garras());
    System.out.println(panteras.consegueViverEmArvores());

    Pumas pumas = new Pumas("Pumas");

    System.out.println("");
    System.out.println(pumas.getTipoFelino());
    System.out.println("----------");
    System.out.println(pumas.pelos());
    System.out.println(pumas.garras());

    Tigres tigres = new Tigres("Tigres");

    System.out.println("");
    System.out.println(tigres.getTipoFelino());
    System.out.println("----------");
    System.out.println(tigres.pelos());
    System.out.println(tigres.garras());
    System.out.println(tigres.rugir());
    System.out.println(tigres.nadoExcelentemente());
  }

}
