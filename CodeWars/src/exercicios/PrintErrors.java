package exercicios;

public class PrintErrors {
	public static String printerError(String s) {
		String[] letras = s.split("(?!^)");
		Integer counter = 0;
		Integer total = s.length();
		for (String e : letras) {
			if (e.equals("a")) {
				counter++;
			}
			if (e.equals("b")) {
				counter++;
			}
			if (e.equals("c")) {
				counter++;
			}
			if (e.equals("d")) {
				counter++;
			}
			if (e.equals("e")) {
				counter++;
			}
			if (e.equals("f")) {
				counter++;
			}
			if (e.equals("g")) {
				counter++;
			}
			if (e.equals("h")) {
				counter++;
			}
			if (e.equals("i")) {
				counter++;
			}
			if (e.equals("j")) {
				counter++;
			}
			if (e.equals("k")) {
				counter++;
			}
			if (e.equals("l")) {
				counter++;
			}
			if (e.equals("m")) {
				counter++;
			}

		}
		
		String resultado = counter.toString() + "/" + total.toString();
		
		return resultado;

	}
}
