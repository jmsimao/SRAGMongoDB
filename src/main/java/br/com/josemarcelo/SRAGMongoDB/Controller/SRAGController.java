package br.com.josemarcelo.SRAGMongoDB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.josemarcelo.SRAGMongoDB.Model.SRAG;
import br.com.josemarcelo.SRAGMongoDB.Repository.SRAGRepository;

@RestController
@RequestMapping("/srag")
public class SRAGController {

	@Autowired
	private SRAGRepository sragRepository;
		
	@GetMapping("/data")
	public Iterable<SRAG> getSrag() {
		return sragRepository.findAll();
	}
	
	
	@GetMapping("/data/sexo/{sexo}")
	public Iterable<SRAG> getCsSexo(@PathVariable String sexo) {
		return sragRepository.findBycsSexo(sexo);
	}
	
	@GetMapping("/data/municipio/{municipio}")
	public Iterable<SRAG> getMuniciopio(@PathVariable String municipio) {
		return this.sragRepository.findByidMunicip(municipio);
	}
	
}
