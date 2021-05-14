package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroFuncionarios;
	
	public PessoaJuridica(Integer numeroFuncionarios) {
		super();
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}


	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public double imposto() {
		if(numeroFuncionarios > 10) {
			return rendaAnual * 0.14;
		}
		else {
			return rendaAnual *0.16;
		}
	}
}
