import java.util.ArrayList;

public class CadastroPessoas {

  ArrayList<Pessoa> listapessoas = new ArrayList<>();

  public void cadastraPessoas(Pessoa p) {
    listapessoas.add(p);
  }

  public void imprimeCadastro() {
    for (int i = 0; i < listapessoas.size(); i++) {
      System.out.println(listapessoas.get(i).imprimeDados());
    }
  }

}