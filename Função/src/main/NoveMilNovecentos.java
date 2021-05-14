package main;

import java.util.ArrayList;
import java.util.List;

public class NoveMilNovecentos {
	
	public static void main(String[] args) {
	    int maximo = 7;
	    
	    System.out.println(calculation(maximo));
	}
	
	public static List<Integer> calculation(int maxDigit) {
        int digitos = 1;
        int atual = 1;
        int digito = 0;
        int resultado = 0;
        
        List<Integer> calculo = new ArrayList<>();
        
        while (digitos <= 10000) {
            
            

            calculo.add(digitos);
            
            digitos++;
            resultado = 0;
        }
		return calculo;
    }
}

