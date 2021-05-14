package exercicios;

public class Resultado {

	public static void main(String[] args) {
		int a = 1% 2;
		
		System.out.println(a);
		
		int b = 3;
		int c = 4;
		
		int resultado = valor(b, c);
		
		System.out.println(resultado);
	}
	
	public static int valor(int a, int b) {
		
		if(a<b) {
			return valor(b, a);
		}
		else if(b!=0) {
			return a+valor(a,b-1);
		}
		else {
			return 0;
		}
	}
}
