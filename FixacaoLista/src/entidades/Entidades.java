package entidades;

public class Entidades {
	private Integer id;
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public double getSalario() {
		return salario;
	}
	public void aumento(double aumento) {
		salario = salario * (1 + 0.01 * aumento);
	}
	
	public Entidades(Integer id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public String toString() {
		return  + id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
	

}
