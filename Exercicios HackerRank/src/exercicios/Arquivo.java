package exercicios;

import java.util.Scanner;

public class Arquivo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	int number = 1;

	while(sc.hasNext())
	{
		String line = sc.nextLine();
		System.out.println(number + " " + line);
		number++;
	}
	
	sc.close();
	/*
	 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
	 * class should be named Solution.
	 */
}}
