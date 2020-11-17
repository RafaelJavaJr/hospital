package br.com.hospital;

import org.junit.Test;

import jpautil.JPAUtil;

public class TesteHibernate {
	
	@Test
	public void testeHibernate() {
		JPAUtil.getEntityManager();
	}

}


