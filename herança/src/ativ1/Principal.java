package ativ1;

public class Principal {
  public static void main(String[] args) {

    IngressoVip vip = new IngressoVip();

    vip.setValor(100);
    vip.setValorAdicional(50);

    System.out.println(vip.toString());
  }

}
