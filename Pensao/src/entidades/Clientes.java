package entidades;

public class Clientes {
	private String nome;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Clientes(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Nome=" + nome + ", Email=" + email;
	}
	
}
