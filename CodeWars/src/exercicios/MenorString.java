package exercicios;

public class MenorString {
	public static int findShort(String s) {
		String[] shorts = s.split(" ");
		
		String menor = shorts[0];
		
		for(String e : shorts) {
			if(e.length() <= menor.length()) {
				menor = e;
			}
		}
		
		int resultado = menor.length();
		
		return resultado;
    }
}
