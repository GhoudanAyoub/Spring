package eval2.ghouda.vehicule.controller;

import eval2.ghouda.vehicule.repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/marquos")
public class MarqueControllerMvc {
	@Autowired
	MarqueRepository marqueRepository;
	
	@GetMapping
	public String afficherTout(Model m) {
		m.addAttribute("marques", marqueRepository.findAll());
		return "classes/liste";
	}
}
