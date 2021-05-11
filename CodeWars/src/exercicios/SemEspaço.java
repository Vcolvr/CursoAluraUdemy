package exercicios;

public class SemEspaço {
	static String noSpace(final String x) {
		String noSpaceStr = x.replaceAll("\\s", "");
		return noSpaceStr;
	}
}
