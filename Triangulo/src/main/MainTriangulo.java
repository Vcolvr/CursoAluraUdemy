package main;

import java.util.Scanner;

import entidades.EntidadeTriangulo;

import java.util.Locale;

public class MainTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		EntidadeTriangulo x;
		x = new EntidadeTriangulo();
		
		System.out.println("Enter width of the triangle:");
		x.width = sc.nextDouble();
		System.out.println("Enter height of the triangle:");
		x.height = sc.nextDouble();
		
		System.out.printf("AREA  =  %.2f%n", x.area());
		System.out.printf("PERIMETER  =   %.2f%n", x.perimeter());	 
		System.out.printf ("DIAGONAL  =    %.2f%n", x.diagonal());
		sc.close();
	}

}
