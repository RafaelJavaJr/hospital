package br.com.hospital;

import org.junit.Test;

import br.com.dao.DaoGeneric;
import br.com.jpautil.JPAUtil;
import br.com.model.PessoaBean;

public class TesteHibernate {
	
	@Test
	public void testeHibernate() {
		DaoGeneric<PessoaBean> daoGeneric = new DaoGeneric<PessoaBean>();
		
		PessoaBean pessoa = new PessoaBean();
		
		pessoa.setLogin("teste");
		pessoa.setNome("Rafael");
		pessoa.setSobrenome("Lima");
		pessoa.setSenha("teste");
		pessoa.setNivel("ADMINISTRATIVO");
		
		daoGeneric.salvar(pessoa);
	}

}


