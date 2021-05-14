package com.treinandoTestes.testesTDD;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.teste.ContaLanchonete;
import com.teste.MediaAluno;

public class ContaLanchoneteTests {

	@Test
	public void testCodigo() {
		int codigo = 1;
		int quantidade = 3;
		
		ContaLanchonete cl = new ContaLanchonete();
		
		double resultado = cl.precoAPagar(codigo, quantidade);
		assertEquals(12, resultado, 0.0000);
	}
	
	@Test
	public void testMediaDeAluno() {
		double nota1 = 7;
		double nota2 = 10;
		double nota3 = 5;
		double nota4 = 8;
		
		MediaAluno ma = new MediaAluno();
		double notaMedia = ma.calcularMedia(nota1, nota2, nota3, nota4);
		
		assertEquals(7.5, notaMedia, 0.000);
	}
	
	@Test
	public void testPedido() {
		String nome = "Vitor";
		int pedido1 = 1;
		int pedido2 = 2;
		int pedido3 = 3;
		
		ContaLanchonete conta = new ContaLanchonete();
		String resultado = conta.novoPedido(nome, pedido1, pedido2, pedido3);
		assertEquals("Vitor, seu pedido foi de: fritas, hamburguer e refrigerante.", resultado);
	}
	
}
