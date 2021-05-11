package exercicios;

public class ContadorPalavras2 {
	public static int countRepetition(String speech, String word)  {
		int contador = 0;
		
		String[] array = speech.split(" ");
		
	    if(array!=null) {
	        for(int i=0; i< array.length; i++) {
	             if(array[i]!=null) {
	                 if(array[i].equals(word)) {
	                      contador++;
	                 }
	             }
	        }
	    } else {
	            System.out.println("Vetor nulo");
	    }
	    return contador;
	}
	 
}
