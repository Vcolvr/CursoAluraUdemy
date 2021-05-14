package exercicios;

public class Capitalize {
	public String toJadenCase(String phrase) {
		if (phrase != null && !phrase.isEmpty()) {
			String[] arr = phrase.split(" ");
			String result = null;
			String tmp = "";
			for (String anArr : arr) {
				String str = anArr.replaceFirst(anArr.substring(0, 1), anArr.substring(0, 1).toUpperCase());
				tmp += (str + " ");
				result = tmp.substring(0, tmp.length() - 1);
			}
			return result;
		}
		return null;
	}
}
