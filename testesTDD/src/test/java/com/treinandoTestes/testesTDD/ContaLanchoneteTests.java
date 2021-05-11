package com.treinandoTestes.testesTDD;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.teste.ContaLanchonete;
import com.teste.ParOuImpar;

public class ContaLanchoneteTests {

	@Test
	public void testCodigo() {
		int codigo = 1;
		int quantidade = 3;
		
		ContaLanchonete cl = new ContaLanchonete();
		
		double resultado = cl.precoAPagar(codigo, quantidade);
		assertEquals(12, resultado, 0.0000);
	}
	
	
}
