package br.edu.unoesc.testejpa.app;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.edu.unoesc.testejpa.dao.DaoCargo;
import br.edu.unoesc.testejpa.dao.DaoFuncionario;
import br.edu.unoesc.testejpa.modelo.Cargo;
import br.edu.unoesc.testejpa.modelo.Funcionario;

public class App {

	public static void main(String[] args) {
		DaoFuncionario daoFuncionario = new DaoFuncionario();

		// Cadastra em variaveis locais os dados, para depois salvar no banco.
		//		Funcionario f1 = new Funcionario("Fulano",
		//				java.sql.Date.valueOf(LocalDate.now()),
		//				new BigDecimal("200.0"));

		//		Funcionario f2 = new Funcionario("Beltrana",
		//				java.sql.Date.valueOf("2022-12-25"),
		//				new BigDecimal("300.0"));

		//		Funcionario f3 = new Funcionario("Sicrano",
		//				java.sql.Date.valueOf("2022-12-25"),
		//				new BigDecimal("400.0"));

		// Salva os dados cadastrados nas variaveis locais no banco de dados. E mostra com o toString no metodo obterTodos
		//		System.out.println(daoFuncionario
		//				.salvar(f1)
		//				.salvar(f2)
		//				.salvar(f3)
		//				.obterTodos());

		// Mostra na tela, buscando pelo nome os funcionarios que contenham o parametro especificado.
		for (Funcionario f : daoFuncionario.buscarPorNome("ano")) {
			System.out.println(f.getNome() + " - "
					+ f.getSalario());
		}

		DaoCargo daoCargo = new DaoCargo();

		// Cadastra os cargos nas variaveis locais
		Cargo cargoTi = new Cargo(null,"TI");
		Cargo cargoMarketing = new Cargo(null,"Marketing");

		// Cadastra os funcionarios nas variaveis locais ja com seus cargos
		Funcionario f1 = new Funcionario("Fulano",
				java.sql.Date.valueOf(LocalDate.now()),
				new BigDecimal("200.0"), cargoTi);

		Funcionario f2 = new Funcionario("Beltrana",
				java.sql.Date.valueOf("2022-12-25"),
				new BigDecimal("300.0"), cargoMarketing);

		Funcionario f3 = new Funcionario("Sicrano",
				java.sql.Date.valueOf("2022-12-25"),
				new BigDecimal("400.0"), cargoTi);

		// Mostra na tela e envia para o banco os dados dos cargos
		System.out.println(daoCargo.salvar(cargoTi).salvar(cargoMarketing).obterTodos());

		daoCargo.fechar();

		// Envia para o banco os dados dos Funcionar ios
		daoFuncionario.salvar(f1).salvar(f2).salvar(f3);

		// Mostra na tela uma lista de funcionarios com os respectivos cargos
		//		List<Funcionario> funcionarios = daoFuncionario.obterTodos();
		//		for (Funcionario f : funcionarios) {
		//			System.out.println(f.getNome()+ " - "+ f.getCargo().getNome());
		//		}


		// Busca um funcionario pelo seu id
		System.out.println(daoFuncionario.buscarPorId(3).getNome());

		// Exclui um funcionario 
		//daoFuncionario.excluir(f3);

		System.out.println(daoFuncionario.obterTodos());




		daoFuncionario.fechar();
	}

}
