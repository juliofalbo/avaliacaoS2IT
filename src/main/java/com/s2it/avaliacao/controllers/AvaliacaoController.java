package com.s2it.avaliacao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.s2it.avaliacao.services.Questao8Service;

@Controller
public class AvaliacaoController {

	@Autowired
	private Questao8Service questao8Service;
	
	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}

	@RequestMapping("/questao8")
	public String questao8(Model model) {
		return "questao8";
	}
	
	@RequestMapping(value = "/resolverQuestao8", method = RequestMethod.POST)
	public String resolverQuestao8(Model model, @RequestParam("numeroA") int numeroA, @RequestParam("numeroB") int numeroB) {
		
		Integer numeroC = questao8Service.calcularQuestao8(numeroA, numeroB);
		
		model.addAttribute("numeroA", numeroA);
		model.addAttribute("numeroB", numeroB);
		model.addAttribute("numeroC", numeroC);
		return "questao8";
	}
	
	@RequestMapping("/questao9")
	public String questao9(Model model) {
		model.addAttribute("novoUsuario", "");
		return "questao9";
	}
	
}
