package com.treinandoTestes.testesTDD;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.teste.ParOuImpar;

public class Banana {
	@Test
	void contextLoads() {
	}

	@Test
	public void testPar(){
		ParOuImpar poi = new ParOuImpar();
		
		int a = 4;
		String resultado = poi.validaPar(a);
		assertEquals("par", resultado);
	}
	
	@Test
	public void testeImpar(){
		int a = 3;
		ParOuImpar poi = new ParOuImpar();
		String resultado = poi.validaPar(a);
		assertEquals("impar", resultado);
	}
	
	@Test
	public void testAssertArrayEquals() {
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();
		assertArrayEquals(esperado, atual);
	}
	
	@Test
    public void method() {
       org.junit.Assert.assertTrue(new ArrayList<Object>().isEmpty());
    }
}
