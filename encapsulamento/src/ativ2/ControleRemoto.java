package ativ2;

public class ControleRemoto {

  Televisao tv = new Televisao();

  public ControleRemoto() {
  }

  public void aumentarVol() {
    tv.setVolume(tv.getVolume() + 1);
    System.out.println("Volume: " + tv.getVolume());
  }

  public void abaixarVol() {
    tv.setVolume(tv.getVolume() - 1);
    System.out.println("Volume: " + tv.getVolume());
  }

  public void aumentarCanal() {
    tv.setCanal(tv.getCanal() + 1);
    System.out.println("Canal: " + tv.getCanal());
  }

  public void abaixarCanal() {
    tv.setCanal(tv.getCanal() - 1);
    System.out.println("Canal: " + tv.getCanal());
  }

  public void checarInfo() {
    System.out.println("Canal :" + tv.getCanal());
    System.out.println("Volume: " + tv.getVolume());
  }

  public void selecionarCanal() {
    tv.setCanal(10);
  }

}
