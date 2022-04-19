package eval2.ghouda.vehicule.controller;

import eval2.ghouda.vehicule.model.Marque;
import eval2.ghouda.vehicule.repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marques")
public class MarqueControllerRest {
	@Autowired
	MarqueRepository marqueRepository;
	
	@PostMapping
	public void ajouter(@RequestBody Marque m) {
		marqueRepository.save(m);
	}
	
	@GetMapping
	public List<Marque> afficherTout() {
		return marqueRepository.findAll();
	}
	
}
