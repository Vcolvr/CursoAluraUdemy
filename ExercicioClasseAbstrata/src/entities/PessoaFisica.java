package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	public PessoaFisica(Double gastosSaude) {
		super();
		this.gastosSaude = gastosSaude;
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		if(gastosSaude <= 20000) {
			return rendaAnual * 0.15 - 0.5 * gastosSaude;
		}
		else {
			return rendaAnual * 0.25 - 0.5 * gastosSaude;
		}
	}
	
}
