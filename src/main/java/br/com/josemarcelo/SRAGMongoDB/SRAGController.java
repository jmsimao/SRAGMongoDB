package br.com.josemarcelo.SRAGMongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/srag")
public class SRAGController {

	@Autowired
	private SRAGRepository sragRepository;
		
	@GetMapping("/data")
	public Iterable<SRAG> getSrag() {
		return sragRepository.findAll();
	}
	
	/*
	@GetMapping("/data/{sexo}")
	public Iterable<SRAG> getCsSexo(@PathVariable String sexo) {
		return sragRepository.findBycsSexo(sexo);
	}
	*/
}
