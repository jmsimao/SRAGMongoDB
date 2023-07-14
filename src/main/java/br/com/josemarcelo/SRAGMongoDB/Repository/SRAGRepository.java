package br.com.josemarcelo.SRAGMongoDB.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.josemarcelo.SRAGMongoDB.Model.SRAG;

public interface SRAGRepository extends MongoRepository<SRAG, String> {

	Iterable<SRAG> findBycsSexo(String csSexo);
	
	Iterable<SRAG> findByidMunicip(String municipio);
	
}
