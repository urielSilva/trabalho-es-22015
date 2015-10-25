package br.unb.cic.es.scb.dao;

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
	private SessionFactory sessionFactory;
	
	public void persist(Pessoa p) {
		getSession().persist(p);
	}
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
