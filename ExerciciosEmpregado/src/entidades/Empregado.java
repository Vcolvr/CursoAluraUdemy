package entidades;

public class Empregado {
	public String nome;
	public double salarioBruto;
	public double imposto;

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
