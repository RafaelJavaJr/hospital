package br.com.repository;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.service.spi.InjectService;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

import br.com.jpautil.JPAUtil;
import br.com.model.Pessoa;

public class IDaoPessoaImpl implements IDaoPessoa {
	
	private EntityManager entityManager;

	@Override
	public Pessoa consultarUsuario(String login, String senha) {
		
		Pessoa pessoa = null;
		EntityManager entityManager = JPAUtil.getEntityManager(); 
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		pessoa = (Pessoa) entityManager.createQuery("select p from Pessoa p where p.login = '" + login + "' and p.senha = '" + senha + "'").getSingleResult();
		
		entityTransaction.commit();
		entityManager.close();
		return pessoa;
	}

}
