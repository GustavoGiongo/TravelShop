package br.com.project.mvc.travelshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.project.mvc.travelshop.model.Demand;
import br.com.project.mvc.travelshop.repository.DemandRepository;
import br.com.project.mvc.travelshop.dto.RequestNewOrder;

@Controller
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private DemandRepository demandRepository;
	
	

	@GetMapping("form")
	public String form() {
		return "order/form";
	}
	
	@PostMapping("new")
	public String newOrder(@Valid RequestNewOrder request, BindingResult result) {
		if(result.hasErrors()) {
			return "order/form";
		}
		Demand demand = request.toDemand();
		demandRepository.save(demand);
		return "order/form";
		
	}
}
