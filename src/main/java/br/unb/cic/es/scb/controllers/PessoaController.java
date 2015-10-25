package br.unb.cic.es.scb.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.unb.cic.es.scb.dao.PessoaDAO;
import br.unb.cic.es.scb.models.Pessoa;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaDAO dao;
	
	 public PessoaController() {
		System.out.println("Teste!");
	}
	@RequestMapping(value="/criar", method = RequestMethod.POST)
	public String criar(@ModelAttribute("pessoa") Pessoa pessoa) {
		
		dao.persist(pessoa);
		
		return "index";
		
		
	}
	
	@RequestMapping("/teste")
	public String newPerson(Map<String, Object> model) {
		
		model.put("pessoa", new Pessoa());
		
		return "index";
	}
}
