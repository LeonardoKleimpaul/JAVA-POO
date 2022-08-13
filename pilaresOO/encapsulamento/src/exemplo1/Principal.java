package exemplo1;

public class Principal {
  public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		
		controle.aumentarVolume();
		controle.diminuirVolume();
		
		controle.aumentarCanal();
		controle.diminuirCanal();
		
		controle.escolherCanal(10);
		controle.infoTv();

	}
  
}
