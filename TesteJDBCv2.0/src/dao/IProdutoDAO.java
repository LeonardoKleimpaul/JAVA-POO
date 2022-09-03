package dao;

import java.util.List;

import modelo.Produto;

public interface IProdutoDAO {
	void salvar(Produto p);
	void excluir(Integer id);
	List<Produto> listarTodos();
	Produto buscarPorId(Integer id);
	List<Produto> buscarPorNome(String nome);
	int getNumeroRegistros();
}
