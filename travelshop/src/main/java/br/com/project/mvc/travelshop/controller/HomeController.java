package br.com.project.mvc.travelshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.project.mvc.travelshop.model.Demand;
import br.com.project.mvc.travelshop.repository.DemandRepository;

@Controller
public class HomeController {

	@Autowired
	private DemandRepository demandRepository;

	@GetMapping("/home")
	public String home(Model model) {

		List<Demand> demands = demandRepository.findAll();

		model.addAttribute("demands", demands);

		System.out.println("bati no Controler");
		return "home";
	}
}
