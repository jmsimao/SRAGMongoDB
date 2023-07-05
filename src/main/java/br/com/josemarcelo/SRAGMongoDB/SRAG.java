package br.com.josemarcelo.SRAGMongoDB;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SRAG_SAO")
public class SRAG {

	@Id
	private String _id;
	private String dt_notific;
	private String id_municip;
	private String id_unidade;
	private String cs_sexo;

	
	public SRAG(String dt_notific, String id_municip, String id_unidade, String cs_sexo) {
		this.dt_notific = dt_notific;
		this.id_municip = id_municip;
		this.id_unidade = id_unidade;
		this.cs_sexo = cs_sexo;
	}

	public String getDt_notific() {
		return dt_notific;
	}

	public String getIdMunicip() {
		return id_municip;
	}

	public String getId_unidade() {
		return id_unidade;
	}

	public String get_id() {
		return _id;
	}

	public String getCs_sexo() {
		return cs_sexo;
	}
	
}
