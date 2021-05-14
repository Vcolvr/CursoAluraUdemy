package main;

public class VinteEUm {

	public static void main(String[] args) {
	      int digits = 0;
	      
	      while (digits < 10000) {
	    	  if(sumDigits(digits)==21) {
	    		  System.out.println("The number is " + digits + ". The sum is " + sumDigits(digits) + ".");  
	    	  }
	    	  digits ++;
	      }
	}

	public static int sumDigits(long n) {
		int result = 0;
		
		while (n > 0) {
			result += n % 10;
			n /= 10;
		}
		return result;
	}
}