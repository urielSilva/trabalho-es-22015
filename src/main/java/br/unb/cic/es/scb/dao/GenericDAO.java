package br.unb.cic.es.scb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class GenericDAO <T>{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	private EntityManager em;
	
	public void persist(T... obj) {
		for(T o : obj) {
			getEntityManager().persist(o);
		}
	}
	
	public void merge(T... obj) {
		for(T o : obj) {
			getEntityManager().merge(o);
		}
	}
	
	public void remove(T obj) {
		getEntityManager().remove(obj);
	}
	
	public List<T> findAll(Class<T> clazz) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(clazz);
		cq.from(clazz);
		return getEntityManager().createQuery(cq).getResultList();
		
	}
	
	
	protected EntityManager getEntityManager() {
		return em == null ? entityManagerFactory.createEntityManager() : em;
	}
}
