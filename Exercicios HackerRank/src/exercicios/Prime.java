package exercicios;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Prime {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        int a = Integer.parseInt(n);
        
        
        BigInteger p = new BigInteger(n);
        if(p.isProbablePrime(a) == true) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
        scanner.close();
    }
}