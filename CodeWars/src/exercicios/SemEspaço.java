package exercicios;

public class SemEspa�o {
	static String noSpace(final String x) {
		String noSpaceStr = x.replaceAll("\\s", "");
		return noSpaceStr;
	}
}
