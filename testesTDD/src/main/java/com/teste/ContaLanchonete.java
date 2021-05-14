package com.teste;

public class ContaLanchonete {
	public double precoAPagar(int codigo, int quantidade) {
		double total = 0;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}

		else if (codigo == 2) {
			total = quantidade * 4.5;
		}

		else if (codigo == 3) {
			total = quantidade * 5.0;
		}

		else if (codigo == 4) {
			total = quantidade * 2.0;
		}

		else if (codigo == 5) {
			total = quantidade * 1.5;
		}

		else {
			System.out.println("ERROR");
		}
		return total;
	}
	
	public String novoPedido(String nome, int... pedido) {
		String pedidoFinal = nome + ", seu pedido foi de: ";
		int contador = 0;
		
		for(int e: pedido) {
			
			if(e == 1) {
				pedidoFinal+= "fritas";
			}
			else if(e == 2) {
				pedidoFinal+= "hamburguer";
			}
			else {
				pedidoFinal+= "refrigerante";
			}
			
			contador++;
			
			if(contador == pedido.length - 1) {
				pedidoFinal+= " e ";
			}
			else if(contador == pedido.length) {
				pedidoFinal+= ".";
			}
			else {
				pedidoFinal+= ", ";
			}
			
		}
		
		return pedidoFinal;
	}
}
