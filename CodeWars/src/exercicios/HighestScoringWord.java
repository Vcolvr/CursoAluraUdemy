package exercicios;

public class HighestScoringWord {
	public static int valor(String s) {

		int scorePalavra = 0;

		String[] letras = s.split("(?!^)");
		for (String letra : letras) {
			if (letra.equals("a")) {
				scorePalavra = scorePalavra + 1;
			}
			if (letra.equals("b")) {
				scorePalavra = scorePalavra + 2;
			}
			if (letra.equals("c")) {
				scorePalavra = scorePalavra + 3;
			}
			if (letra.equals("d")) {
				scorePalavra = scorePalavra + 4;
			}
			if (letra.equals("e")) {
				scorePalavra = scorePalavra + 5;
			}
			if (letra.equals("f")) {
				scorePalavra = scorePalavra + 6;
			}
			if (letra.equals("g")) {
				scorePalavra = scorePalavra + 7;
			}
			if (letra.equals("h")) {
				scorePalavra = scorePalavra + 8;
			}
			if (letra.equals("i")) {
				scorePalavra = scorePalavra + 9;
			}
			if (letra.equals("j")) {
				scorePalavra = scorePalavra + 10;
			}
			if (letra.equals("k")) {
				scorePalavra = scorePalavra + 11;
			}
			if (letra.equals("l")) {
				scorePalavra = scorePalavra + 12;
			}
			if (letra.equals("m")) {
				scorePalavra = scorePalavra + 13;
			}
			if (letra.equals("n")) {
				scorePalavra = scorePalavra + 14;
			}
			if (letra.equals("o")) {
				scorePalavra = scorePalavra + 15;
			}
			if (letra.equals("p")) {
				scorePalavra = scorePalavra + 16;
			}
			if (letra.equals("q")) {
				scorePalavra = scorePalavra + 17;
			}
			if (letra.equals("r")) {
				scorePalavra = scorePalavra + 18;
			}
			if (letra.equals("s")) {
				scorePalavra = scorePalavra + 19;
			}
			if (letra.equals("t")) {
				scorePalavra = scorePalavra + 20;
			}
			if (letra.equals("u")) {
				scorePalavra = scorePalavra + 21;
			}
			if (letra.equals("v")) {
				scorePalavra = scorePalavra + 22;
			}
			if (letra.equals("w")) {
				scorePalavra = scorePalavra + 23;
			}
			if (letra.equals("x")) {
				scorePalavra = scorePalavra + 24;
			}
			if (letra.equals("y")) {
				scorePalavra = scorePalavra + 25;
			}
			if (letra.equals("z")) {
				scorePalavra = scorePalavra + 26;
			}

		}

		return scorePalavra;
	}
	
	public static String high(String s) {
		String maiorPalavra = "";	
		String[] palavras = s.split(" ");
		int maiorScore = 0;
		
		for(String palavra : palavras) {
			int score = valor(palavra);
			if(score > maiorScore) {
				maiorScore = score;
				maiorPalavra = palavra;
			}
		}
		
		return maiorPalavra;
	}
}
