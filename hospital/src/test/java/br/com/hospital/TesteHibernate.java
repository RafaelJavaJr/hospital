package br.com.hospital;

import java.util.List;

import org.junit.Test;

import br.com.model.Pessoa;
import br.com.dao.DaoGeneric;
import br.com.dao.DaoGeneric;

public class TesteHibernate {
	
	@Test
	public void testeHibernate() {
		DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setLogin("rafael");
		pessoa.setNome("Rafael");
		pessoa.setSobrenome("Ferreira Lima");
		pessoa.setSenha("rafael");
		pessoa.setPerfil("ADMINISTRATIVO");
		
		daoGeneric.salvar(pessoa);
	}
	
	@Test
	public void testeBuscar() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<Pessoa> daoGenerico = new DaoGeneric<Pessoa>();
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(3l);
		
		daoGenerico.pesquisar(pessoa);
		
		pessoa = daoGenerico.pesquisar(pessoa);
		
		System.out.println(pessoa);
	}
	@Test
	public void testeBuscar2() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<Pessoa> daoGenerico = new DaoGeneric<Pessoa>();
		
		Pessoa pessoa = daoGenerico.pesquisar(4L, Pessoa.class);
		
		System.out.println(pessoa);
	}
	@Test
	public void testeUpdate() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<Pessoa> daoGenerico = new DaoGeneric<Pessoa>();
		
		Pessoa pessoa = daoGenerico.pesquisar(5L, Pessoa.class);
		
		pessoa.setNome("Nome Atualizado");
		
		pessoa = daoGenerico.UpdateMerge(pessoa);
		
		System.out.println(pessoa);
	}

	@Test
	public void testeDelete() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<Pessoa> daoGenerico = new DaoGeneric<Pessoa>();
		
		Pessoa pessoa = daoGenerico.pesquisar(5L, Pessoa.class);
		
		daoGenerico.deletarProId(pessoa);
		
	}


	@Test
	public void testeConsultar() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<Pessoa> daoGenerico = new DaoGeneric<Pessoa>();
		
		List<Pessoa> list = daoGenerico.listar(Pessoa.class);
		
		for (Pessoa pessoaBean : list) {
			System.out.println(pessoaBean);
			System.out.println("----------------------------------------");
		}
		Pessoa pessoa = daoGenerico.pesquisar(3L, Pessoa.class);
		
		daoGenerico.deletarProId(pessoa);
		
	}

	@Test
	public void testeQueryList() {
		DaoGeneric<Pessoa> daoGenerico = new DaoGeneric<Pessoa>();
		List<Pessoa> list = daoGenerico.getEntityManager().createQuery(" from Pessoa").getResultList();
		
		for (Pessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
		}
	}

}


