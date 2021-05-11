package exercicioInterfaces.entities;

import java.util.Date;

public interface ContratosInterface {
	
	public Date mesesDoContrato();
	public Double parcela(Integer autoincremento, Integer quantidadeDeParcelas);
}
