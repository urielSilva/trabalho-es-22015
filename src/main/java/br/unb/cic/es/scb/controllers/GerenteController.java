package br.unb.cic.es.scb.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.unb.cic.es.scb.dao.GerenteDAO;
import br.unb.cic.es.scb.models.Gerente;

@Controller
public class GerenteController {

	@Autowired
	private GerenteDAO dao;
	
	@RequestMapping(value = "/newManager", method = RequestMethod.GET)
	public String novo(Map<String, Object> model) {
		model.put("gerente", new Gerente());
		return "gerente/new";
	}

	@RequestMapping(value = "/createManager", method = RequestMethod.POST)
	public String criar(@ModelAttribute("gerente") Gerente gerente, RedirectAttributes ra) {
		dao.persist(gerente);
		
		ra.addFlashAttribute("message", "Cadastro realizado com sucesso!");
		return "redirect:/";
	}
	
	public void listar() {

	}

	public void excluir() {

	}

	public void editar() {

	}

	public void mostrar() {

	}


}
