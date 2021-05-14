package entidades;

public class Empregado {
	public String nome;
	public double salarioBruto;
	public double imposto;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void aumentarSalario(double aumento) {
		this.salarioBruto = this.salarioBruto * (1 + 0.01 * aumento);
	}

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public String toString() {
		return nome + " $ " + String.format("%.2f", salarioLiquido());

	}

}
