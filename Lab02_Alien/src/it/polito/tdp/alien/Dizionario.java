package it.polito.tdp.alien;

import java.util.HashMap;
import java.util.Map;

public class Dizionario {

	
	private Map<String, Vocabolo> dizionario;
	
	
	
	public Dizionario() {
		this.dizionario=new HashMap<>();
	}

	public void AggiungiParola(String pAliena, String p) {
		
		if(this.dizionario.containsKey(pAliena)) {
		Vocabolo vocabolo = this.dizionario.get(pAliena);
		vocabolo.getParoleTradotte().add(p);
		
		}else {
			Vocabolo vocabolo = new Vocabolo(pAliena);
			vocabolo.getParoleTradotte().add(p);
			this.dizionario.put(pAliena, vocabolo);
		}
		
	}
	
	public String CercaParola (String pAliena) {
		String result = "";
		if(dizionario.containsKey(pAliena)) {
			Vocabolo vocabolo = this.dizionario.get(pAliena);
			for (String pTradotta : vocabolo.getParoleTradotte()) {
				result+=pTradotta+"\n";
				
			}
		}else result="parola non presente nel vocabolario";
		return result;
	}
	
	
	
	
}
