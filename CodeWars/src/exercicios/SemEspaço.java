package exercicios;

public class SemEspašo {
	static String noSpace(final String x) {
		String noSpaceStr = x.replaceAll("\\s", "");
		return noSpaceStr;
	}
}
