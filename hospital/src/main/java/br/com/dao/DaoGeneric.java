package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.jpautil.JPAUtil;

public class DaoGeneric<E> {

	private EntityManager entityManager = JPAUtil.getEntityManager();

	public void salvar(E entidade) {

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		entityManager.persist(entidade);

		transaction.commit();

	}

	public E UpdateMerge(E entidade) {

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		E entidadeSalva = entityManager.merge(entidade);

		transaction.commit();
		return entidadeSalva;
	}

	public E pesquisar(E entidade) {
		Object id = JPAUtil.getPrimarykey(entidade);

		E e = (E) entityManager.find(entidade.getClass(), id);

		return e;
	}

	public E pesquisar(Long id, Class<E> entidade) {

		E e = (E) entityManager.find(entidade, id);

		return e;
	}

	public void deletarProId(E entidade) {
		Object id = JPAUtil.getPrimarykey(entidade);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		entityManager.createNativeQuery(
				"delete from " + entidade.getClass().getSimpleName().toLowerCase() +
				" where id = " + id).executeUpdate();//faz delete
		transaction.commit();
	}
	
	public List<E> listar(Class<E> entidade){
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		List<E> lista = entityManager.createQuery("from " + entidade.getName()).getResultList();
		transaction.commit();
		return lista;
		
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public List<E> getListEntity(Class<E> entidade){
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		List<E> retorno = entityManager.createQuery("from " + entidade.getName()).getResultList();
		
		entityTransaction.commit();
		entityManager.close();
		
		return retorno;
	}

}
