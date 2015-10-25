package br.unb.cic.es.scb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.unb.cic.es.scb.models.Pessoa;

@Repository
@Transactional
public class PessoaDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public void persist(Pessoa p) {
		getEntityManager().persist(p);
	}
	
	private EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
