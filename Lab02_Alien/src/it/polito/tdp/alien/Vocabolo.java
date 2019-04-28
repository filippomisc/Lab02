package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class Vocabolo {
	

	private String parolaAliena;
	private List<String> paroleTradotte;
	
	public Vocabolo(String parolaAliena) {
		super();
		this.parolaAliena = parolaAliena;
		this.paroleTradotte = new ArrayList<>();
	}

	public String getParolaAliena() {
		return parolaAliena;
	}

	public void setParolaAliena(String parolaAliena) {
		this.parolaAliena = parolaAliena;
	}

	public List<String> getParoleTradotte() {
		return paroleTradotte;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vocabolo [parolaAliena=");
		builder.append(parolaAliena);
		builder.append(", paroleTradotte=");
		builder.append(paroleTradotte);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parolaAliena == null) ? 0 : parolaAliena.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vocabolo other = (Vocabolo) obj;
		if (parolaAliena == null) {
			if (other.parolaAliena != null)
				return false;
		} else if (!parolaAliena.equals(other.parolaAliena))
			return false;
		return true;
	}
	
	
	
	
}
