package exercicios;

public class Desemvowel {
	public static String disemvowel(String str) {
		String[] letras = str.split("(?!^)");
		String semVogais = "";

		for (String letra : letras) {
			if (!letra.equals("a") && !letra.equals("e") && !letra.equals("i") && !letra.equals("o")
					&& !letra.equals("u") && !letra.equals("A") && !letra.equals("E") && !letra.equals("I") && !letra.equals("O")
					&& !letra.equals("U")) {
				semVogais = semVogais + letra;
			}
		}

		return semVogais;
	}
}
