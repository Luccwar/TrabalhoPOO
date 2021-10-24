package classes.java;

import java.util.Objects;

public abstract class Pessoa {
	protected String nome;
	protected String datanasc;
	protected String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf, datanasc, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(datanasc, other.datanasc)
				&& Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", datanasc=" + datanasc + ", cpf=" + cpf + "]";
	}
	
	
}
