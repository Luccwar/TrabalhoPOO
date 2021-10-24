package classes.java;

import java.util.Arrays;
import java.util.Objects;

public class Admin extends Pessoa {
	private String[] permiss�es;
	private String login;
	private String email;
	private String emailSecundario;
	private String senha;
	public String[] getPermiss�es() {
		return permiss�es;
	}
	public void setPermiss�es(String[] permiss�es) {
		this.permiss�es = permiss�es;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailSecundario() {
		return emailSecundario;
	}
	public void setEmailSecundario(String emailSecundario) {
		this.emailSecundario = emailSecundario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(permiss�es);
		result = prime * result + Objects.hash(email, emailSecundario, login, senha);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(email, other.email) && Objects.equals(emailSecundario, other.emailSecundario)
				&& Objects.equals(login, other.login) && Arrays.equals(permiss�es, other.permiss�es)
				&& Objects.equals(senha, other.senha);
	}
	@Override
	public String toString() {
		return "Admin [permiss�es=" + Arrays.toString(permiss�es) + ", login=" + login + ", email=" + email
				+ ", emailSecundario=" + emailSecundario + ", senha=" + senha + "]";
	}
	
	
}
