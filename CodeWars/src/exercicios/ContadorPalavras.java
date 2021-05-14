package exercicios;

public class ContadorPalavras {
	public static int countRepetition(String speech, String word)  {
		int contador = 0;
		
		String[] palavras = speech.split(" ");
		
		for(String palavra: palavras) {
			if(palavra.equals(word)) {
				contador++;
			}
		}
		
		return contador;
	}
}
