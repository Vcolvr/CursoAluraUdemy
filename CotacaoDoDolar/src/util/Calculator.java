package util;

public class Calculator {

	public static final double IOF = 1.06;

	public double cotacao;
	public double dolares;

	public Calculator(double cotacao, double dolares) {
		this.cotacao = cotacao;
		this.dolares = dolares;
	}

	public double valor() {
		return cotacao * dolares * IOF;
	}

	public String toString() {
		return "Amount to be paid in reais = " + String.format("%.2f%n", valor());
	}
}
