package exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaInteirosCombinados {
	public static List<Integer> FindCommonElements(List<Integer> array1, List<Integer> array2) {
		List<Integer> list = new ArrayList<>();
		
		for(Integer numero: array1) {
			for(Integer combinado: array2) {
				if(numero == combinado) {
					if(list.contains(numero)) {
						list.add(numero);
					}
					
				}
			}
		}
		return list;
	}
	
	
	
}
