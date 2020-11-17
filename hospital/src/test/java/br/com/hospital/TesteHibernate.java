package br.com.hospital;

import java.util.List;

import org.junit.Test;

import br.com.dao.DaoGeneric;
import br.com.model.PessoaBean;
import br.com.dao.DaoGeneric;
import br.com.model.PessoaBean;

public class TesteHibernate {
	
	@Test
	public void testeHibernate() {
		DaoGeneric<PessoaBean> daoGeneric = new DaoGeneric<PessoaBean>();
		
		PessoaBean pessoa = new PessoaBean();
		
		pessoa.setLogin("rafael");
		pessoa.setNome("Rafael");
		pessoa.setSobrenome("Ferreira Lima");
		pessoa.setSenha("rafael");
		pessoa.setNivel("ADMINISTRATIVO");
		
		daoGeneric.salvar(pessoa);
	}
	
	@Test
	public void testeBuscar() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<PessoaBean> daoGenerico = new DaoGeneric<PessoaBean>();
		
		PessoaBean pessoa = new PessoaBean();
		
		pessoa.setId(3l);
		
		daoGenerico.pesquisar(pessoa);
		
		pessoa = daoGenerico.pesquisar(pessoa);
		
		System.out.println(pessoa);
	}
	@Test
	public void testeBuscar2() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<PessoaBean> daoGenerico = new DaoGeneric<PessoaBean>();
		
		PessoaBean pessoa = daoGenerico.pesquisar(4L, PessoaBean.class);
		
		System.out.println(pessoa);
	}
	@Test
	public void testeUpdate() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<PessoaBean> daoGenerico = new DaoGeneric<PessoaBean>();
		
		PessoaBean pessoa = daoGenerico.pesquisar(5L, PessoaBean.class);
		
		pessoa.setNome("Nome Atualizado");
		
		pessoa = daoGenerico.UpdateMerge(pessoa);
		
		System.out.println(pessoa);
	}

	@Test
	public void testeDelete() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<PessoaBean> daoGenerico = new DaoGeneric<PessoaBean>();
		
		PessoaBean pessoa = daoGenerico.pesquisar(5L, PessoaBean.class);
		
		daoGenerico.deletarProId(pessoa);
		
	}


	@Test
	public void testeConsultar() {
		//HibernateUtil.getEntityManager();
		DaoGeneric<PessoaBean> daoGenerico = new DaoGeneric<PessoaBean>();
		
		List<PessoaBean> list = daoGenerico.listar(PessoaBean.class);
		
		for (PessoaBean pessoaBean : list) {
			System.out.println(pessoaBean);
			System.out.println("----------------------------------------");
		}
		PessoaBean pessoa = daoGenerico.pesquisar(3L, PessoaBean.class);
		
		daoGenerico.deletarProId(pessoa);
		
	}

	@Test
	public void testeQueryList() {
		DaoGeneric<PessoaBean> daoGenerico = new DaoGeneric<PessoaBean>();
		List<PessoaBean> list = daoGenerico.getEntityManager().createQuery(" from PessoaBean").getResultList();
		
		for (PessoaBean usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
		}
	}

}


