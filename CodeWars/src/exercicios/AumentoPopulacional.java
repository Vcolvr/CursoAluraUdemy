package exercicios;

public class AumentoPopulacional {
	public static int nbYear(int p0, double percent, int aug, int p) {
		int year = 0;
		int population = p0;
		while (population < p) {
			population += population * percent / 100 + aug;
			year++;
		}
		return year;
	}
}
