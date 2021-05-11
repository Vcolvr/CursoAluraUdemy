package exercicios;

public class Vogais {
	 public static int getCount(String str) {
		    int vowelsCount = 0;
		    String[] letras = str.split("(?!^)");
		    
		    for(String e : letras) {
		      if(e.equals("a")) {
		    	  vowelsCount++;
		      }
		      if(e.equals("e")) {
		    	  vowelsCount++;
		      }
		      if(e.equals("i")) {
		    	  vowelsCount++;
		      }
		      if(e.equals("o")) {
		    	  vowelsCount++;
		      }
		      if(e.equals("u")) {
		    	  vowelsCount++;
		      }
		    }
		    return vowelsCount;
		  }
}
