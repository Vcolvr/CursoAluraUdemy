package entidades;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double media() {
		return (nota1 * 30 + nota2 * 35 + nota3 * 35) / 100;
	}

	public String toString() {
		return nome + ", Final grade: " + String.format("%.2f%n", media());
	}

	public double missingPoints() {
		if (media() < 60.0) {
			return 60.0 - media();
		} else {
			return 0.0;
		}

	}
}
