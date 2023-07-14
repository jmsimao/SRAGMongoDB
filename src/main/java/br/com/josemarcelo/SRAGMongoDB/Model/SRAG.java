package br.com.josemarcelo.SRAGMongoDB.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SRAG")
public class SRAG {

	@Id
	private String _id;
	private String dtNotific;
	private String idMunicip;
	private String idUnidade;
	private String csSexo;
	private String fabCov1;

	
	public SRAG(String dtNotific, String idMunicip, String idUnidade, String csSexo,
			String fabCov1) {
		this.dtNotific = dtNotific;
		this.idMunicip = idMunicip;
		this.idUnidade = idUnidade;
		this.csSexo = csSexo;
		this.fabCov1 = fabCov1;
	}

	public String getFabCov1() {
		return fabCov1;
	}

	public String getDtNotific() {
		return dtNotific;
	}

	public String getIdMunicip() {
		return idMunicip;
	}

	public String getIdUnidade() {
		return idUnidade;
	}

	public String get_id() {
		return _id;
	}

	public String getCsSexo() {
		return csSexo;
	}
	
}
