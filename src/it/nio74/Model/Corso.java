package it.nio74.Model;

public class Corso {
	
	private int crediti;
	private String nome;
	private int pd;
	
	public Corso(int codins, int crediti, String nome, int pd) {
		super();
		this.codins = codins;
		this.crediti = crediti;
		this.nome = nome;
		this.pd = pd;
	}
	
	private int codins;
	public int getCodins() {
		return codins;
	}
	public void setCodins(int codins) {
		this.codins = codins;
	}
	public int getCrediti() {
		return crediti;
	}
	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPd() {
		return pd;
	}
	public void setPd(int pd) {
		this.pd = pd;
	}
	
	@Override
	public String toString() {
		return String.format("Corso [codins=%s, crediti=%s, nome=%s, pd=%s]", codins, crediti, nome, pd);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codins;
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
		Corso other = (Corso) obj;
		if (codins != other.codins)
			return false;
		return true;
	}
	

	
}
