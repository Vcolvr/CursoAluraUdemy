package exercicioInterfaces.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Contratos implements ContratosInterface {
	private Integer numeroDoContrato;
	private Date dataDoContrato;
	private Double valorTotal;

	List<Double> quotas = new ArrayList<>();
	private Double valorParcela;
	private Double parcelaComJuros;
	Calendar myCal = Calendar.getInstance();
	
	
	public List<Double> getQuotas() {
		return quotas;
	}

	public void setQuotas(List<Double> quotas) {
		this.quotas = quotas;
	}

	public Contratos() {
	}

	public Contratos(Integer numeroDoContrato, Date dataDoContrato, Double valorTotal) {
		this.numeroDoContrato = numeroDoContrato;
		this.dataDoContrato = dataDoContrato;
		this.valorTotal = valorTotal;
	}

	public Integer getNumeroDoContrato() {
		return numeroDoContrato;
	}

	public void setNumeroDoContrato(Integer numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}

	public Date getDataDoContrato() {
		return dataDoContrato;
	}

	public void setDataDoContrato(Date dataDoContrato) {
		this.dataDoContrato = dataDoContrato;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public Double parcela(Integer autoincremento, Integer quantidadeDeParcelas) {
		valorParcela = valorTotal / quantidadeDeParcelas;
		parcelaComJuros = valorParcela * (1 + (0.01 * autoincremento));
		parcelaComJuros = parcelaComJuros + (0.02 * parcelaComJuros);
		quotas.add(parcelaComJuros);
		return parcelaComJuros;
	}

	@Override
	public Date mesesDoContrato() {
		myCal.setTime(dataDoContrato);
		myCal.add(Calendar.MONTH, +1);
		return dataDoContrato = myCal.getTime();
	}

	public void imprimirValor(int posicao) {
		System.out.println(quotas.get(posicao));
	}
}
