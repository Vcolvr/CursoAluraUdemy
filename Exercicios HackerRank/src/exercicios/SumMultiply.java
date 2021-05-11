package exercicios;

import java.io.*;
import java.util.*;
import java.math.*;

public class SumMultiply {
	
	private static final Scanner sc = new Scanner(System.in);
	
	 public static void main(String[] args) {
	        String a = sc.nextLine();
	        String b = sc.nextLine();
	        
	        BigInteger A = new BigInteger(a);
	        BigInteger B = new BigInteger(b);
	        
	        BigInteger c = A.add(B);
	        BigInteger C = B.multiply(A);
	 }
}
